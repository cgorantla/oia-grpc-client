/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2020 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2020 The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is a registered trademark of The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * OpenNMS(R) is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with OpenNMS(R).  If not, see:
 *      http://www.gnu.org/licenses/
 *
 * For more information contact:
 *     OpenNMS(R) Licensing <license@opennms.org>
 *     http://www.opennms.org/
 *     http://www.opennms.com/
 *******************************************************************************/

package org.opennms.integration.grpc.client;

import static io.grpc.ConnectivityState.READY;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.opennms.integration.api.v1.proto.AlarmLifecycleListenerGrpc;
import org.opennms.integration.api.v1.proto.Alarms;
import org.opennms.integration.api.v1.proto.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.grpc.ConnectivityState;
import io.grpc.ManagedChannel;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;
import io.grpc.stub.StreamObserver;

public class AlarmConsumer {

    private static final Logger LOG = LoggerFactory.getLogger(AlarmConsumer.class);
    private static final Integer DEFAULT_RETRIES = 20;
    private static final Integer DEFAULT_TIMEOUT = 3000;
    private ManagedChannel channel;
    private AlarmLifecycleListenerGrpc.AlarmLifecycleListenerStub asyncStub;
    private StreamObserver<Alarms.AlarmsList> alarmSnapShotObserver = new AlarmSnapShotObserver();
    private StreamObserver<Model.Alarm> newOrUpdatedObserver = new NewOrUpdatedObserver();
    private StreamObserver<Alarms.DeleteAlarm> deleteAlarmStreamObserver = new DeleteAlarmObserver();

    public void start(String host, Integer port) throws IOException {

        NettyChannelBuilder channelBuilder = NettyChannelBuilder.forAddress(host, port)
                .keepAliveWithoutCalls(true);

        channel = channelBuilder.usePlaintext().build();
        if (READY.equals(retrieveChannelState())) {
            LOG.info("Channel is in ready state");
            asyncStub = AlarmLifecycleListenerGrpc.newStub(channel);
            asyncStub.handleAlarmSnapshot(Model.Empty.newBuilder().build(), alarmSnapShotObserver);
            asyncStub.handleNewOrUpdatedAlarm(Model.Empty.newBuilder().build(), newOrUpdatedObserver);
            asyncStub.handleDeletedAlarm(Model.Empty.newBuilder().build(), deleteAlarmStreamObserver);
        } else {
            LOG.error("Couldn't connect to gRPC server, exiting.");
            throw new IOException("Couldn't connect to server");
        }
    }

    public void stop() {
        channel.shutdown();
    }

    public void awaitTermination() throws InterruptedException {
        channel.awaitTermination(30, TimeUnit.HOURS);
    }

    private ConnectivityState retrieveChannelState() {
        int retries = DEFAULT_RETRIES;
        ConnectivityState state = null;
        while (retries > 0) {
            state = channel.getState(true);
            if (!state.equals(READY)) {
                LOG.warn("gRPC Server is not in ready state, current state {}, retrying..", state);
                waitBeforeRetrying(DEFAULT_TIMEOUT);
                retries--;
            } else {
                break;
            }
        }
        return state;
    }

    private void waitBeforeRetrying(long timeout) {
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            LOG.warn("Sleep was interrupted", e);
        }
    }

    private class AlarmSnapShotObserver implements StreamObserver<Alarms.AlarmsList> {

        @Override
        public void onNext(Alarms.AlarmsList value) {
            LOG.info("Current snapshot of all alarms: \n");
            value.getAlarmsList().forEach(alarm -> LOG.info(alarm.toString()));
        }

        @Override
        public void onError(Throwable t) {

        }

        @Override
        public void onCompleted() {

        }
    }

    private class NewOrUpdatedObserver implements StreamObserver<Model.Alarm> {

        @Override
        public void onNext(Model.Alarm value) {
            LOG.info("Received an alarm {} \n", value.toString());
        }

        @Override
        public void onError(Throwable t) {

        }

        @Override
        public void onCompleted() {

        }
    }

    private class DeleteAlarmObserver implements StreamObserver<Alarms.DeleteAlarm> {

        @Override
        public void onNext(Alarms.DeleteAlarm value) {
            LOG.info("Received Deleted Alarm with ID : {} and Reduction key : {}", value.getId(), value.getReductionKey());
        }

        @Override
        public void onError(Throwable t) {

        }

        @Override
        public void onCompleted() {

        }
    }

}

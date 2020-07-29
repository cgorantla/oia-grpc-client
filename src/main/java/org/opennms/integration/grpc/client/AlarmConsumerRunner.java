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

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AlarmConsumerRunner {

    private static final Logger LOG = LoggerFactory.getLogger(AlarmConsumerRunner.class);

    public static void main(String[] args) {
        AlarmConsumer consumer = new AlarmConsumer();
        String host = "localhost";
        Integer port = 8991;
        if(args.length >= 2) {
            host = args[0];
            port = Integer.parseInt(args[1]);
        }
        // Add shutdown hook.
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                System.err.println("shutting down gRPC client");
                consumer.stop();
                System.err.println("gRPC client shut down");
            }
        });
        try {
            consumer.start(host, port);
            LOG.info("gRPC client started");
            consumer.awaitTermination();
        } catch (InterruptedException | IOException e) {
            LOG.error("Exception while running gRPC client", e);
            consumer.stop();
        }

    }
}

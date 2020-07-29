package org.opennms.integration.api.v1.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: alarms.proto")
public final class AlarmLifecycleListenerGrpc {

  private AlarmLifecycleListenerGrpc() {}

  public static final String SERVICE_NAME = "oia.AlarmLifecycleListener";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.opennms.integration.api.v1.proto.Model.Empty,
      org.opennms.integration.api.v1.proto.Alarms.AlarmsList> getHandleAlarmSnapshotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HandleAlarmSnapshot",
      requestType = org.opennms.integration.api.v1.proto.Model.Empty.class,
      responseType = org.opennms.integration.api.v1.proto.Alarms.AlarmsList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opennms.integration.api.v1.proto.Model.Empty,
      org.opennms.integration.api.v1.proto.Alarms.AlarmsList> getHandleAlarmSnapshotMethod() {
    io.grpc.MethodDescriptor<org.opennms.integration.api.v1.proto.Model.Empty, org.opennms.integration.api.v1.proto.Alarms.AlarmsList> getHandleAlarmSnapshotMethod;
    if ((getHandleAlarmSnapshotMethod = AlarmLifecycleListenerGrpc.getHandleAlarmSnapshotMethod) == null) {
      synchronized (AlarmLifecycleListenerGrpc.class) {
        if ((getHandleAlarmSnapshotMethod = AlarmLifecycleListenerGrpc.getHandleAlarmSnapshotMethod) == null) {
          AlarmLifecycleListenerGrpc.getHandleAlarmSnapshotMethod = getHandleAlarmSnapshotMethod =
              io.grpc.MethodDescriptor.<org.opennms.integration.api.v1.proto.Model.Empty, org.opennms.integration.api.v1.proto.Alarms.AlarmsList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HandleAlarmSnapshot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opennms.integration.api.v1.proto.Model.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opennms.integration.api.v1.proto.Alarms.AlarmsList.getDefaultInstance()))
              .setSchemaDescriptor(new AlarmLifecycleListenerMethodDescriptorSupplier("HandleAlarmSnapshot"))
              .build();
        }
      }
    }
    return getHandleAlarmSnapshotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opennms.integration.api.v1.proto.Model.Empty,
      org.opennms.integration.api.v1.proto.Model.Alarm> getHandleNewOrUpdatedAlarmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HandleNewOrUpdatedAlarm",
      requestType = org.opennms.integration.api.v1.proto.Model.Empty.class,
      responseType = org.opennms.integration.api.v1.proto.Model.Alarm.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.opennms.integration.api.v1.proto.Model.Empty,
      org.opennms.integration.api.v1.proto.Model.Alarm> getHandleNewOrUpdatedAlarmMethod() {
    io.grpc.MethodDescriptor<org.opennms.integration.api.v1.proto.Model.Empty, org.opennms.integration.api.v1.proto.Model.Alarm> getHandleNewOrUpdatedAlarmMethod;
    if ((getHandleNewOrUpdatedAlarmMethod = AlarmLifecycleListenerGrpc.getHandleNewOrUpdatedAlarmMethod) == null) {
      synchronized (AlarmLifecycleListenerGrpc.class) {
        if ((getHandleNewOrUpdatedAlarmMethod = AlarmLifecycleListenerGrpc.getHandleNewOrUpdatedAlarmMethod) == null) {
          AlarmLifecycleListenerGrpc.getHandleNewOrUpdatedAlarmMethod = getHandleNewOrUpdatedAlarmMethod =
              io.grpc.MethodDescriptor.<org.opennms.integration.api.v1.proto.Model.Empty, org.opennms.integration.api.v1.proto.Model.Alarm>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HandleNewOrUpdatedAlarm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opennms.integration.api.v1.proto.Model.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opennms.integration.api.v1.proto.Model.Alarm.getDefaultInstance()))
              .setSchemaDescriptor(new AlarmLifecycleListenerMethodDescriptorSupplier("HandleNewOrUpdatedAlarm"))
              .build();
        }
      }
    }
    return getHandleNewOrUpdatedAlarmMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opennms.integration.api.v1.proto.Model.Empty,
      org.opennms.integration.api.v1.proto.Alarms.DeleteAlarm> getHandleDeletedAlarmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HandleDeletedAlarm",
      requestType = org.opennms.integration.api.v1.proto.Model.Empty.class,
      responseType = org.opennms.integration.api.v1.proto.Alarms.DeleteAlarm.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.opennms.integration.api.v1.proto.Model.Empty,
      org.opennms.integration.api.v1.proto.Alarms.DeleteAlarm> getHandleDeletedAlarmMethod() {
    io.grpc.MethodDescriptor<org.opennms.integration.api.v1.proto.Model.Empty, org.opennms.integration.api.v1.proto.Alarms.DeleteAlarm> getHandleDeletedAlarmMethod;
    if ((getHandleDeletedAlarmMethod = AlarmLifecycleListenerGrpc.getHandleDeletedAlarmMethod) == null) {
      synchronized (AlarmLifecycleListenerGrpc.class) {
        if ((getHandleDeletedAlarmMethod = AlarmLifecycleListenerGrpc.getHandleDeletedAlarmMethod) == null) {
          AlarmLifecycleListenerGrpc.getHandleDeletedAlarmMethod = getHandleDeletedAlarmMethod =
              io.grpc.MethodDescriptor.<org.opennms.integration.api.v1.proto.Model.Empty, org.opennms.integration.api.v1.proto.Alarms.DeleteAlarm>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HandleDeletedAlarm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opennms.integration.api.v1.proto.Model.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opennms.integration.api.v1.proto.Alarms.DeleteAlarm.getDefaultInstance()))
              .setSchemaDescriptor(new AlarmLifecycleListenerMethodDescriptorSupplier("HandleDeletedAlarm"))
              .build();
        }
      }
    }
    return getHandleDeletedAlarmMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AlarmLifecycleListenerStub newStub(io.grpc.Channel channel) {
    return new AlarmLifecycleListenerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AlarmLifecycleListenerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AlarmLifecycleListenerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AlarmLifecycleListenerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AlarmLifecycleListenerFutureStub(channel);
  }

  /**
   */
  public static abstract class AlarmLifecycleListenerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Periodically invoked with the complete list of alarms as stored in the database.
     * </pre>
     */
    public void handleAlarmSnapshot(org.opennms.integration.api.v1.proto.Model.Empty request,
        io.grpc.stub.StreamObserver<org.opennms.integration.api.v1.proto.Alarms.AlarmsList> responseObserver) {
      asyncUnimplementedUnaryCall(getHandleAlarmSnapshotMethod(), responseObserver);
    }

    /**
     * <pre>
     * Invoked when an alarm is created or updated.
     * Defined as server stream, so the client can get the new or updated alarm immediately.
     * </pre>
     */
    public void handleNewOrUpdatedAlarm(org.opennms.integration.api.v1.proto.Model.Empty request,
        io.grpc.stub.StreamObserver<org.opennms.integration.api.v1.proto.Model.Alarm> responseObserver) {
      asyncUnimplementedUnaryCall(getHandleNewOrUpdatedAlarmMethod(), responseObserver);
    }

    /**
     * <pre>
     * Invoked when an alarm is deleted.
     * Defined as server stream, so the client can get the deleted alarm immediately.
     * </pre>
     */
    public void handleDeletedAlarm(org.opennms.integration.api.v1.proto.Model.Empty request,
        io.grpc.stub.StreamObserver<org.opennms.integration.api.v1.proto.Alarms.DeleteAlarm> responseObserver) {
      asyncUnimplementedUnaryCall(getHandleDeletedAlarmMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHandleAlarmSnapshotMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opennms.integration.api.v1.proto.Model.Empty,
                org.opennms.integration.api.v1.proto.Alarms.AlarmsList>(
                  this, METHODID_HANDLE_ALARM_SNAPSHOT)))
          .addMethod(
            getHandleNewOrUpdatedAlarmMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.opennms.integration.api.v1.proto.Model.Empty,
                org.opennms.integration.api.v1.proto.Model.Alarm>(
                  this, METHODID_HANDLE_NEW_OR_UPDATED_ALARM)))
          .addMethod(
            getHandleDeletedAlarmMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.opennms.integration.api.v1.proto.Model.Empty,
                org.opennms.integration.api.v1.proto.Alarms.DeleteAlarm>(
                  this, METHODID_HANDLE_DELETED_ALARM)))
          .build();
    }
  }

  /**
   */
  public static final class AlarmLifecycleListenerStub extends io.grpc.stub.AbstractStub<AlarmLifecycleListenerStub> {
    private AlarmLifecycleListenerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AlarmLifecycleListenerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlarmLifecycleListenerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AlarmLifecycleListenerStub(channel, callOptions);
    }

    /**
     * <pre>
     * Periodically invoked with the complete list of alarms as stored in the database.
     * </pre>
     */
    public void handleAlarmSnapshot(org.opennms.integration.api.v1.proto.Model.Empty request,
        io.grpc.stub.StreamObserver<org.opennms.integration.api.v1.proto.Alarms.AlarmsList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHandleAlarmSnapshotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Invoked when an alarm is created or updated.
     * Defined as server stream, so the client can get the new or updated alarm immediately.
     * </pre>
     */
    public void handleNewOrUpdatedAlarm(org.opennms.integration.api.v1.proto.Model.Empty request,
        io.grpc.stub.StreamObserver<org.opennms.integration.api.v1.proto.Model.Alarm> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getHandleNewOrUpdatedAlarmMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Invoked when an alarm is deleted.
     * Defined as server stream, so the client can get the deleted alarm immediately.
     * </pre>
     */
    public void handleDeletedAlarm(org.opennms.integration.api.v1.proto.Model.Empty request,
        io.grpc.stub.StreamObserver<org.opennms.integration.api.v1.proto.Alarms.DeleteAlarm> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getHandleDeletedAlarmMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AlarmLifecycleListenerBlockingStub extends io.grpc.stub.AbstractStub<AlarmLifecycleListenerBlockingStub> {
    private AlarmLifecycleListenerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AlarmLifecycleListenerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlarmLifecycleListenerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AlarmLifecycleListenerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Periodically invoked with the complete list of alarms as stored in the database.
     * </pre>
     */
    public org.opennms.integration.api.v1.proto.Alarms.AlarmsList handleAlarmSnapshot(org.opennms.integration.api.v1.proto.Model.Empty request) {
      return blockingUnaryCall(
          getChannel(), getHandleAlarmSnapshotMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Invoked when an alarm is created or updated.
     * Defined as server stream, so the client can get the new or updated alarm immediately.
     * </pre>
     */
    public java.util.Iterator<org.opennms.integration.api.v1.proto.Model.Alarm> handleNewOrUpdatedAlarm(
        org.opennms.integration.api.v1.proto.Model.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getHandleNewOrUpdatedAlarmMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Invoked when an alarm is deleted.
     * Defined as server stream, so the client can get the deleted alarm immediately.
     * </pre>
     */
    public java.util.Iterator<org.opennms.integration.api.v1.proto.Alarms.DeleteAlarm> handleDeletedAlarm(
        org.opennms.integration.api.v1.proto.Model.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getHandleDeletedAlarmMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AlarmLifecycleListenerFutureStub extends io.grpc.stub.AbstractStub<AlarmLifecycleListenerFutureStub> {
    private AlarmLifecycleListenerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AlarmLifecycleListenerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlarmLifecycleListenerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AlarmLifecycleListenerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Periodically invoked with the complete list of alarms as stored in the database.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opennms.integration.api.v1.proto.Alarms.AlarmsList> handleAlarmSnapshot(
        org.opennms.integration.api.v1.proto.Model.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getHandleAlarmSnapshotMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HANDLE_ALARM_SNAPSHOT = 0;
  private static final int METHODID_HANDLE_NEW_OR_UPDATED_ALARM = 1;
  private static final int METHODID_HANDLE_DELETED_ALARM = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AlarmLifecycleListenerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AlarmLifecycleListenerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HANDLE_ALARM_SNAPSHOT:
          serviceImpl.handleAlarmSnapshot((org.opennms.integration.api.v1.proto.Model.Empty) request,
              (io.grpc.stub.StreamObserver<org.opennms.integration.api.v1.proto.Alarms.AlarmsList>) responseObserver);
          break;
        case METHODID_HANDLE_NEW_OR_UPDATED_ALARM:
          serviceImpl.handleNewOrUpdatedAlarm((org.opennms.integration.api.v1.proto.Model.Empty) request,
              (io.grpc.stub.StreamObserver<org.opennms.integration.api.v1.proto.Model.Alarm>) responseObserver);
          break;
        case METHODID_HANDLE_DELETED_ALARM:
          serviceImpl.handleDeletedAlarm((org.opennms.integration.api.v1.proto.Model.Empty) request,
              (io.grpc.stub.StreamObserver<org.opennms.integration.api.v1.proto.Alarms.DeleteAlarm>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AlarmLifecycleListenerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AlarmLifecycleListenerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.opennms.integration.api.v1.proto.Alarms.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AlarmLifecycleListener");
    }
  }

  private static final class AlarmLifecycleListenerFileDescriptorSupplier
      extends AlarmLifecycleListenerBaseDescriptorSupplier {
    AlarmLifecycleListenerFileDescriptorSupplier() {}
  }

  private static final class AlarmLifecycleListenerMethodDescriptorSupplier
      extends AlarmLifecycleListenerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AlarmLifecycleListenerMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AlarmLifecycleListenerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AlarmLifecycleListenerFileDescriptorSupplier())
              .addMethod(getHandleAlarmSnapshotMethod())
              .addMethod(getHandleNewOrUpdatedAlarmMethod())
              .addMethod(getHandleDeletedAlarmMethod())
              .build();
        }
      }
    }
    return result;
  }
}

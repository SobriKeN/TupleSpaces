package pt.ulisboa.tecnico.sequencer.contract;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: Sequencer.proto")
public final class SequencerGrpc {

  private SequencerGrpc() {}

  public static final String SERVICE_NAME = "pt.ulisboa.tecnico.sequencer.contract.Sequencer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<pt.ulisboa.tecnico.sequencer.contract.SequencerOuterClass.GetSeqNumberRequest,
      pt.ulisboa.tecnico.sequencer.contract.SequencerOuterClass.GetSeqNumberResponse> getGetSeqNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getSeqNumber",
      requestType = pt.ulisboa.tecnico.sequencer.contract.SequencerOuterClass.GetSeqNumberRequest.class,
      responseType = pt.ulisboa.tecnico.sequencer.contract.SequencerOuterClass.GetSeqNumberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pt.ulisboa.tecnico.sequencer.contract.SequencerOuterClass.GetSeqNumberRequest,
      pt.ulisboa.tecnico.sequencer.contract.SequencerOuterClass.GetSeqNumberResponse> getGetSeqNumberMethod() {
    io.grpc.MethodDescriptor<pt.ulisboa.tecnico.sequencer.contract.SequencerOuterClass.GetSeqNumberRequest, pt.ulisboa.tecnico.sequencer.contract.SequencerOuterClass.GetSeqNumberResponse> getGetSeqNumberMethod;
    if ((getGetSeqNumberMethod = SequencerGrpc.getGetSeqNumberMethod) == null) {
      synchronized (SequencerGrpc.class) {
        if ((getGetSeqNumberMethod = SequencerGrpc.getGetSeqNumberMethod) == null) {
          SequencerGrpc.getGetSeqNumberMethod = getGetSeqNumberMethod =
              io.grpc.MethodDescriptor.<pt.ulisboa.tecnico.sequencer.contract.SequencerOuterClass.GetSeqNumberRequest, pt.ulisboa.tecnico.sequencer.contract.SequencerOuterClass.GetSeqNumberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getSeqNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ulisboa.tecnico.sequencer.contract.SequencerOuterClass.GetSeqNumberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ulisboa.tecnico.sequencer.contract.SequencerOuterClass.GetSeqNumberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SequencerMethodDescriptorSupplier("getSeqNumber"))
              .build();
        }
      }
    }
    return getGetSeqNumberMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SequencerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SequencerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SequencerStub>() {
        @java.lang.Override
        public SequencerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SequencerStub(channel, callOptions);
        }
      };
    return SequencerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SequencerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SequencerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SequencerBlockingStub>() {
        @java.lang.Override
        public SequencerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SequencerBlockingStub(channel, callOptions);
        }
      };
    return SequencerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SequencerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SequencerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SequencerFutureStub>() {
        @java.lang.Override
        public SequencerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SequencerFutureStub(channel, callOptions);
        }
      };
    return SequencerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SequencerImplBase implements io.grpc.BindableService {

    /**
     */
    public void getSeqNumber(pt.ulisboa.tecnico.sequencer.contract.SequencerOuterClass.GetSeqNumberRequest request,
        io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.sequencer.contract.SequencerOuterClass.GetSeqNumberResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSeqNumberMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetSeqNumberMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                pt.ulisboa.tecnico.sequencer.contract.SequencerOuterClass.GetSeqNumberRequest,
                pt.ulisboa.tecnico.sequencer.contract.SequencerOuterClass.GetSeqNumberResponse>(
                  this, METHODID_GET_SEQ_NUMBER)))
          .build();
    }
  }

  /**
   */
  public static final class SequencerStub extends io.grpc.stub.AbstractAsyncStub<SequencerStub> {
    private SequencerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SequencerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SequencerStub(channel, callOptions);
    }

    /**
     */
    public void getSeqNumber(pt.ulisboa.tecnico.sequencer.contract.SequencerOuterClass.GetSeqNumberRequest request,
        io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.sequencer.contract.SequencerOuterClass.GetSeqNumberResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSeqNumberMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SequencerBlockingStub extends io.grpc.stub.AbstractBlockingStub<SequencerBlockingStub> {
    private SequencerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SequencerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SequencerBlockingStub(channel, callOptions);
    }

    /**
     */
    public pt.ulisboa.tecnico.sequencer.contract.SequencerOuterClass.GetSeqNumberResponse getSeqNumber(pt.ulisboa.tecnico.sequencer.contract.SequencerOuterClass.GetSeqNumberRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSeqNumberMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SequencerFutureStub extends io.grpc.stub.AbstractFutureStub<SequencerFutureStub> {
    private SequencerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SequencerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SequencerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pt.ulisboa.tecnico.sequencer.contract.SequencerOuterClass.GetSeqNumberResponse> getSeqNumber(
        pt.ulisboa.tecnico.sequencer.contract.SequencerOuterClass.GetSeqNumberRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSeqNumberMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SEQ_NUMBER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SequencerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SequencerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SEQ_NUMBER:
          serviceImpl.getSeqNumber((pt.ulisboa.tecnico.sequencer.contract.SequencerOuterClass.GetSeqNumberRequest) request,
              (io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.sequencer.contract.SequencerOuterClass.GetSeqNumberResponse>) responseObserver);
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

  private static abstract class SequencerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SequencerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return pt.ulisboa.tecnico.sequencer.contract.SequencerOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Sequencer");
    }
  }

  private static final class SequencerFileDescriptorSupplier
      extends SequencerBaseDescriptorSupplier {
    SequencerFileDescriptorSupplier() {}
  }

  private static final class SequencerMethodDescriptorSupplier
      extends SequencerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SequencerMethodDescriptorSupplier(String methodName) {
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
      synchronized (SequencerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SequencerFileDescriptorSupplier())
              .addMethod(getGetSeqNumberMethod())
              .build();
        }
      }
    }
    return result;
  }
}

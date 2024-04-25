package pt.ulisboa.tecnico.nameserver.contract;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: NameServer.proto")
public final class NameServerGrpc {

  private NameServerGrpc() {}

  public static final String SERVICE_NAME = "pt.ulisboa.tecnico.nameserver.contract.NameServer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.RegisterRequest,
      pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.RegisterResponse> getRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "register",
      requestType = pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.RegisterRequest.class,
      responseType = pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.RegisterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.RegisterRequest,
      pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.RegisterResponse> getRegisterMethod() {
    io.grpc.MethodDescriptor<pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.RegisterRequest, pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.RegisterResponse> getRegisterMethod;
    if ((getRegisterMethod = NameServerGrpc.getRegisterMethod) == null) {
      synchronized (NameServerGrpc.class) {
        if ((getRegisterMethod = NameServerGrpc.getRegisterMethod) == null) {
          NameServerGrpc.getRegisterMethod = getRegisterMethod =
              io.grpc.MethodDescriptor.<pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.RegisterRequest, pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.RegisterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "register"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.RegisterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.RegisterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NameServerMethodDescriptorSupplier("register"))
              .build();
        }
      }
    }
    return getRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.LookupRequest,
      pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.LookupResponse> getLookupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "lookup",
      requestType = pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.LookupRequest.class,
      responseType = pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.LookupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.LookupRequest,
      pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.LookupResponse> getLookupMethod() {
    io.grpc.MethodDescriptor<pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.LookupRequest, pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.LookupResponse> getLookupMethod;
    if ((getLookupMethod = NameServerGrpc.getLookupMethod) == null) {
      synchronized (NameServerGrpc.class) {
        if ((getLookupMethod = NameServerGrpc.getLookupMethod) == null) {
          NameServerGrpc.getLookupMethod = getLookupMethod =
              io.grpc.MethodDescriptor.<pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.LookupRequest, pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.LookupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "lookup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.LookupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.LookupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NameServerMethodDescriptorSupplier("lookup"))
              .build();
        }
      }
    }
    return getLookupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.DeleteRequest,
      pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.DeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delete",
      requestType = pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.DeleteRequest.class,
      responseType = pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.DeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.DeleteRequest,
      pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.DeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.DeleteRequest, pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.DeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = NameServerGrpc.getDeleteMethod) == null) {
      synchronized (NameServerGrpc.class) {
        if ((getDeleteMethod = NameServerGrpc.getDeleteMethod) == null) {
          NameServerGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.DeleteRequest, pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.DeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.DeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.DeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NameServerMethodDescriptorSupplier("delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NameServerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NameServerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NameServerStub>() {
        @java.lang.Override
        public NameServerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NameServerStub(channel, callOptions);
        }
      };
    return NameServerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NameServerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NameServerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NameServerBlockingStub>() {
        @java.lang.Override
        public NameServerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NameServerBlockingStub(channel, callOptions);
        }
      };
    return NameServerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NameServerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NameServerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NameServerFutureStub>() {
        @java.lang.Override
        public NameServerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NameServerFutureStub(channel, callOptions);
        }
      };
    return NameServerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class NameServerImplBase implements io.grpc.BindableService {

    /**
     */
    public void register(pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.RegisterRequest request,
        io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.RegisterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterMethod(), responseObserver);
    }

    /**
     */
    public void lookup(pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.LookupRequest request,
        io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.LookupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLookupMethod(), responseObserver);
    }

    /**
     */
    public void delete(pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.DeleteRequest request,
        io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.DeleteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.RegisterRequest,
                pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.RegisterResponse>(
                  this, METHODID_REGISTER)))
          .addMethod(
            getLookupMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.LookupRequest,
                pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.LookupResponse>(
                  this, METHODID_LOOKUP)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.DeleteRequest,
                pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.DeleteResponse>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   */
  public static final class NameServerStub extends io.grpc.stub.AbstractAsyncStub<NameServerStub> {
    private NameServerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NameServerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NameServerStub(channel, callOptions);
    }

    /**
     */
    public void register(pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.RegisterRequest request,
        io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.RegisterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lookup(pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.LookupRequest request,
        io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.LookupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLookupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.DeleteRequest request,
        io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.DeleteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class NameServerBlockingStub extends io.grpc.stub.AbstractBlockingStub<NameServerBlockingStub> {
    private NameServerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NameServerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NameServerBlockingStub(channel, callOptions);
    }

    /**
     */
    public pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.RegisterResponse register(pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.RegisterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.LookupResponse lookup(pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.LookupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLookupMethod(), getCallOptions(), request);
    }

    /**
     */
    public pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.DeleteResponse delete(pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.DeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NameServerFutureStub extends io.grpc.stub.AbstractFutureStub<NameServerFutureStub> {
    private NameServerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NameServerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NameServerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.RegisterResponse> register(
        pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.RegisterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.LookupResponse> lookup(
        pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.LookupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLookupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.DeleteResponse> delete(
        pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.DeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER = 0;
  private static final int METHODID_LOOKUP = 1;
  private static final int METHODID_DELETE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NameServerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NameServerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER:
          serviceImpl.register((pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.RegisterRequest) request,
              (io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.RegisterResponse>) responseObserver);
          break;
        case METHODID_LOOKUP:
          serviceImpl.lookup((pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.LookupRequest) request,
              (io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.LookupResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.DeleteRequest) request,
              (io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.DeleteResponse>) responseObserver);
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

  private static abstract class NameServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NameServerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NameServer");
    }
  }

  private static final class NameServerFileDescriptorSupplier
      extends NameServerBaseDescriptorSupplier {
    NameServerFileDescriptorSupplier() {}
  }

  private static final class NameServerMethodDescriptorSupplier
      extends NameServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NameServerMethodDescriptorSupplier(String methodName) {
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
      synchronized (NameServerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NameServerFileDescriptorSupplier())
              .addMethod(getRegisterMethod())
              .addMethod(getLookupMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}

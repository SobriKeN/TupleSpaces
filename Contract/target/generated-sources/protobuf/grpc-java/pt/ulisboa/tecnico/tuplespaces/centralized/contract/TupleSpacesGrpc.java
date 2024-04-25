package pt.ulisboa.tecnico.tuplespaces.centralized.contract;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: TupleSpaces_Centralized.proto")
public final class TupleSpacesGrpc {

  private TupleSpacesGrpc() {}

  public static final String SERVICE_NAME = "pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpaces";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.PutRequest,
      pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.PutResponse> getPutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "put",
      requestType = pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.PutRequest.class,
      responseType = pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.PutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.PutRequest,
      pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.PutResponse> getPutMethod() {
    io.grpc.MethodDescriptor<pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.PutRequest, pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.PutResponse> getPutMethod;
    if ((getPutMethod = TupleSpacesGrpc.getPutMethod) == null) {
      synchronized (TupleSpacesGrpc.class) {
        if ((getPutMethod = TupleSpacesGrpc.getPutMethod) == null) {
          TupleSpacesGrpc.getPutMethod = getPutMethod =
              io.grpc.MethodDescriptor.<pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.PutRequest, pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.PutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "put"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.PutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.PutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TupleSpacesMethodDescriptorSupplier("put"))
              .build();
        }
      }
    }
    return getPutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.ReadRequest,
      pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.ReadResponse> getReadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "read",
      requestType = pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.ReadRequest.class,
      responseType = pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.ReadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.ReadRequest,
      pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.ReadResponse> getReadMethod() {
    io.grpc.MethodDescriptor<pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.ReadRequest, pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.ReadResponse> getReadMethod;
    if ((getReadMethod = TupleSpacesGrpc.getReadMethod) == null) {
      synchronized (TupleSpacesGrpc.class) {
        if ((getReadMethod = TupleSpacesGrpc.getReadMethod) == null) {
          TupleSpacesGrpc.getReadMethod = getReadMethod =
              io.grpc.MethodDescriptor.<pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.ReadRequest, pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.ReadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "read"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.ReadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.ReadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TupleSpacesMethodDescriptorSupplier("read"))
              .build();
        }
      }
    }
    return getReadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.TakeRequest,
      pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.TakeResponse> getTakeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "take",
      requestType = pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.TakeRequest.class,
      responseType = pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.TakeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.TakeRequest,
      pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.TakeResponse> getTakeMethod() {
    io.grpc.MethodDescriptor<pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.TakeRequest, pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.TakeResponse> getTakeMethod;
    if ((getTakeMethod = TupleSpacesGrpc.getTakeMethod) == null) {
      synchronized (TupleSpacesGrpc.class) {
        if ((getTakeMethod = TupleSpacesGrpc.getTakeMethod) == null) {
          TupleSpacesGrpc.getTakeMethod = getTakeMethod =
              io.grpc.MethodDescriptor.<pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.TakeRequest, pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.TakeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "take"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.TakeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.TakeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TupleSpacesMethodDescriptorSupplier("take"))
              .build();
        }
      }
    }
    return getTakeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.getTupleSpacesStateRequest,
      pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.getTupleSpacesStateResponse> getGetTupleSpacesStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTupleSpacesState",
      requestType = pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.getTupleSpacesStateRequest.class,
      responseType = pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.getTupleSpacesStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.getTupleSpacesStateRequest,
      pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.getTupleSpacesStateResponse> getGetTupleSpacesStateMethod() {
    io.grpc.MethodDescriptor<pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.getTupleSpacesStateRequest, pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.getTupleSpacesStateResponse> getGetTupleSpacesStateMethod;
    if ((getGetTupleSpacesStateMethod = TupleSpacesGrpc.getGetTupleSpacesStateMethod) == null) {
      synchronized (TupleSpacesGrpc.class) {
        if ((getGetTupleSpacesStateMethod = TupleSpacesGrpc.getGetTupleSpacesStateMethod) == null) {
          TupleSpacesGrpc.getGetTupleSpacesStateMethod = getGetTupleSpacesStateMethod =
              io.grpc.MethodDescriptor.<pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.getTupleSpacesStateRequest, pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.getTupleSpacesStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getTupleSpacesState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.getTupleSpacesStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.getTupleSpacesStateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TupleSpacesMethodDescriptorSupplier("getTupleSpacesState"))
              .build();
        }
      }
    }
    return getGetTupleSpacesStateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TupleSpacesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TupleSpacesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TupleSpacesStub>() {
        @java.lang.Override
        public TupleSpacesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TupleSpacesStub(channel, callOptions);
        }
      };
    return TupleSpacesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TupleSpacesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TupleSpacesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TupleSpacesBlockingStub>() {
        @java.lang.Override
        public TupleSpacesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TupleSpacesBlockingStub(channel, callOptions);
        }
      };
    return TupleSpacesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TupleSpacesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TupleSpacesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TupleSpacesFutureStub>() {
        @java.lang.Override
        public TupleSpacesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TupleSpacesFutureStub(channel, callOptions);
        }
      };
    return TupleSpacesFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TupleSpacesImplBase implements io.grpc.BindableService {

    /**
     */
    public void put(pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.PutRequest request,
        io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.PutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPutMethod(), responseObserver);
    }

    /**
     */
    public void read(pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.ReadRequest request,
        io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.ReadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadMethod(), responseObserver);
    }

    /**
     */
    public void take(pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.TakeRequest request,
        io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.TakeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTakeMethod(), responseObserver);
    }

    /**
     */
    public void getTupleSpacesState(pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.getTupleSpacesStateRequest request,
        io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.getTupleSpacesStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTupleSpacesStateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPutMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.PutRequest,
                pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.PutResponse>(
                  this, METHODID_PUT)))
          .addMethod(
            getReadMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.ReadRequest,
                pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.ReadResponse>(
                  this, METHODID_READ)))
          .addMethod(
            getTakeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.TakeRequest,
                pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.TakeResponse>(
                  this, METHODID_TAKE)))
          .addMethod(
            getGetTupleSpacesStateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.getTupleSpacesStateRequest,
                pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.getTupleSpacesStateResponse>(
                  this, METHODID_GET_TUPLE_SPACES_STATE)))
          .build();
    }
  }

  /**
   */
  public static final class TupleSpacesStub extends io.grpc.stub.AbstractAsyncStub<TupleSpacesStub> {
    private TupleSpacesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TupleSpacesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TupleSpacesStub(channel, callOptions);
    }

    /**
     */
    public void put(pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.PutRequest request,
        io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.PutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void read(pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.ReadRequest request,
        io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.ReadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void take(pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.TakeRequest request,
        io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.TakeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTakeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTupleSpacesState(pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.getTupleSpacesStateRequest request,
        io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.getTupleSpacesStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTupleSpacesStateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TupleSpacesBlockingStub extends io.grpc.stub.AbstractBlockingStub<TupleSpacesBlockingStub> {
    private TupleSpacesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TupleSpacesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TupleSpacesBlockingStub(channel, callOptions);
    }

    /**
     */
    public pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.PutResponse put(pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.PutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPutMethod(), getCallOptions(), request);
    }

    /**
     */
    public pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.ReadResponse read(pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.ReadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadMethod(), getCallOptions(), request);
    }

    /**
     */
    public pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.TakeResponse take(pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.TakeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTakeMethod(), getCallOptions(), request);
    }

    /**
     */
    public pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.getTupleSpacesStateResponse getTupleSpacesState(pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.getTupleSpacesStateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTupleSpacesStateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TupleSpacesFutureStub extends io.grpc.stub.AbstractFutureStub<TupleSpacesFutureStub> {
    private TupleSpacesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TupleSpacesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TupleSpacesFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.PutResponse> put(
        pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.PutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.ReadResponse> read(
        pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.ReadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.TakeResponse> take(
        pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.TakeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTakeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.getTupleSpacesStateResponse> getTupleSpacesState(
        pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.getTupleSpacesStateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTupleSpacesStateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PUT = 0;
  private static final int METHODID_READ = 1;
  private static final int METHODID_TAKE = 2;
  private static final int METHODID_GET_TUPLE_SPACES_STATE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TupleSpacesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TupleSpacesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PUT:
          serviceImpl.put((pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.PutRequest) request,
              (io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.PutResponse>) responseObserver);
          break;
        case METHODID_READ:
          serviceImpl.read((pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.ReadRequest) request,
              (io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.ReadResponse>) responseObserver);
          break;
        case METHODID_TAKE:
          serviceImpl.take((pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.TakeRequest) request,
              (io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.TakeResponse>) responseObserver);
          break;
        case METHODID_GET_TUPLE_SPACES_STATE:
          serviceImpl.getTupleSpacesState((pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.getTupleSpacesStateRequest) request,
              (io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.getTupleSpacesStateResponse>) responseObserver);
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

  private static abstract class TupleSpacesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TupleSpacesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return pt.ulisboa.tecnico.tuplespaces.centralized.contract.TupleSpacesCentralized.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TupleSpaces");
    }
  }

  private static final class TupleSpacesFileDescriptorSupplier
      extends TupleSpacesBaseDescriptorSupplier {
    TupleSpacesFileDescriptorSupplier() {}
  }

  private static final class TupleSpacesMethodDescriptorSupplier
      extends TupleSpacesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TupleSpacesMethodDescriptorSupplier(String methodName) {
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
      synchronized (TupleSpacesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TupleSpacesFileDescriptorSupplier())
              .addMethod(getPutMethod())
              .addMethod(getReadMethod())
              .addMethod(getTakeMethod())
              .addMethod(getGetTupleSpacesStateMethod())
              .build();
        }
      }
    }
    return result;
  }
}

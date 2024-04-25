package pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: TupleSpaces_Replica_TotalOrder.proto")
public final class TupleSpacesReplicaGrpc {

  private TupleSpacesReplicaGrpc() {}

  public static final String SERVICE_NAME = "pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplica";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.PutRequest,
      pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.PutResponse> getPutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "put",
      requestType = pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.PutRequest.class,
      responseType = pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.PutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.PutRequest,
      pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.PutResponse> getPutMethod() {
    io.grpc.MethodDescriptor<pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.PutRequest, pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.PutResponse> getPutMethod;
    if ((getPutMethod = TupleSpacesReplicaGrpc.getPutMethod) == null) {
      synchronized (TupleSpacesReplicaGrpc.class) {
        if ((getPutMethod = TupleSpacesReplicaGrpc.getPutMethod) == null) {
          TupleSpacesReplicaGrpc.getPutMethod = getPutMethod =
              io.grpc.MethodDescriptor.<pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.PutRequest, pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.PutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "put"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.PutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.PutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TupleSpacesReplicaMethodDescriptorSupplier("put"))
              .build();
        }
      }
    }
    return getPutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.ReadRequest,
      pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.ReadResponse> getReadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "read",
      requestType = pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.ReadRequest.class,
      responseType = pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.ReadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.ReadRequest,
      pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.ReadResponse> getReadMethod() {
    io.grpc.MethodDescriptor<pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.ReadRequest, pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.ReadResponse> getReadMethod;
    if ((getReadMethod = TupleSpacesReplicaGrpc.getReadMethod) == null) {
      synchronized (TupleSpacesReplicaGrpc.class) {
        if ((getReadMethod = TupleSpacesReplicaGrpc.getReadMethod) == null) {
          TupleSpacesReplicaGrpc.getReadMethod = getReadMethod =
              io.grpc.MethodDescriptor.<pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.ReadRequest, pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.ReadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "read"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.ReadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.ReadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TupleSpacesReplicaMethodDescriptorSupplier("read"))
              .build();
        }
      }
    }
    return getReadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.TakeRequest,
      pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.TakeResponse> getTakeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "take",
      requestType = pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.TakeRequest.class,
      responseType = pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.TakeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.TakeRequest,
      pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.TakeResponse> getTakeMethod() {
    io.grpc.MethodDescriptor<pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.TakeRequest, pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.TakeResponse> getTakeMethod;
    if ((getTakeMethod = TupleSpacesReplicaGrpc.getTakeMethod) == null) {
      synchronized (TupleSpacesReplicaGrpc.class) {
        if ((getTakeMethod = TupleSpacesReplicaGrpc.getTakeMethod) == null) {
          TupleSpacesReplicaGrpc.getTakeMethod = getTakeMethod =
              io.grpc.MethodDescriptor.<pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.TakeRequest, pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.TakeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "take"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.TakeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.TakeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TupleSpacesReplicaMethodDescriptorSupplier("take"))
              .build();
        }
      }
    }
    return getTakeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.getTupleSpacesStateRequest,
      pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.getTupleSpacesStateResponse> getGetTupleSpacesStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTupleSpacesState",
      requestType = pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.getTupleSpacesStateRequest.class,
      responseType = pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.getTupleSpacesStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.getTupleSpacesStateRequest,
      pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.getTupleSpacesStateResponse> getGetTupleSpacesStateMethod() {
    io.grpc.MethodDescriptor<pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.getTupleSpacesStateRequest, pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.getTupleSpacesStateResponse> getGetTupleSpacesStateMethod;
    if ((getGetTupleSpacesStateMethod = TupleSpacesReplicaGrpc.getGetTupleSpacesStateMethod) == null) {
      synchronized (TupleSpacesReplicaGrpc.class) {
        if ((getGetTupleSpacesStateMethod = TupleSpacesReplicaGrpc.getGetTupleSpacesStateMethod) == null) {
          TupleSpacesReplicaGrpc.getGetTupleSpacesStateMethod = getGetTupleSpacesStateMethod =
              io.grpc.MethodDescriptor.<pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.getTupleSpacesStateRequest, pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.getTupleSpacesStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getTupleSpacesState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.getTupleSpacesStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.getTupleSpacesStateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TupleSpacesReplicaMethodDescriptorSupplier("getTupleSpacesState"))
              .build();
        }
      }
    }
    return getGetTupleSpacesStateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TupleSpacesReplicaStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TupleSpacesReplicaStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TupleSpacesReplicaStub>() {
        @java.lang.Override
        public TupleSpacesReplicaStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TupleSpacesReplicaStub(channel, callOptions);
        }
      };
    return TupleSpacesReplicaStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TupleSpacesReplicaBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TupleSpacesReplicaBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TupleSpacesReplicaBlockingStub>() {
        @java.lang.Override
        public TupleSpacesReplicaBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TupleSpacesReplicaBlockingStub(channel, callOptions);
        }
      };
    return TupleSpacesReplicaBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TupleSpacesReplicaFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TupleSpacesReplicaFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TupleSpacesReplicaFutureStub>() {
        @java.lang.Override
        public TupleSpacesReplicaFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TupleSpacesReplicaFutureStub(channel, callOptions);
        }
      };
    return TupleSpacesReplicaFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TupleSpacesReplicaImplBase implements io.grpc.BindableService {

    /**
     */
    public void put(pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.PutRequest request,
        io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.PutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPutMethod(), responseObserver);
    }

    /**
     */
    public void read(pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.ReadRequest request,
        io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.ReadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadMethod(), responseObserver);
    }

    /**
     */
    public void take(pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.TakeRequest request,
        io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.TakeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTakeMethod(), responseObserver);
    }

    /**
     */
    public void getTupleSpacesState(pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.getTupleSpacesStateRequest request,
        io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.getTupleSpacesStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTupleSpacesStateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPutMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.PutRequest,
                pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.PutResponse>(
                  this, METHODID_PUT)))
          .addMethod(
            getReadMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.ReadRequest,
                pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.ReadResponse>(
                  this, METHODID_READ)))
          .addMethod(
            getTakeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.TakeRequest,
                pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.TakeResponse>(
                  this, METHODID_TAKE)))
          .addMethod(
            getGetTupleSpacesStateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.getTupleSpacesStateRequest,
                pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.getTupleSpacesStateResponse>(
                  this, METHODID_GET_TUPLE_SPACES_STATE)))
          .build();
    }
  }

  /**
   */
  public static final class TupleSpacesReplicaStub extends io.grpc.stub.AbstractAsyncStub<TupleSpacesReplicaStub> {
    private TupleSpacesReplicaStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TupleSpacesReplicaStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TupleSpacesReplicaStub(channel, callOptions);
    }

    /**
     */
    public void put(pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.PutRequest request,
        io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.PutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void read(pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.ReadRequest request,
        io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.ReadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void take(pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.TakeRequest request,
        io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.TakeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTakeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTupleSpacesState(pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.getTupleSpacesStateRequest request,
        io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.getTupleSpacesStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTupleSpacesStateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TupleSpacesReplicaBlockingStub extends io.grpc.stub.AbstractBlockingStub<TupleSpacesReplicaBlockingStub> {
    private TupleSpacesReplicaBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TupleSpacesReplicaBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TupleSpacesReplicaBlockingStub(channel, callOptions);
    }

    /**
     */
    public pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.PutResponse put(pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.PutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPutMethod(), getCallOptions(), request);
    }

    /**
     */
    public pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.ReadResponse read(pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.ReadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadMethod(), getCallOptions(), request);
    }

    /**
     */
    public pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.TakeResponse take(pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.TakeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTakeMethod(), getCallOptions(), request);
    }

    /**
     */
    public pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.getTupleSpacesStateResponse getTupleSpacesState(pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.getTupleSpacesStateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTupleSpacesStateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TupleSpacesReplicaFutureStub extends io.grpc.stub.AbstractFutureStub<TupleSpacesReplicaFutureStub> {
    private TupleSpacesReplicaFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TupleSpacesReplicaFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TupleSpacesReplicaFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.PutResponse> put(
        pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.PutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.ReadResponse> read(
        pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.ReadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.TakeResponse> take(
        pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.TakeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTakeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.getTupleSpacesStateResponse> getTupleSpacesState(
        pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.getTupleSpacesStateRequest request) {
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
    private final TupleSpacesReplicaImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TupleSpacesReplicaImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PUT:
          serviceImpl.put((pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.PutRequest) request,
              (io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.PutResponse>) responseObserver);
          break;
        case METHODID_READ:
          serviceImpl.read((pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.ReadRequest) request,
              (io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.ReadResponse>) responseObserver);
          break;
        case METHODID_TAKE:
          serviceImpl.take((pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.TakeRequest) request,
              (io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.TakeResponse>) responseObserver);
          break;
        case METHODID_GET_TUPLE_SPACES_STATE:
          serviceImpl.getTupleSpacesState((pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.getTupleSpacesStateRequest) request,
              (io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.getTupleSpacesStateResponse>) responseObserver);
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

  private static abstract class TupleSpacesReplicaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TupleSpacesReplicaBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return pt.ulisboa.tecnico.tuplespaces.replicaTotalOrder.contract.TupleSpacesReplicaTotalOrder.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TupleSpacesReplica");
    }
  }

  private static final class TupleSpacesReplicaFileDescriptorSupplier
      extends TupleSpacesReplicaBaseDescriptorSupplier {
    TupleSpacesReplicaFileDescriptorSupplier() {}
  }

  private static final class TupleSpacesReplicaMethodDescriptorSupplier
      extends TupleSpacesReplicaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TupleSpacesReplicaMethodDescriptorSupplier(String methodName) {
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
      synchronized (TupleSpacesReplicaGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TupleSpacesReplicaFileDescriptorSupplier())
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

package com.grpc;

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
    value = "by gRPC proto compiler (version 1.34.1)",
    comments = "Source: topMovie.proto")
public final class topMovieFromRatingGrpc {

  private topMovieFromRatingGrpc() {}

  public static final String SERVICE_NAME = "topMovieFromRating";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.TopMovie.Empty,
      com.grpc.TopMovie.APIResponse> getGetTop10MovieMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTop10Movie",
      requestType = com.grpc.TopMovie.Empty.class,
      responseType = com.grpc.TopMovie.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.TopMovie.Empty,
      com.grpc.TopMovie.APIResponse> getGetTop10MovieMethod() {
    io.grpc.MethodDescriptor<com.grpc.TopMovie.Empty, com.grpc.TopMovie.APIResponse> getGetTop10MovieMethod;
    if ((getGetTop10MovieMethod = topMovieFromRatingGrpc.getGetTop10MovieMethod) == null) {
      synchronized (topMovieFromRatingGrpc.class) {
        if ((getGetTop10MovieMethod = topMovieFromRatingGrpc.getGetTop10MovieMethod) == null) {
          topMovieFromRatingGrpc.getGetTop10MovieMethod = getGetTop10MovieMethod =
              io.grpc.MethodDescriptor.<com.grpc.TopMovie.Empty, com.grpc.TopMovie.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getTop10Movie"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.TopMovie.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.TopMovie.APIResponse.getDefaultInstance()))
              .setSchemaDescriptor(new topMovieFromRatingMethodDescriptorSupplier("getTop10Movie"))
              .build();
        }
      }
    }
    return getGetTop10MovieMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static topMovieFromRatingStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<topMovieFromRatingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<topMovieFromRatingStub>() {
        @java.lang.Override
        public topMovieFromRatingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new topMovieFromRatingStub(channel, callOptions);
        }
      };
    return topMovieFromRatingStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static topMovieFromRatingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<topMovieFromRatingBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<topMovieFromRatingBlockingStub>() {
        @java.lang.Override
        public topMovieFromRatingBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new topMovieFromRatingBlockingStub(channel, callOptions);
        }
      };
    return topMovieFromRatingBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static topMovieFromRatingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<topMovieFromRatingFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<topMovieFromRatingFutureStub>() {
        @java.lang.Override
        public topMovieFromRatingFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new topMovieFromRatingFutureStub(channel, callOptions);
        }
      };
    return topMovieFromRatingFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class topMovieFromRatingImplBase implements io.grpc.BindableService {

    /**
     */
    public void getTop10Movie(com.grpc.TopMovie.Empty request,
        io.grpc.stub.StreamObserver<com.grpc.TopMovie.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTop10MovieMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetTop10MovieMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.TopMovie.Empty,
                com.grpc.TopMovie.APIResponse>(
                  this, METHODID_GET_TOP10MOVIE)))
          .build();
    }
  }

  /**
   */
  public static final class topMovieFromRatingStub extends io.grpc.stub.AbstractAsyncStub<topMovieFromRatingStub> {
    private topMovieFromRatingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected topMovieFromRatingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new topMovieFromRatingStub(channel, callOptions);
    }

    /**
     */
    public void getTop10Movie(com.grpc.TopMovie.Empty request,
        io.grpc.stub.StreamObserver<com.grpc.TopMovie.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTop10MovieMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class topMovieFromRatingBlockingStub extends io.grpc.stub.AbstractBlockingStub<topMovieFromRatingBlockingStub> {
    private topMovieFromRatingBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected topMovieFromRatingBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new topMovieFromRatingBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.TopMovie.APIResponse getTop10Movie(com.grpc.TopMovie.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetTop10MovieMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class topMovieFromRatingFutureStub extends io.grpc.stub.AbstractFutureStub<topMovieFromRatingFutureStub> {
    private topMovieFromRatingFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected topMovieFromRatingFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new topMovieFromRatingFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.TopMovie.APIResponse> getTop10Movie(
        com.grpc.TopMovie.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTop10MovieMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TOP10MOVIE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final topMovieFromRatingImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(topMovieFromRatingImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TOP10MOVIE:
          serviceImpl.getTop10Movie((com.grpc.TopMovie.Empty) request,
              (io.grpc.stub.StreamObserver<com.grpc.TopMovie.APIResponse>) responseObserver);
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

  private static abstract class topMovieFromRatingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    topMovieFromRatingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.TopMovie.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("topMovieFromRating");
    }
  }

  private static final class topMovieFromRatingFileDescriptorSupplier
      extends topMovieFromRatingBaseDescriptorSupplier {
    topMovieFromRatingFileDescriptorSupplier() {}
  }

  private static final class topMovieFromRatingMethodDescriptorSupplier
      extends topMovieFromRatingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    topMovieFromRatingMethodDescriptorSupplier(String methodName) {
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
      synchronized (topMovieFromRatingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new topMovieFromRatingFileDescriptorSupplier())
              .addMethod(getGetTop10MovieMethod())
              .build();
        }
      }
    }
    return result;
  }
}

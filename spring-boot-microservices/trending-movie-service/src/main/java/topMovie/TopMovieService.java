package topMovie;

import com.grpc.TopMovie;
import com.grpc.topMovieGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class TopMovieService extends topMovieGrpc.topMovieImplBase {

    @Override
    public void getTop10Movie(TopMovie.Empty request, StreamObserver<TopMovie.APIResponse> responseObserver) {
        System.out.println("Inside getTop10Movie");

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();


//        HelloServiceGrpc.HelloServiceBlockingStub stub
//                = HelloServiceGrpc.newBlockingStub(channel);
//
//        HelloResponse helloResponse = stub.hello(HelloRequest.newBuilder()
//                .setFirstName("Baeldung")
//                .setLastName("gRPC")
//                .build());
//
//        channel.shutdown();

//        TopMovie.APIResponse response = new  TopMovie.APIResponse();
//        movies.stream().filter(movie -> movie.getGenre().equals(request.getGenre()))
//                .collect(Collectors.toList())
//                .forEach(movie -> {
//                    responseObserver.onNext(MovieStoreResponse
//                            .newBuilder().setMovie(movie).build());
//                });
    }

}

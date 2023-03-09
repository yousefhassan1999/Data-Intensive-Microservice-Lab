package com.grpc;

import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

@GrpcService
@RequiredArgsConstructor
public class topMovieService extends topMovieGrpc.topMovieImplBase{
    @Autowired
    private final RestTemplate restTemplate;

    @Override
    public void getTop10Movie(Schema.Empty request, StreamObserver<Schema.APIResponse> responseObserver) {
        String ratingsUrl = "http://ratings-data-service/ratings/getTop10Movie";
        TopMovieClass topMovieIds =  restTemplate.getForObject(ratingsUrl, TopMovieClass.class);
        Schema.APIResponse response = Schema.APIResponse.newBuilder()
                .addAllMovieId(topMovieIds.topMovieId)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}

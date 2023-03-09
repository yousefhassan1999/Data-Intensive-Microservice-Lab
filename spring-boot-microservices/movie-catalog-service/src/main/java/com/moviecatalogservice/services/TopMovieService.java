package com.moviecatalogservice.services;


import com.google.protobuf.Descriptors;
import com.grpc.Schema;
import com.grpc.topMovieGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class TopMovieService {

    @GrpcClient("grpc-service")
    topMovieGrpc.topMovieBlockingStub synchronousClient;

    public Map<Descriptors.FieldDescriptor, Object> getTopMovie() {
        Schema.Empty request = Schema.Empty.newBuilder().build();
        Schema.APIResponse response = synchronousClient.getTop10Movie(request);
        return response.getAllFields();
    }

}

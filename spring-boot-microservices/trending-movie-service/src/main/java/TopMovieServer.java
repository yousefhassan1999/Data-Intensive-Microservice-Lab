import io.grpc.Server;
import io.grpc.ServerBuilder;
import topMovie.TopMovieService;

import java.io.IOException;

public class TopMovieServer {
    public static final int Top_Movie_Server_SERVICE_PORT = 50051;
    public static void main(String[] args)
            throws IOException, InterruptedException {
//        System.out.println("starting GRPC Server");
////        Server server = ServerBuilder.forPort(Top_Movie_Server_SERVICE_PORT).addService().build();
//
//        server.start();
//        System.out.println("server started at "+ server.getPort());
//        server.awaitTermination();
    }
}

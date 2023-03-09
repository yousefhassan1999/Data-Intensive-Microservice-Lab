package com;

import com.grpc.Schema;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Dev Problems(A Sarang Kumar Tak)
 * @YoutubeChannel https://www.youtube.com/channel/UCVno4tMHEXietE3aUTodaZQ
 */
public class TempDB {

    public static Schema.APIResponse getTopMovieFromTempDb() {
        Schema.APIResponse response = Schema.APIResponse.newBuilder()
                .addMovieId("1")
                .addMovieId("2")
                .addMovieId("3")
                .addMovieId("4")
                .addMovieId("5")
                .build();
        return response;
    }

}

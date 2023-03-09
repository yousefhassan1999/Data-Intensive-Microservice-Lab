package com.moviecatalogservice.resources;

import com.google.protobuf.Descriptors;
import com.moviecatalogservice.models.Movie;
import com.moviecatalogservice.services.MovieInfoService;
import com.moviecatalogservice.services.TopMovieService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/topMovie")
@AllArgsConstructor
public class TopMovieResource {
    TopMovieService topMovieService;
    MovieInfoService movieInfoService;

    @GetMapping("/getTopMovie")
    public List<Movie> getAuthor() {
        Map<Descriptors.FieldDescriptor, Object> topMovieResponse = topMovieService.getTopMovie();
        List<Map.Entry<Descriptors.FieldDescriptor, Object>> list = new ArrayList<>(topMovieResponse.entrySet());
        String MovieIds = list.get(0).getValue().toString();

        String[] listMovieIds =  MovieIds.substring(1, MovieIds.length()-1).split(", ");
        List<Movie> Response = new ArrayList<>();
        for(String s:listMovieIds){
            Response.add(movieInfoService.getMovieItem(s));
        }
        return Response;
    }

}

package com.example.movieinfoservice.resources;

import com.example.movieinfoservice.models.Movie;
import com.example.movieinfoservice.models.MovieSummary;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/movies")
public class MovieResource {
    //API Key (v3 auth) = 30dd307de12a62d7ca0e4f588b4044e2
    //API Read Access Token (v4 auth) = eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiIzMGRkMzA3ZGUxMmE2MmQ3Y2EwZTRmNTg4YjQwNDRlMiIsInN1YiI6IjY0MDY3ZDMyYWZlMjI0MDA3YzkxYjUzYiIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.uHDEUxaQ1VhYvMNQh1T6GTFyG9M8g-RZxNynYp5gyGM
    //Example = https://api.themoviedb.org/3/movie/550?api_key=30dd307de12a62d7ca0e4f588b4044e2 
    //Mongo database url = mongodb://localhost:27017
    @Value("${api.key}")
    private String apiKey;

    private RestTemplate restTemplate;

    public MovieResource(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
        // Get the movie info from TMDB
        final String url = "https://api.themoviedb.org/3/movie/" + movieId + "?api_key=" + apiKey;
        MovieSummary movieSummary = restTemplate.getForObject(url, MovieSummary.class);

        return new Movie(movieId, movieSummary.getTitle(), movieSummary.getOverview());
    }
}

package com.example.movieinfoservice.service;

import lombok.RequiredArgsConstructor;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.movieinfoservice.models.MovieSummary;
import org.springframework.beans.factory.annotation.Value;
import com.example.movieinfoservice.models.Movie;
import com.example.movieinfoservice.repository.MovieRepository;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class MovieService {
    // API Key (v3 auth) = 30dd307de12a62d7ca0e4f588b4044e2
    // API Read Access Token (v4 auth) =
    // eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiIzMGRkMzA3ZGUxMmE2MmQ3Y2EwZTRmNTg4YjQwNDRlMiIsInN1YiI6IjY0MDY3ZDMyYWZlMjI0MDA3YzkxYjUzYiIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.uHDEUxaQ1VhYvMNQh1T6GTFyG9M8g-RZxNynYp5gyGM
    // Example =
    // https://api.themoviedb.org/3/movie/550?api_key=30dd307de12a62d7ca0e4f588b4044e2
    // Mongo database url = mongodb://localhost:27017
    @Value("${api.key}")
    private String apiKey;

    @Autowired
    private final MovieRepository movieRepository;
    @Autowired
    private RestTemplate restTemplate;

    public Movie getMovieInfo(String movieId) {
        Optional<Movie> movie = movieRepository.findById(movieId);
        if (movie.isPresent()) {
            System.out.print("from data base");
            return movie.get();
        }
        System.out.print("from API");
        // Get the movie info from TMDB
        final String url = "https://api.themoviedb.org/3/movie/" + movieId + "?api_key=" + apiKey;
        MovieSummary movieSummary = restTemplate.getForObject(url, MovieSummary.class);
        Movie fetchedMovie = Movie.builder()
                .movieId(movieId)
                .name(movieSummary.getTitle())
                .description(movieSummary.getOverview())
                .build();
        movieRepository.save(fetchedMovie);
        return fetchedMovie;
    }

}

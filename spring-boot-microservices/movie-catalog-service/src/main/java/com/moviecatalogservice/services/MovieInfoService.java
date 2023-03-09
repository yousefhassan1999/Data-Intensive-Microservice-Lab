package com.moviecatalogservice.services;

import com.moviecatalogservice.models.CatalogItem;
import com.moviecatalogservice.models.Movie;
import com.moviecatalogservice.models.Rating;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class MovieInfoService {
    @Autowired
    private final RestTemplate restTemplate;


    public CatalogItem getCatalogItem(Rating rating) {
        String movieDetailsUrl = "http://movie-info-service/movies/" + rating.getMovieId();
        Movie movie = this.restTemplate.getForObject(movieDetailsUrl, Movie.class);
        return new CatalogItem(movie.getName(), movie.getDescription(), rating.getRating());
    }

    public Movie getMovieItem(String movieId) {
        String movieDetailsUrl = "http://movie-info-service/movies/" + movieId;
        return this.restTemplate.getForObject(movieDetailsUrl, Movie.class);
    }

}

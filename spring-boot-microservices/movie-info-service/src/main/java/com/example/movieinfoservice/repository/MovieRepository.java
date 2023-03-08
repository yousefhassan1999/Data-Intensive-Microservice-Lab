package com.example.movieinfoservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.movieinfoservice.models.Movie;

public interface MovieRepository extends MongoRepository<Movie, String>{
    
}

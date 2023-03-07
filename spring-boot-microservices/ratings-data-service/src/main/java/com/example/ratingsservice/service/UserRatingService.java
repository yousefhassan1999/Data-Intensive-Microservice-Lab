package com.example.ratingsservice.service;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ratingsservice.models.UserRating;
import com.example.ratingsservice.repository.UserRatingRepository;

@Service
@RequiredArgsConstructor
public class UserRatingService {
    @Autowired
    private UserRatingRepository userRatingRepository;

    public Optional<UserRating> findById(String userId) {
        return userRatingRepository.findById(userId);
    }
}

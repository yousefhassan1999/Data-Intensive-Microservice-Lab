package com.example.ratingsservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ratingsservice.models.UserRating;

public interface UserRatingRepository extends JpaRepository<UserRating, String>{
    UserRating findByUserId(String userId);
}

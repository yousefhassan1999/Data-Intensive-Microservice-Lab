package com.example.ratingsservice.resources;

import com.example.ratingsservice.models.UserRating;
import com.example.ratingsservice.service.UserRatingService;
import org.springframework.http.ResponseEntity;
import org.springframework.http.*;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/ratings")
@RequiredArgsConstructor
public class RatingsResource {
    @Autowired
    private final UserRatingService userRatingService;

    @RequestMapping("/{userId}")
    public ResponseEntity<?> getRatingsOfUser(@PathVariable String userId) {
        Optional<UserRating> userRating = userRatingService.findById(userId);
        if(userRating.isPresent()){
            return ResponseEntity.ok(userRating);
        }
        return new ResponseEntity<>("There is no userRating", HttpStatus.BAD_REQUEST);
    }

    @RequestMapping("/getTop10Movie")
    public ResponseEntity<?> getTop10Movie() {
        return new ResponseEntity<>(userRatingService.getTop10Movie(), HttpStatus.OK);
    }
}

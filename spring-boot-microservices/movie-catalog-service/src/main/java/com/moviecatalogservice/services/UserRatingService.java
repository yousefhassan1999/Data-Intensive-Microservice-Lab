package com.moviecatalogservice.services;

import com.moviecatalogservice.models.UserRating;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class UserRatingService {
    @Autowired
    private final RestTemplate restTemplate;

    public UserRating getUserRating(@PathVariable("userId") String userId) {
        String ratingsUrl = "http://ratings-data-service/ratings/" + userId;
        return Objects.requireNonNull(restTemplate.getForObject(ratingsUrl, UserRating.class));
    }

}

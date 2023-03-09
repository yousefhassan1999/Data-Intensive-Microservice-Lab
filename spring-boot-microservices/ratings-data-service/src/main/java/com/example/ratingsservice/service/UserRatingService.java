package com.example.ratingsservice.service;
import com.example.ratingsservice.models.TopMovieClass;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ratingsservice.models.Rating;
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

    public TopMovieClass getTop10Movie (){
        List<UserRating> allUserRatings = userRatingRepository.findAll();
        Map<String, Integer> hm = new HashMap<String, Integer>();
        for(UserRating userRating : allUserRatings){
            for(Rating rating : userRating.getRatings()){
                if(hm.containsKey(rating.getMovieId())){
                    hm.put(rating.getMovieId(), hm.get(rating.getMovieId()) + rating.getRating());
                }
                else{
                    hm.put(rating.getMovieId(), rating.getRating());
                }
            }
        }
        List<Entry<String, Integer>> nlist = new ArrayList<>(hm.entrySet());
        nlist.sort(Entry.comparingByValue());
        nlist.forEach(System.out::println);
        TopMovieClass res = new TopMovieClass();
        res.topMovieId = new ArrayList<>();
        for(int i=nlist.size()-1 ; i>=0 && i>=nlist.size()-10; i--){
            res.topMovieId.add(nlist.get(i).getKey());
        }
        return res;
    }
}

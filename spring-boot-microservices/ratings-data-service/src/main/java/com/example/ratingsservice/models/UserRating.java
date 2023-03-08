package com.example.ratingsservice.models;


import lombok.*;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "userRating")
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @Builder
public class UserRating {
    @Id
    private String userId;

    @OneToMany(fetch = FetchType.EAGER,mappedBy="userRating", cascade = CascadeType.ALL)
    private List<Rating> ratings;
}

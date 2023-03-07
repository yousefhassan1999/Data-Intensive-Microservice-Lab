package com.example.ratingsservice.models;

import lombok.*;
import jakarta.persistence.*;

@Entity
@Table(name = "rating")
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @Builder
public class Rating {
    @Id
    private String movieId;
    private int rating;

    @ManyToOne
    @JoinColumn(name="userRating_id", nullable=false)
    private UserRating userRating;
}

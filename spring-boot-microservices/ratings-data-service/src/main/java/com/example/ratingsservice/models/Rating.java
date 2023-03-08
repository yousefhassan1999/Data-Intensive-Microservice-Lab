package com.example.ratingsservice.models;

import lombok.*;
import jakarta.persistence.*;

@Entity
@Table(name = "rating")
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @Builder
public class Rating {
    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    // private Long id;
    private String movieId;
    private int rating;

    @ManyToOne
    @JoinColumn(name="userRating_id", nullable=false)
    private UserRating userRating;
}

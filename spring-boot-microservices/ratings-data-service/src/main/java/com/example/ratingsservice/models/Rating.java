package com.example.ratingsservice.models;

import lombok.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "rating")
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @Builder
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String movieId;
    private int rating;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="userRating_id", nullable=false)
    @JsonIgnore
    private UserRating userRating;
}

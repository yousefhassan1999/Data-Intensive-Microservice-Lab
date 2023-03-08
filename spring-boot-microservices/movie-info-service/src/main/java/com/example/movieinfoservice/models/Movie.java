package com.example.movieinfoservice.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

@Document(collection = "Movie")
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @Builder
public class Movie {
    @Id
    private String movieId;
    private String name;
    private String description;
}

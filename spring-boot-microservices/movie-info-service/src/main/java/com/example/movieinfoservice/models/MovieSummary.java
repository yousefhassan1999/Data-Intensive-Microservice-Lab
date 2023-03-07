package com.example.movieinfoservice.models;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

@Document(collection = "MovieSummary")
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @Builder
public class MovieSummary {

    private String id;
    private String title;
    private String overview;
}

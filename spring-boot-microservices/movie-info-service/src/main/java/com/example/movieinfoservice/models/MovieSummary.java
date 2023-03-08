package com.example.movieinfoservice.models;

import lombok.*;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @Builder
public class MovieSummary {
    private String id;
    private String title;
    private String overview;
}

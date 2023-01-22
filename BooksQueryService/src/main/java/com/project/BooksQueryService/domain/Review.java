package com.project.BooksQueryService.domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Document
public class Review {
    private String isbn;
    private int rating;
    private String customerName;
    private String description;

}

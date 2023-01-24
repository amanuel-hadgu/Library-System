package com.project.BooksQueryService.domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Document
public class Review {

    private String isbn;
    private int rating;
    private String customerName;
    private String description;
    private Book book;

}

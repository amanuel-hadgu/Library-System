package com.project.BooksQueryService.domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Document
public class Book {
    private String isbn;
    private String title;
    private String description;
    private String author;
    private Review review;

}

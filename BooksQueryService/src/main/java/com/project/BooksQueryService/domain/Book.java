package com.project.BooksQueryService.domain;

import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Document
public class Book {

    @Id
    private Integer id;
    private String isbn;
    private String title;
    private String description;
    private String author;
    private Review review;


}

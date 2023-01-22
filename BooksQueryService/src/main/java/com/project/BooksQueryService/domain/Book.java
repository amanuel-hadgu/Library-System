package com.project.BooksQueryService.domain;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Book {
    private String isbn;
    private String title;
    private String description;
    private String author;
    private Review review;

}

package com.project.BooksQueryService.domain;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Review {
    private String isbn;
    private int rating;
    private String customerName;
    private String description;

}

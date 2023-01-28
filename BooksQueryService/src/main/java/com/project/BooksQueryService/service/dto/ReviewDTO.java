package com.project.BooksQueryService.service.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ReviewDTO {
    private String isbn;
    private int rating;
    private String customerName;
    private String description;

}

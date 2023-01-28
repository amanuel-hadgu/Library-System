package com.project.BooksQueryService.service.dto;

import com.project.BooksQueryService.domain.Review;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class BookDTO {
    private String isbn;
    private String title;
    private String description;
    private String author;
    private Review review;
}

package com.project.BooksQueryService.service.dto;

import com.project.BooksQueryService.domain.Book;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ReviewDTO {
    private String rating;
    private String description;
    private Book book;
}

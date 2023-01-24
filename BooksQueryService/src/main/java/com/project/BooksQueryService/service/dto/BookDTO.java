package com.project.BooksQueryService.service.dto;

import com.project.BooksQueryService.domain.Review;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {

    private Integer bookId;
    private String isbn;
    private String title;
    private String description;
    private String author;
    private Review review;

}

package com.project.BooksQueryService.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BookDto {

    private String isbn;
    private String title;
    private String description;
}

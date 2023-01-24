package com.project.BooksQueryService.service;

import com.project.BooksQueryService.service.dto.BookDTO;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter

public class BookChangeEventDTO {

    private String change;
    private BookDTO book;
}

package com.project.BooksQueryService.service;

import com.project.BooksQueryService.service.dto.BookDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookChangeEventDTO {
    private String change;
    private BookDTO book;

}

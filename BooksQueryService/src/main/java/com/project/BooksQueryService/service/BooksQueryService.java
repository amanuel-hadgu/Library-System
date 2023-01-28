package com.project.BooksQueryService.service;

import com.project.BooksQueryService.repository.BooksQueryRepository;
import com.project.BooksQueryService.service.dto.BookDTO;

public interface BooksQueryService {
    void add(BookDTO bookDTO);

    void delete(String isbn);

    BookDTO get(String isbn);

    void update(String isbn, BookDTO bookDTO);

    void handle(BookChangeEventDTO bookChangeEventDTO);
}

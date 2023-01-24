package com.project.BooksQueryService.service;

import com.project.BooksQueryService.service.dto.BookDTO;

public interface BookServiceImpl {

    void add(BookDTO bookDTO);

    void delete(Integer bookId);

    BookDTO get(String isbn);


    void update(Integer bookId, BookDTO bookDTO);

    void handle(BookChangeEventDTO bookChangeEventDTO);
}

package com.project.BooksQueryService.controller;

import com.project.BooksQueryService.service.dto.BookDTO;
import com.project.BooksQueryService.service.impl.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books/{book_id}")
    public ResponseEntity<?> get(@PathVariable String book_id){
        BookDTO bookDto = bookService.get(book_id);
        return new ResponseEntity<>(bookDto, HttpStatus.OK);
    }
}

package com.project.BooksQueryService.controller;

import com.project.BooksQueryService.service.BooksQueryService;
import com.project.BooksQueryService.service.dto.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksQueryController {
    @Autowired
    private BooksQueryService booksQueryService;

    @GetMapping("/books/{isbn}")
    public ResponseEntity<?> get(@PathVariable String isbn){
        BookDTO bookDto = booksQueryService.get(isbn);
        return new ResponseEntity<>(bookDto, HttpStatus.OK);
    }
}

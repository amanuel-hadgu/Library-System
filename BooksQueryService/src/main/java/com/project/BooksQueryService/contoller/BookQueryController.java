package com.project.BooksQueryService.contoller;

import com.project.BooksQueryService.dto.BookQueryDto;
import com.project.BooksQueryService.service.BookQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class BookQueryController {
    @Autowired
    private BookQueryService bookQueryService;
    @PutMapping
    public ResponseEntity<?> updateBook(@RequestBody BookQueryDto bookQueryDto, @PathVariable String bookQueryNumber){
        bookQueryService.updateBookQuery(bookQueryNumber,bookQueryDto);
        return ResponseEntity.ok().body(bookQueryDto);
    }
}

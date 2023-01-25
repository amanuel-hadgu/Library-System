package com.project.BooksQueryService.service;

import com.project.BooksQueryService.domain.BookQuery;
import com.project.BooksQueryService.dto.BookQueryDto;
import org.springframework.stereotype.Service;

@Service
public interface BookQueryService {
    public BookQueryDto updateBookQuery(String bookQueryNumber,BookQueryDto bookQueryDto);

}

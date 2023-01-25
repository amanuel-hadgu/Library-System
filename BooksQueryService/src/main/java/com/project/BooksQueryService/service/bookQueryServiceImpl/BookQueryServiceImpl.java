package com.project.BooksQueryService.service.bookQueryServiceImpl;

import com.project.BooksQueryService.domain.Book;
import com.project.BooksQueryService.domain.BookQuery;
import com.project.BooksQueryService.dto.BookQueryDto;
import com.project.BooksQueryService.repository.BookQueryRepository;
import com.project.BooksQueryService.service.BookQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookQueryServiceImpl implements BookQueryService {
    @Autowired
    private BookQueryRepository bookQueryRepository;
        @Override
    public BookQueryDto updateBookQuery(String bookQueryNumber,BookQueryDto bookQueryDto) {
        Optional<BookQuery> optionalBookQuery = bookQueryRepository.findById(bookQueryNumber);
        if(optionalBookQuery.isPresent()){
            BookQuery bookQuery=optionalBookQuery.get();
            bookQuery.setBook(bookQuery.getBook());
            bookQuery.setBookQueryNumber(bookQueryDto.getBookQueryNumber());
            bookQuery.setEvent(bookQueryDto.getEvent());
           // bookQuery.setReviews(bookQueryDto.getReviews());
            bookQueryRepository.save(bookQuery);
        }
            return bookQueryDto;
    }
}

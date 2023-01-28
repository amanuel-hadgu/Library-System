package com.project.BooksQueryService.service;

import com.project.BooksQueryService.domain.Book;
import com.project.BooksQueryService.repository.BooksQueryRepository;
import com.project.BooksQueryService.service.dto.BookAdapter;
import com.project.BooksQueryService.service.dto.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BooksQueryServiceImp implements BooksQueryService{

    @Autowired
    private BooksQueryRepository booksQueryRepository;

    public void BooksQueryService(BooksQueryRepository booksQueryRepository) {
        this.booksQueryRepository = booksQueryRepository;
    }

    @Override
    public void add(BookDTO bookDTO) {
        Book book = BookAdapter.fromDTO(bookDTO);
        booksQueryRepository.save(book);
    }

    @Override
    public void delete(String isbn) {
        booksQueryRepository.deleteById(isbn);

    }

    @Override
    public BookDTO get(String isbn) {
        return null;
    }

    @Override
    public void update(String isbn, BookDTO bookDTO) {
        Optional<Book> optionalBook = booksQueryRepository.findById(isbn);
        if(optionalBook.isPresent()) {
            Book book = optionalBook.get();
            book.setIsbn(bookDTO.getIsbn());
            book.setTitle(bookDTO.getTitle());
            book.setDescription(bookDTO.getDescription());
            book.setAuthor(bookDTO.getAuthor());
            book.setReview(bookDTO.getReview());
            booksQueryRepository.save(book);
        }
    }

    @Override
    public void handle(BookChangeEventDTO bookChangeEventDTO) {

    }
}

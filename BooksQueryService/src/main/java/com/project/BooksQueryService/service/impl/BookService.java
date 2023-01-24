package com.project.BooksQueryService.service.impl;

import com.project.BooksQueryService.domain.Book;
import com.project.BooksQueryService.repository.BookRepository;
import com.project.BooksQueryService.service.BookChangeEventDTO;
import com.project.BooksQueryService.service.BookServiceImpl;
import com.project.BooksQueryService.service.dto.BookAdapter;
import com.project.BooksQueryService.service.dto.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService implements BookServiceImpl {

    @Autowired
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void add(BookDTO bookDTO) {
        Book book = BookAdapter.fromDTO(bookDTO);
        bookRepository.save(book);
    }
    @Override
    public void delete(Integer bookId) {
        bookRepository.deleteById(bookId);

    }

    @Override
    public BookDTO get(String isbn) {
        return null;
    }

    @Override
    public void update(Integer bookId, BookDTO bookDTO) {

        Optional<Book> optionalBook = bookRepository.findById(bookId);
        if(optionalBook.isPresent()){
            Book book = optionalBook.get();
            book.setIsbn(bookDTO.getIsbn());
            book.setTitle(bookDTO.getTitle());
            book.setDescription(bookDTO.getDescription());
            book.setAuthor(bookDTO.getAuthor());
            book.setReview(bookDTO.getReview());
            bookRepository.save(book);
        }
    }

    @Override
    public void handle(BookChangeEventDTO bookChangeEventDTO) {
        if (bookChangeEventDTO.getChange().equals("add")){
            add(bookChangeEventDTO.getBook());
        } else if (bookChangeEventDTO.getChange().equals("delete")){
            delete(bookChangeEventDTO.getBook().getBookId());
        }
        else if (bookChangeEventDTO.getChange().equals("update")){
            //first get the product
            int quantity=0;
            Optional<Book> optionalBook = bookRepository.findById(bookChangeEventDTO.getBook().getBookId());
            if(optionalBook.isPresent()){
                Book book = optionalBook.get();
                quantity= book.getReview().getRating();
            }

            update(bookChangeEventDTO.getBook().getBookId(),
                    new BookDTO(
                            bookChangeEventDTO.getBook().getBookId(),
                            bookChangeEventDTO.getBook().getIsbn(),
                            bookChangeEventDTO.getBook().getTitle(),
                            bookChangeEventDTO.getBook().getDescription(),
                            bookChangeEventDTO.getBook().getTitle(),
                            bookChangeEventDTO.getBook().getReview())
//  ??having issues here    quantity
            );
        }

    }


}

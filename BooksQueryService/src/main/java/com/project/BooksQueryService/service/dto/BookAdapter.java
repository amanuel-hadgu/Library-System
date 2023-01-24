package com.project.BooksQueryService.service.dto;


import com.project.BooksQueryService.domain.Book;

public class BookAdapter {
    public static BookDTO toDTO(Book book) {
        BookDTO bookDTO = new BookDTO();
        bookDTO.setIsbn(book.getIsbn());
        bookDTO.setTitle(book.getTitle());
        bookDTO.setDescription(book.getDescription());
        bookDTO.setAuthor(book.getAuthor());
        bookDTO.setReview(book.getReview());

        return bookDTO;
    }

    public static Book fromDTO(BookDTO bookDTO) {
        Book book = new Book();
        book.setId(bookDTO.getBookId());
        book.setIsbn(bookDTO.getIsbn());
        book.setTitle(bookDTO.getTitle());
        book.setDescription(bookDTO.getDescription());
        book.setAuthor(bookDTO.getAuthor());
        book.setReview(bookDTO.getReview());

        return book;
    }
}

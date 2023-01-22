package com.project.BorrowingsService.integration;

import borrowings.Domain.Borrowing;
import borrowings.Repository.BorrowingDAO;
import borrowings.service.BorrowingsService;
import borrowings.service.DTOs.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookListener {
    @Autowired
    BorrowingDAO borrowingDAO;
    @Autowired
    BorrowingsService borrowingsService;

    @KafkaListener(topics = {"updateBooktopic"}, groupId = "gid")
    public void receive(@Payload BookDTO bookDTO) {
        System.out.println("received message=" + bookDTO.toString());
        List<Borrowing> borrowings = borrowingDAO.findBorrowingsByIsbn(bookDTO.getIsbn());
        for (Borrowing borrowing : borrowings) {
            borrowing.setIsbn(bookDTO.getIsbn());
            borrowing.setBookTitle(bookDTO.getTitle());
            borrowingDAO.save(borrowing);
        }
    }
}
package com.project.BooksQueryService.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class BookChangeListener {
    @Autowired
    private BooksQueryService booksQueryService;

    public BookChangeListener(BooksQueryService booksQueryService) {
        this.booksQueryService = booksQueryService;
    }

    @JmsListener(destination = "bookchange")
    public void receiveMessage(final String bookChangeEventDTOString) {

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            BookChangeEventDTO bookChangeEventDTO = objectMapper.readValue(bookChangeEventDTOString, BookChangeEventDTO.class);
            System.out.println("JMS receiver received message:" + bookChangeEventDTOString);
            booksQueryService.handle(bookChangeEventDTO);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

}

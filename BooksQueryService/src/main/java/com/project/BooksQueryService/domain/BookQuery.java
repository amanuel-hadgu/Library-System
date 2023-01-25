package com.project.BooksQueryService.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document
public class BookQuery {
    @Id
    private long bookQueryNumber;

    private String event;
    private Book book;
    private List<Review> reviews;
}

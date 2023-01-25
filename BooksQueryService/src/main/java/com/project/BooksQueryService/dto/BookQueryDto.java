package com.project.BooksQueryService.dto;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document
@Data

public class BookQueryDto {
    private long bookQueryNumber;

    private String event;


    private BookDto bookDto;

    private List<ReviewDto> reviews;
}

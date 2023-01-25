package com.project.BorrowingsService.Domain;

import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Book {
    private long isbn;
    private String title;
//    private String description;
//    private String authorName;
}

package com.project.BorrowingsService.Domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Borrowing {
    @Id
    private long borrowingNumber;
    private String date;
    private long customerNumber;
    private String customerName;
    private long isbn;
    private String bookTitle;

}

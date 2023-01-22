package com.project.BorrowingsService.service.DTOs;


import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class BorrowingDTO {

    private long borrowingNumber;
    private String date;
    private long customerNumber;
    private String customerName;
    private long isbn;
    private String bookTitle;
}

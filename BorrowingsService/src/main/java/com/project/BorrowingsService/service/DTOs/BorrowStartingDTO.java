package com.project.BorrowingsService.service.DTOs;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class BorrowStartingDTO {
    private long borrowingNumber;
    private String bookIsbn;
    private String customerNumber;
}

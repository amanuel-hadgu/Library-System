package com.project.BorrowingsService.service.Dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class BorrowStartingDto {
    private long borrowingNumber;
    private String bookIsbn;
    private String customerNumber;
}

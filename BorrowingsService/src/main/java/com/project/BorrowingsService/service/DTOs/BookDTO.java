package com.project.BorrowingsService.service.DTOs;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class BookDTO {


    private long isbn;
    private String title;

}

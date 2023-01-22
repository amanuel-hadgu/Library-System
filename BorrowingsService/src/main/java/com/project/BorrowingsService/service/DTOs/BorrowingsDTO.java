package com.project.BorrowingsService.service.DTOs;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class BorrowingsDTO {
    private List<BorrowingDTO> borrowingsDTO;
}

package com.project.BorrowingsService.service.DTOs;

import borrowings.Domain.Borrowing;

import java.util.ArrayList;
import java.util.List;

public class BorrowingsAdaptor {



    public static Borrowing getBorrowingFromBorrowingDTO(BorrowingDTO borrowingDTO){
        return new Borrowing(borrowingDTO.getBorrowingNumber(), borrowingDTO.getDate(),
                borrowingDTO.getCustomerNumber(), borrowingDTO.getCustomerName(), borrowingDTO.getIsbn(),
                borrowingDTO.getBookTitle());
    }
    public static BorrowingDTO getBorrowingDTOFromBorrowing(Borrowing borrowing){
        return new BorrowingDTO(borrowing.getBorrowingNumber(), borrowing.getDate(),
                borrowing.getCustomerNumber(), borrowing.getCustomerName(),
                borrowing.getIsbn(), borrowing.getBookTitle());
    }

    public static BorrowingsDTO getBorrowingsDTOFromBorrowings(List<Borrowing> borrowings){
        List<BorrowingDTO> listOfBorrowingDTOs = new ArrayList<>();
        for(Borrowing borrowing: borrowings){
            listOfBorrowingDTOs.add(new BorrowingDTO(borrowing.getBorrowingNumber(), borrowing.getDate(),
                    borrowing.getCustomerNumber(), borrowing.getCustomerName(), borrowing.getIsbn(),
                    borrowing.getBookTitle()));
        }
        BorrowingsDTO borrowingsDTO = new BorrowingsDTO(listOfBorrowingDTOs);
        return borrowingsDTO;
    }
}

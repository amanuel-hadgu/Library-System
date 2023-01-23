package com.project.BorrowingsService.service;


import com.project.BorrowingsService.Domain.Borrowing;
import com.project.BorrowingsService.Repository.BorrowingDAO;
import com.project.BorrowingsService.service.Dto.BorrowingDto;
import com.project.BorrowingsService.service.Dto.BorrowingsAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BorrowingsServiceImpl implements BorrowingsService{

    @Autowired
    BorrowingDAO borrowingDAO;


    @Override
    public BorrowingDto deleteBurrowing(long borrowingNumber) {
            Optional<Borrowing> borrowing = borrowingDAO.findById(borrowingNumber);
            if (borrowing.isPresent()) {
                BorrowingDto borrowingDTO = BorrowingsAdapter.getBorrowingDTOFromBorrowing(borrowing.get());
                borrowingDAO.deleteById(borrowingNumber);
                return borrowingDTO;
            }
            return null;
    }
}

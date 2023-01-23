package com.project.BorrowingsService.service;


import com.project.BorrowingsService.Domain.Borrowing;
import com.project.BorrowingsService.Repository.BorrowingDAO;
import com.project.BorrowingsService.service.Dto.BorrowingDto;
import com.project.BorrowingsService.service.Dto.BorrowingsAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrowingsServiceImpl implements BorrowingsService{

    @Autowired
    BorrowingDAO borrowingDAO;

    public BorrowingDto addBorrowing(BorrowingDto borrowingDTO){
        Borrowing borrowing = BorrowingsAdapter.getBorrowingFromBorrowingDTO(borrowingDTO);
        borrowingDAO.save(borrowing);
        return borrowingDTO;
    }

}

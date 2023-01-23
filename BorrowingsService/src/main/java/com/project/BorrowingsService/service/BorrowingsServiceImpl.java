package com.project.BorrowingsService.service;


import com.project.BorrowingsService.Domain.Borrowing;
import com.project.BorrowingsService.Repository.BorrowingDAO;
import com.project.BorrowingsService.service.Dto.BorrowingDto;
import com.project.BorrowingsService.service.Dto.BorrowingsAdapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BorrowingsServiceImpl implements BorrowingsService{

    @Autowired
   private  BorrowingDAO borrowingDAO;

    @Override
    public BorrowingDto getBorrowing(long borrowingNumber) {
    return null;
    }

    @Override
    public List<BorrowingDto> getBorrowings() {
        return null;
    }

    @Override
    public BorrowingDto addBorrowing(BorrowingDto borrowingDTO) {
        return null;
    }

    @Override
    public BorrowingDto updateBorrowing(long borrowingNumber, BorrowingDto borrowingDto) {
        return null;
    }

    @Override
    public BorrowingDto deleteBurrowing(long borrowingNumber) {
        return null;
    }
}

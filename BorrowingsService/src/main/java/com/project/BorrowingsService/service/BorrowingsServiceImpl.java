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
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<BorrowingDto> getBorrowings() {



//    @Override
//    public List<BorrowingsDto> getBorrowings() {
//        //List<Borrowing> changeDto= BorrowingsAdapter.getBorrowingsDTOFromBorrowings();
//
//        return borrowingDAO.findAll();
//    }
}

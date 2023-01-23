package com.project.BorrowingsService.service;


import com.project.BorrowingsService.service.Dto.BorrowingDto;


public interface BorrowingsService {

//    public BorrowingDTO getBorrowing(long borrowingNumber); // Natu

    public List<BorrowingDto> getBorrowings(); // Luwam

//    public BorrowingDTO addBorrowing(BorrowingDTO borrowingDTO); //Weini
public BorrowingDto addBorrowing(BorrowingDto borrowingDTO);
//
//    public BorrowingDTO updateBorrowing(long borrowingNumber, BorrowingDTO borrowingDTO); // Miki

//    public BorrowingDTO deleteBurrowing(long borrowingNumber); // Abi



}

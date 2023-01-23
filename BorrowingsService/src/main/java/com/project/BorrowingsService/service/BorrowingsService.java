package com.project.BorrowingsService.service;


import com.project.BorrowingsService.service.Dto.BorrowingDto;

import java.util.List;


public interface BorrowingsService {

    public BorrowingDto getBorrowing(long borrowingNumber); // Natu

    public List<BorrowingDto> getBorrowings(); // Luwam

    public BorrowingDto addBorrowing(BorrowingDto borrowingDTO);  //Weini

    public BorrowingDto updateBorrowing(long borrowingNumber, BorrowingDto borrowingDto); // Miki


    public BorrowingDto deleteBurrowing(long borrowingNumber); // Abi



}

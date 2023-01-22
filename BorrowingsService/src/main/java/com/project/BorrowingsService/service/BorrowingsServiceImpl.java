package com.project.BorrowingsService.service;


import com.project.BorrowingsService.Repository.BorrowingDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrowingsServiceImpl implements BorrowingsService{

    @Autowired
    BorrowingDAO borrowingDAO;



}

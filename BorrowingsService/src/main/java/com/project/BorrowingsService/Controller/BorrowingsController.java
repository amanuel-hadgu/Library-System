package com.project.BorrowingsService.Controller;

import com.project.BorrowingsService.service.BorrowingsService;
import com.project.BorrowingsService.service.Dto.BorrowingDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BorrowingsController {

    @Autowired
    BorrowingsService borrowingsService;

    //natu


    //luwam


    //weini
    @PostMapping
    public ResponseEntity<BorrowingDto> addBorrowing(@RequestBody BorrowingDto borrowingDTO){
        BorrowingDto borrowingDto = borrowingsService.addBorrowing(borrowingDTO);
        return new ResponseEntity<>(borrowingDto, HttpStatus.OK);
    }


    //miki


    //abi
}

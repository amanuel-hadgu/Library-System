package com.project.BorrowingsService.Controller;

import com.project.BorrowingsService.Domain.Borrowing;
import com.project.BorrowingsService.service.BorrowingsService;
import com.project.BorrowingsService.service.Dto.BorrowingDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = {"/borrowings"})
public class BorrowingsController {

    @Autowired
    BorrowingsService borrowingsService;

    //natu


    //luwam
    @GetMapping(value = {"/"})
   public ResponseEntity<List<BorrowingDto>>getAllBorrowings(){
    List<BorrowingDto> borrowings= borrowingsService.getBorrowings();
    return  new ResponseEntity<>(borrowings, HttpStatus.OK);
}

    //weini


    //miki


    //abi
}

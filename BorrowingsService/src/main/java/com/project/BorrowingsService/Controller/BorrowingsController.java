package com.project.BorrowingsService.Controller;

import com.project.BorrowingsService.service.BorrowingsService;
import com.project.BorrowingsService.service.Dto.BorrowingDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/borrowings")
public class BorrowingsController {

    @Autowired
    BorrowingsService borrowingsService;

    //natu


    //luwam


    //weini


    //miki


    //abi
    @DeleteMapping("/{id}")
    public ResponseEntity<BorrowingDto> deleteBorrowing(@PathVariable long id){
        BorrowingDto borrowingDTO = borrowingsService.deleteBurrowing(id);
        return new ResponseEntity<>(borrowingDTO, HttpStatus.OK);
    }
}

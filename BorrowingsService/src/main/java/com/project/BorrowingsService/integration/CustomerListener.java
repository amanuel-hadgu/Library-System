//package com.project.BorrowingsService.integration;
//
//
//import borrowings.Domain.Borrowing;
//import borrowings.Repository.BorrowingDAO;
//import borrowings.service.BorrowingsService;
//import borrowings.service.DTOs.CustomerDTO;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.messaging.handler.annotation.Payload;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class CustomerListener {
//    @Autowired
//    BorrowingDAO borrowingDAO;
//    @Autowired
//    BorrowingsService borrowingsService;
//
//    @KafkaListener(topics = {"updateCustomertopic"}, groupId = "gid2")
//    public void receive(@Payload CustomerDTO customerDTO) {
//        List<Borrowing> borrowings = borrowingDAO.findCBorrowingsByCustomerNumber(customerDTO.getCustomerNumber());
//        for (Borrowing borrowing:borrowings){
//            borrowing.setCustomerNumber(customerDTO.getCustomerNumber());
//            borrowing.setCustomerName(customerDTO.getName());
//            borrowingDAO.save(borrowing);
//        }
//
//    }
//}

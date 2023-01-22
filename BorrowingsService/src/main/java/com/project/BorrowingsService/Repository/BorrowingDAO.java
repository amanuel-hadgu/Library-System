package com.project.BorrowingsService.Repository;


import com.project.BorrowingsService.Domain.Borrowing;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface BorrowingDAO extends MongoRepository<Borrowing, Long> {

//    @Query("{'customer.customerNumber'::#{#customerNumber}}")
//    List<Borrowing> findCBorrowingsByCustomerNumber(@Param("customerNumber") long customerNumber);
//
//    @Query("{'book.isbn'::#{#isbn}}")
//    List<Borrowing> findBorrowingsByIsbn(@Param("isbn") long isbn);
}

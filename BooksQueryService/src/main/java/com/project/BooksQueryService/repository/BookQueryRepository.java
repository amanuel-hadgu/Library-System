package com.project.BooksQueryService.repository;

import com.project.BooksQueryService.domain.BookQuery;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookQueryRepository extends MongoRepository<BookQuery,String> {
    BookQuery findAllByBook_Isbn(Long isbn);
}

package com.project.BooksQueryService.repository;

import com.project.BooksQueryService.domain.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksQueryRepository extends MongoRepository<Book, String> {
}

package com.example.fpt.Execute2.repository;

import com.example.fpt.Execute2.domain.BookOnTape;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookOnTapeRepository extends MongoRepository<BookOnTape,String> {
}

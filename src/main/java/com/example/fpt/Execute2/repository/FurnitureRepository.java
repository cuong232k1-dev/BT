package com.example.fpt.Execute2.repository;

import com.example.fpt.Execute2.domain.Furniture;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FurnitureRepository extends MongoRepository<Furniture,String> {
}

package com.example.fpt.Execute2.repository;

import com.example.fpt.Execute2.domain.Video;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VideoRepository extends MongoRepository<Video,String> {

}

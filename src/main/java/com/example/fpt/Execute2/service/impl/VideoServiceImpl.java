package com.example.fpt.Execute2.service.impl;

import com.example.fpt.Execute2.domain.Video;
import com.example.fpt.Execute2.repository.VideoRepository;
import com.example.fpt.Execute2.service.VideoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class VideoServiceImpl  implements VideoService {

    private final VideoRepository videoRepository;

    @Override
    public String getDescription() {
        return new Video().toString();
    }

    @Override
    public void inputThing(Video video) {
        videoRepository.save(video);
    }

    @Override
    public List<Video> showAll() {
        return videoRepository.findAll();
    }

    @Override
    public Video getById(String number) {
        return  videoRepository.findById(number).get();

    }
}

package com.example.fpt.Execute2.controller;

import com.example.fpt.Execute2.domain.Video;
import com.example.fpt.Execute2.request.VideoRequest;
import com.example.fpt.Execute2.response.BaseResponse;
import com.example.fpt.Execute2.service.VideoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/video")
public class VideoController extends BaseController<VideoRequest> {

    private final VideoService videoService;


    @Override
    @PostMapping()
    BaseResponse update(VideoRequest videoRequest) {
        Video video = new Video(videoRequest.getId(),videoRequest.getVideoName(),videoRequest.getPriceOfVideo());
        videoService.inputThing(video);
        return new BaseResponse(0,"Suscces");
    }

    @Override
    @GetMapping()
    BaseResponse getALl() {

        return new BaseResponse(0,videoService.showAll());
    }

    @Override
    @GetMapping("/searchById")
    BaseResponse searchByID(@RequestParam() String id ) {
        return new BaseResponse(0,videoService.getById(id));
    }

    @Override
    @GetMapping("/detail")
    BaseResponse getDetail() {
        return new BaseResponse(0,videoService.getDescription());
    }
}

package com.example.fpt.Execute2.controller;

import com.example.fpt.Execute2.domain.BookOnTape;
import com.example.fpt.Execute2.request.BookOnTapRequest;
import com.example.fpt.Execute2.response.BaseResponse;
import com.example.fpt.Execute2.service.BookOnTapeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/bookOnTap")
public class BookOnTapController extends BaseController<BookOnTapRequest> {

    private final BookOnTapeService bookOnTapeService;

    @Override
    BaseResponse update(BookOnTapRequest book) {
        BookOnTape video = new BookOnTape(book.getId(),book.getBookName(),book.getBookPrice());
        bookOnTapeService.inputThing(video);
        return new BaseResponse(0,"Success");
    }

    @Override
    BaseResponse getALl() {
        return new BaseResponse(0,bookOnTapeService.showAll());
    }

    @Override
    BaseResponse searchByID(String id) {
        return new BaseResponse(0,bookOnTapeService.getById(id));
    }

    @Override
    BaseResponse getDetail() {
        return new BaseResponse(0,bookOnTapeService.getDescription());
    }
}

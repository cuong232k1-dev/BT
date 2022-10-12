package com.example.fpt.Execute2.service.impl;

import com.example.fpt.Execute2.domain.BookOnTape;
import com.example.fpt.Execute2.repository.BookOnTapeRepository;
import com.example.fpt.Execute2.service.BookOnTapeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookOnTapeServiceImpl implements BookOnTapeService {

    private final BookOnTapeRepository bookOnTapeRepository;

    @Override
    public String getDescription() {
        return new BookOnTape().toString();
    }

    @Override
    public void inputThing(BookOnTape bookOnTape) {
        bookOnTapeRepository.save(bookOnTape);
    }

    @Override
    public List<BookOnTape> showAll() {
        return bookOnTapeRepository.findAll();
    }

    @Override
    public BookOnTape getById(String id) {
        return bookOnTapeRepository.findById(id).get();
    }

}

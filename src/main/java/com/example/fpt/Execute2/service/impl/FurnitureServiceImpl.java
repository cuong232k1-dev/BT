package com.example.fpt.Execute2.service.impl;

import com.example.fpt.Execute2.domain.Furniture;
import com.example.fpt.Execute2.repository.FurnitureRepository;
import com.example.fpt.Execute2.service.FurnitureService;
import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class FurnitureServiceImpl implements FurnitureService {

    private final FurnitureRepository furnitureRepository;

    @Override
    public String getDescription() {
        return new Furniture().toString();
    }

    @Override
    public void inputThing(Furniture furniture) {
        furnitureRepository.save(furniture);
    }

    @Override
    public List<Furniture> showAll() {
        return furnitureRepository.findAll();
    }

    @Override
    public Furniture getById(String number) {
        return furnitureRepository.findById(number).get();
    }
}

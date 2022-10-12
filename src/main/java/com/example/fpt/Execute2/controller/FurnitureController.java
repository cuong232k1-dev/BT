package com.example.fpt.Execute2.controller;

import com.example.fpt.Execute2.domain.Furniture;
import com.example.fpt.Execute2.request.FurnitureRequest;
import com.example.fpt.Execute2.response.BaseResponse;
import com.example.fpt.Execute2.service.FurnitureService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/furniture")
@AllArgsConstructor
public class FurnitureController extends BaseController<FurnitureRequest> {

    private final FurnitureService furnitureService;

    @Override
    BaseResponse update(FurnitureRequest furnitureRequest) {
        Furniture furniture = new Furniture(furnitureRequest.getId(),furnitureRequest.getFurnitureName(),furnitureRequest.getFurniturePrice());
        furnitureService.inputThing(furniture);
        return new BaseResponse(0,"Success");
    }

    @Override
    BaseResponse getALl() {
        return new BaseResponse(0,furnitureService.showAll());
    }

    @Override
    BaseResponse searchByID(String id) {
        return new BaseResponse(0,furnitureService.getById(id));
    }

    @Override
    BaseResponse getDetail() {
        return new BaseResponse(0,furnitureService.getDescription());
    }
}

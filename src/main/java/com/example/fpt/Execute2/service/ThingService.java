package com.example.fpt.Execute2.service;

import java.util.List;

public interface ThingService<T> {

    String getDescription();

    void inputThing(T t);
    List<T> showAll();

    T getById(String number);

}

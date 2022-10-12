package com.example.fpt.Execute2.controller;

import com.example.fpt.Execute2.response.BaseResponse;

public abstract class BaseController<T> {
    abstract BaseResponse update(T t);
    abstract BaseResponse getALl();
    abstract BaseResponse searchByID(String id);
    abstract BaseResponse getDetail();
}

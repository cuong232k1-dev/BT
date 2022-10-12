package com.example.fpt.Execute2.request;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
public class BookOnTapRequest {
    String id;

    String bookName;

    long bookPrice;
}

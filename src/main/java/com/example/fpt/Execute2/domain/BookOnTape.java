package com.example.fpt.Execute2.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.annotation.security.DenyAll;

@Document(BookOnTape.COLLECTION_NAME)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookOnTape {
    public static final String COLLECTION_NAME = "book_on_tape";
    public static final String BOOK_NAME = "book_name";
    public static final String BOOK_PRICE = "book_price";

    @Id
    String id;

    @Field(BOOK_NAME)
    String bookName;

    @Field(BOOK_PRICE)
    long bookPrice;
}

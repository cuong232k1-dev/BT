package com.example.fpt.Execute2.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(Furniture.COLLECTION_NAME)
@AllArgsConstructor
@NoArgsConstructor
public class Furniture{
    public static final String COLLECTION_NAME = "furniture";
    public static final String FURNITURE_NAME = "furniture_name";
    public static final String FURNITURE_PRICE = "furniture_price";

    @Id
    String id;

    @Field(FURNITURE_NAME)
    String furnitureName;

    @Field(FURNITURE_PRICE)
    long furniturePrice;
}

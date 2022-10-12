package com.example.fpt.Execute2.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FurnitureRequest {
    String id;

    String furnitureName;

    long furniturePrice;
}

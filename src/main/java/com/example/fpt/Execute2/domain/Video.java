package com.example.fpt.Execute2.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(Video.COLLECTION_NAME)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Video{
    public static final String COLLECTION_NAME = "video";
    public static final String VIDEO_NAME = "video_name";
    public static final String PRICE_OF_VIDEO = "price_of_video";

    @Id
    String id;

    @Field(VIDEO_NAME)
    String videoName;

    @Field(PRICE_OF_VIDEO)
    long priceOfVideo;
}

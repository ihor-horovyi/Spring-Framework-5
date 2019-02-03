package com.example.spring.property.source.springpropertysource.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

/**
 * Created by ihor.horovyi 2019-02-03
 */
@Builder
@AllArgsConstructor
@ToString
public class MongoDataSource {
    private String user;
    private String password;
    private String url;
}

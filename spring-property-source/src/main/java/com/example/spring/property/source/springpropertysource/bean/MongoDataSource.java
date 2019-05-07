package com.example.spring.property.source.springpropertysource.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by ihor.horovyi 2019-02-03
 */
@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
public class MongoDataSource {
    private String user;
    private String password;
    private String url;
}

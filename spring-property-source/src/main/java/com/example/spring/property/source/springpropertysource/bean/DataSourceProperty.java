package com.example.spring.property.source.springpropertysource.bean;


import lombok.*;

/**
 * Created by ihor.horovyi 2019-02-03
 */
@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DataSourceProperty {

    private String user;

    private String password;

    private String url;
}

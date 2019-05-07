package com.example.spring.property.source.springpropertysource.properties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by ihor.horovyi 2019-05-07
 */
@Getter
@Setter
@Component
@ToString
@ConfigurationProperties("datasource")
public class DataSourceProperties {
    private String username;
    private String password;
    private String url;
}

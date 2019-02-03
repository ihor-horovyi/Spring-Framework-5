package com.example.spring.property.source.springpropertysource.config;

import com.example.spring.property.source.springpropertysource.bean.DataSourceProperty;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by ihor.horovyi 2019-02-03
 */
@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    @Value("${user.name}")
    private String user;

    @Value("user.password")
    private String password;

    @Value("${datasource.url}")
    private String url;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return  propertySourcesPlaceholderConfigurer;
    }

    @Bean
    public DataSourceProperty dataSourceProperty() {
        return DataSourceProperty.builder()
                .user(this.user)
                .password(this.password)
                .url(this.url)
                .build();
    }

}

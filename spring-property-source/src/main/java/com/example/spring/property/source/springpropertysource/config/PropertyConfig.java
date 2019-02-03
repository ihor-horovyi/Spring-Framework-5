package com.example.spring.property.source.springpropertysource.config;

import com.example.spring.property.source.springpropertysource.bean.DataSourceProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * Created by ihor.horovyi 2019-02-03
 */
@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    @Value("${datasource.username}")
    private String user;

    @Value("${datasource.password}")
    private String password;

    @Value("${datasource.url}")
    private String url;

    @Autowired
    private Environment env;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return  propertySourcesPlaceholderConfigurer;
    }

    @Bean
    public DataSourceProperty dataSourceProperty() {
        System.out.println("username from environment variables ==> " + env.getProperty("USERNAME"));

        return DataSourceProperty.builder()
                .user(this.user)
                .password(this.password)
                .url(this.url)
                .build();
    }

}

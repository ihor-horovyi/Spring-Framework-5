package com.example.spring.property.source.springpropertysource.config;

import com.example.spring.property.source.springpropertysource.bean.DataSource;
import com.example.spring.property.source.springpropertysource.bean.MongoDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * Created by ihor.horovyi 2019-02-03
 */
@Configuration
//@PropertySource({"classpath:datasource.properties", "classpath:mongo.properties"})
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:mongo.properties")
})
public class PropertyConfig {

    @Value("${datasource.username}")
    private String user;

    @Value("${datasource.password}")
    private String password;

    @Value("${datasource.url}")
    private String url;

    @Value("${mongo.username}")
    private String mongoUser;

    @Value("${mongo.password}")
    private String mongoPassword;

    @Value(value = "${mongo.url}")
    private String mongoUrl;

    @Autowired
    private Environment env;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return  propertySourcesPlaceholderConfigurer;
    }

    @Bean
    public DataSource dataSource() {
        System.out.println("username from environment variables ==> " + env.getProperty("USERNAME"));

        return DataSource.builder()
                .user(this.user)
                .password(this.password)
                .url(this.url)
                .build();
    }

    @Bean
    public MongoDataSource mongoDataSource() {

        return MongoDataSource.builder()
                .user(this.mongoUser)
                .password(this.mongoPassword)
                .url(this.mongoUrl)
                .build();
    }

}

package com.example.spring.property.source.springpropertysource;

import com.example.spring.property.source.springpropertysource.bean.DataSource;
import com.example.spring.property.source.springpropertysource.bean.MongoDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringPropertySourceApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringPropertySourceApplication.class, args);
        DataSource dataSource = context.getBean(DataSource.class);
        System.out.println(dataSource);

        MongoDataSource mongoDataSource = context.getBean(MongoDataSource.class);
        System.out.println(mongoDataSource);
    }

}


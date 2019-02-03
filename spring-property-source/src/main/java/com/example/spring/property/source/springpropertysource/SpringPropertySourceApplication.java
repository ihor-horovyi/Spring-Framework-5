package com.example.spring.property.source.springpropertysource;

import com.example.spring.property.source.springpropertysource.bean.DataSourceProperty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringPropertySourceApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringPropertySourceApplication.class, args);
        DataSourceProperty dataSourceProperty = context.getBean(DataSourceProperty.class);
        System.out.println(dataSourceProperty);
    }

}


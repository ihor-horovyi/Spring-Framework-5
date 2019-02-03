package com.example.spring.property.source.springpropertysource;

import com.example.spring.property.source.springpropertysource.bean.DataSourceProperty;
import com.example.spring.property.source.springpropertysource.controller.TestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringPropertySourceApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringPropertySourceApplication.class, args);

        TestController testController = context.getBean(TestController.class);

        DataSourceProperty dataSourceProperty = (DataSourceProperty) context.getBean("dataSourceProperty");
        System.out.println(dataSourceProperty);
    }

}


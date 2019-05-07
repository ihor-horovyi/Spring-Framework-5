package com.example.spring.property.source.springpropertysource;

import com.example.spring.property.source.springpropertysource.bean.DataSource;
import com.example.spring.property.source.springpropertysource.bean.MongoDataSource;
import com.example.spring.property.source.springpropertysource.properties.DataSourceProperties;
import com.example.spring.property.source.springpropertysource.properties.MongoDataSourceProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringPropertySourceApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringPropertySourceApplication.class, args);

        System.out.println("========PropertyConfig========");
        System.out.println(context.getBean(DataSource.class));
        System.out.println(context.getBean(MongoDataSource.class));


        System.out.println("========@ConfigurationProperties========");
        System.out.println(context.getBean(DataSourceProperties.class));
        System.out.println(context.getBean(MongoDataSourceProperties.class));
    }

}


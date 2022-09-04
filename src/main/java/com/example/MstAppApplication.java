package com.example;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

import java.io.IOException;
import java.util.Properties;

@SpringBootApplication
@PropertySource("classpath:application.properties")
public class MstAppApplication {

    public static void main(String[] args) {

        SpringApplication.run(MstAppApplication.class, args);
    }

}

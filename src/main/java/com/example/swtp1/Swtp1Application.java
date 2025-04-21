package com.example.swtp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.config")
@ComponentScan("com.example.endpoint")
public class Swtp1Application {

    public static void main(String[] args) {
        SpringApplication.run(Swtp1Application.class, args);
    }

}


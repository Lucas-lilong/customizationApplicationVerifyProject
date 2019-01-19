package com.lucas.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringApplicationStart {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(SpringApplicationStart.class);
        springApplication.setApplicationContextClass(CustomizeApplicationContext.class);
        springApplication.run(args);
    }
}

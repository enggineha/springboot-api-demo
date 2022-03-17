package org.springboot.api.example.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication()
@EnableAsync
@ComponentScan(basePackages = "org.springboot.api.example.controller")
public class SpringBootRestApiApplication {
    public SpringBootRestApiApplication() {
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestApiApplication.class, args);
    }
}

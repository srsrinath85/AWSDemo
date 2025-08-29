package com.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class fapplication {
    public static void main(String[] args) {
        SpringApplication.run(fapplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "🚀Welcome to Fargate automatically build docker image and pipeline everything!!";
    }
}


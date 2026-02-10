package com.example.ci_cd_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/health")
    public String health() {
        return "OK";
    }

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello from EB CI/CD with JAR!";
    }
}
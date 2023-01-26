package com.example.paygatee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PaygateeApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaygateeApplication.class, args);
    }
    @GetMapping("/")
    public String hello(){
        return "Working";
    }

}

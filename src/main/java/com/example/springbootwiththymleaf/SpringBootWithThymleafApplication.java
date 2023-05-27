package com.example.springbootwiththymleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class SpringBootWithThymleafApplication {

    @GetMapping("/")
    public String getMap(){
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWithThymleafApplication.class, args);
    }

}

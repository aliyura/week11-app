package com.decagon.week11.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public String sayHello(){
        return "This is hello from our dockerized app";
    }

    @GetMapping("thanks")
    public String sayThanks(){
        return "Thank you from CICD";
    }

}

package com.microservice.test.demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestService {

    @GetMapping("getInfo")
    public String getInfo() {

        return "service-1 called";
    }

}

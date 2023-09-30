package com.learning.springboot.demo.myfirstapplication.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FunRestController {

    //inject properties for:coach.name
    @Value("${coach.name}")
    private String name;
    // expose  "/" that return "Hello Work"
    @GetMapping("/rest")
    public String sayHello(){
        return ("App name "+name);
    }


}

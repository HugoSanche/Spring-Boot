package com.learning.springboot.demo.myfirstapplication.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FunRestController {
    // expose  "/" that return "Hello Work"
    @GetMapping("/rest")
    public String sayHello(){
        return ("Hello Word");
    }
}

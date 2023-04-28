package com.learning.springboot.demo.myfirstapplication.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/")
public class FunRestController {
    // expose  "/" that return "Hello Work"
    @GetMapping("/")
    public String sayHello(){
        return ("Hello Word");
    }
    // expose a new end point for "workout"

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5k!";
    }

    //expose a new end point for fortune
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is your lucky day";
    }

}

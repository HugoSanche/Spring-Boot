package com.learning.springboot.demo.myfirstapplication.rest;

import com.learning.springboot.demo.myfirstapplication.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //define a private field for the dependency
    private Coach myCoach;

    //Tells to spring to inject a dependency
    //if you have only one constructor it optional

@Autowired
    public  DemoController(@Qualifier("trackCoach") Coach coach){
        myCoach=coach;
    }
    @GetMapping("/dailyworkout")
    public String myCoach() {
        return myCoach.getDailyWorkout();
    }
}

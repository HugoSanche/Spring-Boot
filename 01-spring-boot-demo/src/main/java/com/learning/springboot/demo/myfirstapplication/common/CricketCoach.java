package com.learning.springboot.demo.myfirstapplication.common;

import org.springframework.stereotype.Component;


//Mark the class as a Spring bean mark available from dependency injection
@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowing for minutes :) xd";
    }
}

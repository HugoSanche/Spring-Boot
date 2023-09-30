package com.learning.springboot.demo.myfirstapplication.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Run Hard 10K";
    }
}

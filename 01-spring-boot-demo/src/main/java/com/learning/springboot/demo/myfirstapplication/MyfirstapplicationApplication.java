package com.learning.springboot.demo.myfirstapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
@SpringBootApplication(
		scanBasePackages = {"com.learning.springboot.demo.myfirstapplication",
				"com.learning.springboot.demo.util"}
)
*/
@SpringBootApplication
public class MyfirstapplicationApplication {
	public static void main(String[] args) {
		SpringApplication.run(MyfirstapplicationApplication.class, args);
	}

}

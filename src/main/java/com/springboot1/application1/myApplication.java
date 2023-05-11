package com.springboot1.application1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("controller")
public class myApplication {

	public static void main(String[] args) {
		SpringApplication.run(myApplication.class, args);
		System.out.println("app is running");
	}
}

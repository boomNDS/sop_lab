package com.example.demo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo3Application {
	@Autowired
	ServiceConfig serviceConfig;

	public static void main(String[] args) {
		SpringApplication.run(Demo3Application.class, args);
	}
	@RequestMapping("/")
	String Home(){
		return serviceConfig.getExampleProperty();
	}
}

package com.example.ServiceDiscoveryClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceDiscoveryClientApplication {
	Student student = new Student("60070057","prapawity");
	public static void main(String[] args) {
		SpringApplication.run(ServiceDiscoveryClientApplication.class, args);
	}
	@RequestMapping("/")
	public String home(){
		return "welcome";
	}
	@RequestMapping("/student")
	Student home2(){
		return student;
	}
}

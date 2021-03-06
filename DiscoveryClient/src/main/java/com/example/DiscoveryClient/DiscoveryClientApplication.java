package com.example.DiscoveryClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
//@EnableFeignClients
public class DiscoveryClientApplication {
	@Autowired
	private ServiceDiscoveryClient servicediscoveryclient;
	public static void main(String[] args) {
		SpringApplication.run(DiscoveryClientApplication.class, args);
	}
	@RequestMapping("/")
	String welcome(){
		return  "welcome";
	}
	@RequestMapping("/home")
	Student home(){
		return servicediscoveryclient.getStudent("60070057");
	}
}

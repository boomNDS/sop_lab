package com.example.demo3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServiceConfig {
	@Value("${name.kwai}")
	private String exampleProperty;
	public String getExampleProperty() {
		return exampleProperty;
	}
}
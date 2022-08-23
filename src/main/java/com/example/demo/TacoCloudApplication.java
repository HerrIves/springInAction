package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class TacoCloudApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(TacoCloudApplication.class, args);
	}

/*
	By extending an existing configuration class, you can avoid creating a new configuration
	class, keeping your project artifact co unt down. But I tend to prefer creating a
	new configuration class for each kind of configuration (web, data, security, and so
	on), keeping the application bootstrap configuration clean and simple.


	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("home");
	}
*/
}

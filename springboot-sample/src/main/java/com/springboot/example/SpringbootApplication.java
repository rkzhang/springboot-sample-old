package com.springboot.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.springboot.example.config.SystemConfiguration;

@SpringBootApplication
@EnableWebMvc
@RestController
public class SpringbootApplication {
	
	@Autowired
	private SystemConfiguration sysConfig;
	
	@RequestMapping("/")
	public String index() {
		return "Hello Spring Boot : " + sysConfig.getName();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
}

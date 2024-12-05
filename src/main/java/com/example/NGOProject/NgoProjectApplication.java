package com.example.NGOProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//@SpringBootApplication
@ComponentScan(basePackages = "com.example.NGOProject")

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class NgoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(NgoProjectApplication.class, args);
	}

}

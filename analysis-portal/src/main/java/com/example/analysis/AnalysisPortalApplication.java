package com.example.analysis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan
@SpringBootConfiguration
@EnableAutoConfiguration
@SpringBootApplication
public class AnalysisPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnalysisPortalApplication.class, args);
	}
}

package com.example.QuizAppApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.QuizAppApi")
@EnableAutoConfiguration
public class QuizAppApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizAppApiApplication.class, args);
	}

}

package com.achiever.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.achiever.entity.Student;

@Configuration
public class MyAppConfig {
	@Bean
	public Student student() {
		return new Student();
	}

	public void display1() {
		System.out.println("Hello");
	}
	
	public void display2() {
		System.out.println("Hello");
	}
}

package com.achiever.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.achiever.model.Student;

@Configuration
public class MyAppConfig {
	@Bean
	public Student student() {
		return new Student();
	}

}

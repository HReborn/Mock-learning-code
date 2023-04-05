package com.mock_learning_code.springframework.fullannotationbased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Samsung getPhone() {
		return new Samsung();
	}
}

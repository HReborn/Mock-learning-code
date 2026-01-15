package com.learning.angular_server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AngularMappings {
	
	@GetMapping("/")
	public String greet() {
		return "First mapping not yet linked with angular.";
	}
}
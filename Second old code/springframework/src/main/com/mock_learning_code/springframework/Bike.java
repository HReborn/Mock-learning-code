package com.mock_learning_code.springframework;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {

	@Override
	public void drive() {
		System.out.println("Riding a bike.");
		
	}

}

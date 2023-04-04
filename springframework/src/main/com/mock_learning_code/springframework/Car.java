package com.mock_learning_code.springframework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
	
	@Autowired
	private Tire tire;
	
	@Override
	public void drive() {
		System.out.println("Riding a car with " + tire + ".");
		
	}

}

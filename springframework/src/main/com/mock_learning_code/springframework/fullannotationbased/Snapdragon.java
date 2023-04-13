package com.mock_learning_code.springframework.fullannotationbased;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements MobileProcessor {

	private String modelName = "Snapdragon";

	@Override
	public void process() {
		System.out.println("Processed.");
	}

	@Override
	public String toString() {
		return modelName;
	}
}

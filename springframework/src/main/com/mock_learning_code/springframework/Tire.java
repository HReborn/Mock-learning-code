package com.mock_learning_code.springframework;

public class Tire {
	private String brand;

	public Tire(String brand) {
		super();
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Tire [brand=" + brand + "]";
	}
}

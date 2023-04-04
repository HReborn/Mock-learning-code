package com.mock_learning_code.springframework;

public class Tire {
	private String brand;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Tire [brand=" + brand + "]";
	}
}

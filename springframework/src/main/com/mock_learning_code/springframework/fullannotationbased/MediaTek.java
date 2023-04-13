package com.mock_learning_code.springframework.fullannotationbased;

import org.springframework.stereotype.Component;

@Component
public class MediaTek implements MobileProcessor {

	private String modelName = "MediaTek";

	@Override
	public void process() {
		System.out.println("Processing.");
	}

	@Override
	public String toString() {
		return modelName;
	}
}

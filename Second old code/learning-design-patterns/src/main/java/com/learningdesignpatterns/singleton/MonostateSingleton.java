package com.learningdesignpatterns.singleton;

public class MonostateSingleton {
	private static int executionCounter;
	private String name;
	
	public int getExecutionCounter() {
		return executionCounter;
	}
	
	MonostateSingleton(String name) {
		this.name = name;
	}
	
	public void execute() {
		executionCounter++;
		System.out.println("Execution request from " + this.name + ". Counter: " + executionCounter + ".");
	}
}

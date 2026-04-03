package com.learningdesignpatterns.singleton;

public class LazySingleton {
	private static LazySingleton instance;
	private int executionCounter = 0;
	private String name = "Sora";
	
	public int getExecutionCounter() {
		return executionCounter;
	}

	LazySingleton() {}

	public static LazySingleton getInstance() {
		if (instance==null) {
			instance = new LazySingleton();
		}
		return instance;
	}

	public void execute() {
		executionCounter++;
		System.out.println("Execution request from " + this.name + ". Counter: " + executionCounter + ".");
	}
}

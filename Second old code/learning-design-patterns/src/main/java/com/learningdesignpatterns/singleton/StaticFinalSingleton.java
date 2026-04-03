package com.learningdesignpatterns.singleton;

public class StaticFinalSingleton {
	private static final StaticFinalSingleton instance = new StaticFinalSingleton();
	private int executionCounter = 0;
	private String name = "Carlitos";
	
	public int getExecutionCounter() {
		return executionCounter;
	}

	StaticFinalSingleton() {}

	public static StaticFinalSingleton getInstance() {
		return instance;
	}

	public void execute() {
		executionCounter++;
		System.out.println("Execution request from " + this.name + ". Counter: " + executionCounter + ".");
	}
}

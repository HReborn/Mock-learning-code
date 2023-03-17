package com.learningdesignpatterns.singleton;

public enum EnumSingleton {
	INSTANCE;
	private int executionCounter = 0;
	private String name = "Kathy";
	
	public int getExecutionCounter() {
		return executionCounter;
	}

	public void execute() {
		executionCounter++;
		System.out.println("Execution request from " + this.name + ". Counter: " + executionCounter + ".");
	}
}

package com.learningdesignpatterns.singleton;

public class Main {

	public static void main(String[] args) {
		MonostateSingleton mono1 = new MonostateSingleton("mono1");
		MonostateSingleton mono2 = new MonostateSingleton("mono2");
		EnumSingleton enum1 = EnumSingleton.INSTANCE;
		EnumSingleton enum2 = EnumSingleton.INSTANCE;
		StaticFinalSingleton stf1 = StaticFinalSingleton.getInstance();
		StaticFinalSingleton stf2 = StaticFinalSingleton.getInstance();
		LazySingleton laze1 = LazySingleton.getInstance();
		LazySingleton laze2 = LazySingleton.getInstance();
		
		System.out.println("Checking monostate. Should have diff requesters.");
		while(mono1.getExecutionCounter() < 10) {
			mono1.execute();
			mono2.execute();
		}
		System.out.println("Checking enum type. Should have same requesters.");
		while(enum1.getExecutionCounter() < 10) {
			enum1.execute();
			enum2.execute();
		}
		System.out.println("Checking static final type. Should have same requesters.");
		while(stf1.getExecutionCounter() < 10) {
			stf1.execute();
			stf2.execute();
		}
		System.out.println("Checking lazy type. Should have same requesters.");
		while(laze1.getExecutionCounter() < 10) {
			laze1.execute();
			laze2.execute();
		}
	}
	
}

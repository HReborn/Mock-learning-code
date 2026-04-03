package com.mocklearningcode.streamsoptionalsandlambdas.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;


public class LambdaTesting {
	
	
	public static void main(String[] args) {
	
		ArrayList<String> list = new ArrayList<>(Arrays.asList("um", "dois"));
		list.forEach(currValue -> System.out.println(currValue));
		System.out.println("\nOutro approach\n");
		Consumer<String> consumer = currValue -> {
			System.out.println(currValue);
		};
		list.forEach(consumer);
		System.out.println("\nOutro approach\n");
		list.forEach(System.out::println);
		System.out.println("\nOutro approach\n");
		VoidAndOneParMethod voidAndOneParMethod = new VoidAndOneParMethod();
		list.forEach(voidAndOneParMethod::print);
	}
}

class VoidAndOneParMethod {
	public void print(String thingToPrint) {
		System.out.println(thingToPrint);
	}
}

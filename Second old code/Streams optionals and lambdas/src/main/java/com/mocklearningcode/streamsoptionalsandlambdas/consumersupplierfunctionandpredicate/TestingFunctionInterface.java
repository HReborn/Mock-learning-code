package com.mocklearningcode.streamsoptionalsandlambdas.consumersupplierfunctionandpredicate;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToDoubleFunction;

public class TestingFunctionInterface {
	public static void main(String[] args) {
		// Primeiro define
		Function<Integer, String> intStr = i -> String.valueOf(i);
		int meth = intStr.andThen(i -> Integer.valueOf(i)).apply(12);
		int lamb = intStr.andThen(Integer::valueOf).apply(12);
		System.out.println("Should return 24 - > " + (meth + lamb));
		
		Function<String, Integer> strInt = i -> Integer.valueOf(i) * 10;
		Function<Integer, Double> intDoub = i -> i / 2.0;
		
		double then = strInt.andThen(intDoub).apply("12");
		System.out.println("andThen should return 60.0: " + then);
		
		Function<Double, String> doubStr = i -> String.valueOf(i);
		String compos = doubStr.compose(intDoub).apply(12);
		System.out.println("compose should return a string of value 6.0: " + compos);
		System.out.println("Is compose a string: " + (compos instanceof String));
		
		// receives a primitive int
		IntFunction<String> primitiveInt = String::valueOf;
		System.out.println("Primitive int should return a string. Is String: " + (primitiveInt.apply(12) instanceof String));
		
		// returns a primitive double
		ToDoubleFunction<String> todouble = Double::valueOf;
		System.out.println("With a string input, toDoubleFunction should return a primitive 12.0 double. Is double: " + todouble.applyAsDouble("12"));		
	}
}

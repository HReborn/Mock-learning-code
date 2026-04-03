package com.mocklearningcode.streamsoptionalsandlambdas.optionals;

import java.util.Optional;

public class OptionalsTesting {
	public static void main(String[] args) {
		
		Optional<Integer> integ = Optional.ofNullable(null);
		System.out.println(integ.get());
	}
}

package com.mocklearningcode.streamsoptionalsandlambdas.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTesting {
	public static void main(String[] args) {
		
		List<Person> ppl = getPeople();
		
		Optional<Person> muin = ppl.stream()
				.filter(p -> p.getAge() < 50)
				.min(Comparator.comparing((Person::getAge)));
		System.out.println(muin.orElseThrow());
		
		List<Person> newlist = ppl.stream()
				.filter(p -> p.getAge() < 15)
				.collect(Collectors.toList());		
		System.out.println(newlist);
		
		String nameFromJoining = ppl.stream()
				.map(Person::getName)
				.collect(Collectors.joining("; "));
		System.out.println(nameFromJoining);
		
		Optional<Integer> ageSumFromReduce = ppl.stream()
				.map(Person::getAge)
				.reduce((n1, n2) -> n1+n2);
		System.out.println(ageSumFromReduce.orElseThrow());
		
		Map<String, List<Person>> grouperByInitial = ppl.stream()
				.sorted(Comparator.comparing(Person::getName))
				.collect(Collectors.groupingBy(p -> p.getName().substring(0, 1)));
		
		System.out.println(grouperByInitial);
	}
	
	
	private static List<Person> getPeople() {
	    return List.of(
	        new Person("Antonio", 20, Gender.MALE),
	        new Person("Alina Smith", 33, Gender.FEMALE),
	        new Person("Helen White", 57, Gender.FEMALE),
	        new Person("Alex Boz", 14, Gender.MALE),
	        new Person("Jamie Goa", 99, Gender.MALE),
	        new Person("Anna Cook", 7, Gender.FEMALE),
	        new Person("Zelda Brown", 120, Gender.FEMALE)
	    );
	}
}

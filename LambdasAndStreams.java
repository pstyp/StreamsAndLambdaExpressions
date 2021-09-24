package com.qa.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;







public class LambdasAndStreams {
	
	public static void main(String[] args) {
		
	
	List<String> myList = List.of("cat", "dog", "goat");
		
		//forEach	
		
		myList.forEach(x -> System.out.println(x));
		
		// Streams
		Stream<String> myStream = Stream.of("cat", "dog", "parrot");
		
		List<Integer> numbers = Arrays.asList(2, 3, 4, 5);
		
		Stream<Integer> square = numbers.stream();
		
		// filter
//		myStream.filter(x -> x.contains("a")).forEach(x -> System.out.println(x));
		
		// maps
//		myStream.map(x -> x.toUpperCase()).forEach(x -> System.out.println(x));
		
		// collectors
//		List<String> myStringList = myStream.map(x -> x.toUpperCase()).collect(Collectors.toList());
//		
//		System.out.println(myStringList);
		
		// sorted
//		List<String> nameList = Arrays.asList("Zac", "Angelica", "Liam", "Anoush", "Celine", "Bob");
//		List<String> result = nameList.stream().sorted().collect(Collectors.toList());
//		
//		System.out.println(nameList);
//		System.out.println(result);
		
		// reduce
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
		int multiply = nums.stream().reduce((a,  b) -> a*b).get();
		
		
		
		System.out.println(multiply);
		
		// THIS IS A PIPELINE! (I used a few methods in a row)
		int evenSum = nums.stream().filter(x ->x % 2 == 0).reduce((a,  b) -> a+b).get();
		
		
		System.out.println(evenSum);
		
	}
	
}

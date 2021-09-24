package com.qa.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExercises {

	public static void main(String[] args) {

		// Given the following List of names, using a stream, have it print "Hello " in
		// front of each name besides "James". Don't print James on its own.
		List<String> myList = List.of("Michael", "Dean", "James", "Chris");

		myList.stream().filter(x -> !x.equals("James")).forEach(x -> System.out.println("Hello " + x));

		// Alternative solution if you want to print out James too
		List<String> myNewList = myList.stream().filter(x -> !x.equals("James")).map(x -> "Hello " + x)
				.collect(Collectors.toList());

		myNewList.add("James");
		
		myNewList.forEach(x -> System.out.println(x));
		
		// Given the following List of Integers, using a stream, have it reduce and
		// print the product (all numbers multiplied together).
		List<Integer> myList2 = List.of(3, 4, 7, 8, 12);

		System.out.println(myList2.stream().reduce((a, b) -> a * b).get());

//	Starting with a list of numbers, use streams to do the following:
		List<Integer> myList3 = List.of(3, 4, 7, 8, 12);

//	Find the max value.

		System.out.println(myList3.stream().max(Integer::compare));
		System.out.println(myList3.stream().max((a, b) -> Integer.compare(a, b)));

//	Find the min value.

		System.out.println(myList3.stream().min(Integer::compare));
		System.out.println(myList3.stream().min((a, b) -> Integer.compare(a, b)));

//	Remove the odd numbers.	

		myList3.stream().filter(x -> x % 2 == 0).forEach(x -> System.out.println(x));

//	Remove the even numbers.
		myList3.stream().filter(x -> x % 2 != 0).forEach(x -> System.out.println(x));

//  Find the sum of the list.
		System.out.println(myList3.stream().reduce((a, b) -> a + b).get());

//  Square every number in the list then remove the even numbers and then find the min value.	

		System.out.println(myList3.stream().map(x -> x * x).filter(x -> x % 2 != 0).min(Integer::compare));
	}

}

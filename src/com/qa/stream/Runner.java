package com.qa.stream;

import java.util.List;

public class Runner {

	public static void main(String[] args) {
		//Given the following List of names, using a stream, have it print "Hello " in front of each name besides "James".
		List<String> names = List.of("Micheal", "Dean", "James", "Chris");
		names.stream().map(x -> "Hello " + x).forEach(x -> System.out.println(x));
		
		//Given the following List of Integers, using a stream, have it reduce and print the product (all numbers multiplied together).
		List<Integer> numbers = List.of(3,4,7,8,12);
		System.out.println(numbers.stream().reduce((x, y) -> x * y).get());
		
		//Starting with a list of numbers, use streams to do the following:
		//Find the max value.
		System.out.println(numbers.stream().mapToInt(x -> x).max().getAsInt());
		
		//Find the min value.
		System.out.println(numbers.stream().mapToInt(x -> x).min().getAsInt());
		
		//Remove the odd numbers.
		numbers.stream().filter(x -> x % 2 == 0).forEach(x -> System.out.println(x));
		
		//Remove the even numbers.
		System.out.println();
		numbers.stream().filter(x -> x % 2 != 0).forEach(x -> System.out.println(x));
		
		//Find the sum of the list.
		System.out.println();
		System.out.println(numbers.stream().reduce((x, y) -> x + y).get());
		
		//Square every number in the list then remove the even numbers and then find the min value.
		System.out.println(numbers.stream().map(x -> x * x).filter(x -> x % 2 != 0).mapToInt(x -> x).min().getAsInt());
	}
}

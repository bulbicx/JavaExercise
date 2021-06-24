package com.qa.array;

public class Array {

	public static int[] numArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
	
	public static void main(String[] args) {
		
//		createArray();
//		createArrayTwo();
//		stringArray();
//		intArray();
		System.out.println(trueOrFalse(10));
		System.out.println(trueOrFalse(15));
		enhancedPrintArray();
	}
	
	//Create an array that will hold 10 integer values, populate the array with values, then call and output each element.
	public static void createArray() {
		int[] numbers = new int[10];
		
		for (int i = 0; i < 10; i++) {
			numbers[i] = i + 2;
		}
		
		for (int el : numbers) {
			System.out.println(el);
		}
	}

	
	//Create a for loop that populates an integer array with values, outputting them at each iteration.
	//Then create another loop that iterates through the array, changing the values at each point to equal 
	//itself times 10, outputting them at each iteration.
	public static void createArrayTwo() {
		int[] numbers = new int[10];
		
		for (int i = 0; i < 10; i++) {
			numbers[i] = i + 5;
			System.out.println(numbers[i]);
		}
		
		for (int i = 0; i < 10; i++) {
			numbers[i] = numbers[i] * 10;
			System.out.println(numbers[i]);
		}
	}
	
	//Create an array of strings and iterate through it, printing each value to console, using an enhanced for loop.
	public static void stringArray() {
		String[] wordsArr = {"Joanna", "Fish", "Apple", "Luis", "Bar"};
		
		for (String el : wordsArr) {
			System.out.println(el);
		}
	}
	
	//Create an array of integers 1-20 and iterate through it, using an enhanced for loop, square, and then print each value.
	public static void intArray() {
		
		for (int el : numArr) {
			System.out.println(el);
		}
		
		for (int el : numArr) {
			el = el * el;
			System.out.println(el);
		}
	}
	
	//Create a method that returns a boolean and accepts an integer as a parameter, if the integer is even, return true, if not then return false.
	public static boolean trueOrFalse(int num) {
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	//Using the array of integers from exercise 2 and the method created in exercise 3; iterate through the array using an enhanced for loop, 
	//calling the method from exercise 3 in the body. If the value is even, cube it, then print it to console.
	//If the value is odd, square it, then print it to console.
	public static void enhancedPrintArray() {
		
		for (int el : numArr) {
			if (trueOrFalse(el)) {
				el = el * el * el;
				System.out.println(el);
			} else {
				el = el * el;
				System.out.println(el);
			}
			
		}
	}
}

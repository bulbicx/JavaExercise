package com.qa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.qa.apackage.Calculator;
import com.qa.inheritance.Animal;
import com.qa.inheritance.Bird;
import com.qa.inheritance.Dog;
import com.qa.inheritance.Duck;

public class Runner {

	private static Scanner scanner = new Scanner(System.in);
	private static Calculator calculator = new Calculator();
	
	public static void main(String[] args) {

//		Dog myDog = new Dog("hehe", 4);
//		System.out.println(myDog.getSpecies());
//		
//		myDog.eat();
//		myDog.bark();
//		
//		Bird myBird = new Bird();
//		myBird.eat();
//		myBird.chipping();
//		myBird.setName("Nice birdy");
//		System.out.println(myBird.getName());
//		
//		Animal anotherBird = new Bird();
//		anotherBird.eat();
//		anotherBird.setAge(23);
//		System.out.println(anotherBird.getAge());
//		
//		Duck myDuck = new Duck();
//		myDuck.chipping();
//		myDuck.eat();
//		myDuck.ducking();
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("> ");
//		String s = scanner.nextLine();
//		
//		System.out.println(s);
		getInputAndPerformCalculation();
		scanner.close();
		
		
		//Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.

		//It should remove all values from list a, which are present in list b keeping their order.
//		int a[] = {1, 2};
//		int b[] = {1};
//	    List<Integer> aList = new ArrayList<>();
//	    for(int num : a) {
//	    	aList.add(num);
//	    }
//	    System.out.println(aList);
//	    
//	    for(int i = 0; i < a.length; i++) {
//		    System.out.println(i);
//	      for(int x = 0; x < b.length; x++) {
//	  	    System.out.println(x);
//	          if(a[i] == b[x]) {
//	            aList.remove(i);
//	          }
//	      }
//	    }
//	    
//	    System.out.println(Arrays.toString(aList.toArray()));
	}

	public static void getInputAndPerformCalculation() {
		System.out.println("Which operation would you like to perform?");
		String input = scanner.nextLine();
		String output;
		double num1;
		double num2; 
		
		System.out.println("Enter num 1: ");
		num1 = getNumber();
		System.out.println("Enter num 2: ");
		num2 = getNumber();
		
		switch (input) {
		case "+":
			output = String.valueOf(calculator.add(num1, num2));
			break;
		case "-":
			output = String.valueOf(calculator.subtract(num1, num2));
			break;
		case "/":
			output = String.valueOf(calculator.divide(num1, num2));
			break;
		case "*":
			output = String.valueOf(calculator.multiply(num1, num2));
			break;
		default:
			output = "Invalid operation";
		}
		
		System.out.println("ANSWER: " + output);
	}
	
	public static double getNumber() {
		return scanner.nextDouble();
	}
}

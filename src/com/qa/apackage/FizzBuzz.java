package com.qa.apackage;

public class FizzBuzz {

	public static void main(String[] args) {
		System.out.println(FizzOrBuzz(9));
		System.out.println(FizzOrBuzz(15));
		System.out.println(FizzOrBuzz(20));
		System.out.println(FizzOrBuzz(17));

	}
	
	public static String FizzOrBuzz(int num) {
		if (num % 3 == 0 && num % 5 == 0) {
			return "FizzBuzz";
		} else if (num % 3 == 0) {
			return "Fizz";
		} else if (num % 5 == 0) {
			return "Buzz";
		} else {
			return "" + num;
		}
	}

}

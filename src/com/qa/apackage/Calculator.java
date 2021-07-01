package com.qa.apackage;

public class Calculator {

	public static void main(String[] args) {
		//division(7, 5);

	}
	
	public static double divide (double a, double b) {
		if (b == 0) return 0;
		else return a / b;
	}
	
	public static double multiply (double a, double b) {
		return a * b;
	}
	
	public static double add (double a, double b) {
		return a + b;
	}
	
	public static double subtract (double a, double b) {
		return a - b;
	}

}

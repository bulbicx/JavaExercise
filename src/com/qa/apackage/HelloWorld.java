package com.qa.apackage;


public class HelloWorld {

	public static void main(String[] args) {
		System.out.println(add(3 ,5));
		System.out.println(subtract(10 ,5));
		System.out.println(divide(20 ,7));
		System.out.println(multiply(40 ,5));
	}
	
	public static int add (int a, int b) {
		return a + b;
	}
	
	public static int subtract (int a, int b) {
		return a - b;
	}
	
	public static double divide (double a, double b) {
		return a / b;
	}
	
	public static int multiply (int a, int b) {
		return a * b;
	}

}

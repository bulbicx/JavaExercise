package com.qa.apackage;

public class Calculator {

	public static void main(String[] args) {
		division(7, 5);

	}
	
	public static void division (double a, double b) {
		if (a < b) {
			System.out.println(a / b); 
		} else {
			System.out.println("The division cannot be performed");
		}
	}

}

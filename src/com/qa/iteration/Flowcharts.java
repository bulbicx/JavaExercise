package com.qa.iteration;

public class Flowcharts {

	public static void main(String[] args) {
		printA(100);
		printApartTwo(100);
		printTenTimes();
		printNumTimes();
	}
	
	public static void printA(int a) {
		while (a <= 200) {
			System.out.println(a);
			a++;
		}
	}
	
	public static void printApartTwo(int a) {
		while (a <= 200) {
			if (a % 2 == 0) {
				System.out.println("-");
				a++;				
			} else {
				System.out.println("*");
				a++;
			}
		}
	}
	
	//Create a method that can print out the numbers 1-10 10 times each.
	public static void printTenTimes() {
		for (int i = 1; i <= 10; i++) {
			for (int x = 1; x <= 10; x++) {
				System.out.println(i);
			}
		}
	}
	
	//Create a method to print the numbers 1 to 10 as many times as the value of that number.
	//For example; you will print 1 once, and 10 ten times.
	public static void printNumTimes() {
		for (int i = 1; i <= 10; i++) {
			for (int x = 1; x <= i; x++) {
				System.out.println(i);
			}
		}
	}

}


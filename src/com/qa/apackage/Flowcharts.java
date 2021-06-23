package com.qa.apackage;

public class Flowcharts {

	public static void main(String[] args) {
		//System.out.println(operation(2, 5, true)); 
		//System.out.println(operation(3, 3, false));
		
		printLetterOrNumber(7000);
		//printLetterOrNumber(4000);
		//printLetterOrNumber(600);

	}
	
	public static int operation (int a, int b, boolean value) {
		if (value) {
			return a + b;
		} else {
			return a * b;
		}
	}
	
	public static void printLetterOrNumber (int a) {
		
		if (a > 2000) {
			System.out.println("A");
			if (a > 6000) {
				System.out.println("C");
			} else {
				System.out.println("B");
				if (a > 4000) {
					System.out.println("D");
				} else {
					System.out.println("E");
				}
			}
		} else {
			System.out.println(1);
			if (a > 100) {
				System.out.println(3);
				if (a > 600) {
					System.out.println(4);
					if (a > 500) {
						System.out.println(6);
					} else {
						System.out.println(7);
					}
				} else {
					System.out.println(5);
				}
			} else {
				System.out.println(2);
			}
		}
	}

}

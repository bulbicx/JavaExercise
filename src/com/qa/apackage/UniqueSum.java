package com.qa.apackage;

public class UniqueSum {

	public static void main(String[] args) {
		System.out.println(sumUniqueNum(1, 2, 3));
		System.out.println(sumUniqueNum(3, 3, 3));
		System.out.println(sumUniqueNum(1, 1, 2));
		System.out.println(sumUniqueNum(2, 1, 2));
		System.out.println(sumUniqueNum(1, 2, 2));

	}
	
	//Given 3 integer values, return their sum. If one value is the same as another value, they do not count towards the sum. 
	//In other words, only return the sum of unique numbers given.
	public static int sumUniqueNum (int a, int b, int c) {
		if (a != b && b != c && c != a) {
			return a + b + c;
		} else if (a == b || b == c || c == a) {
			if (a == b && b != c) {
				return c;
			} else if (b == c && c != a) {
				return a;
			} else if (c == a && a != b) {
				return b;
			} else {
				return 0;
			}
		} 
		
		return -1;
	}

}

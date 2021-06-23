package com.qa.apackage;

public class Blackjack {

	public static void main(String[] args) {
		System.out.println(play (10, 21)); // 21
		System.out.println(play (20, 18));// 20
		System.out.println(play (1, 22));// 1
		System.out.println(play (22, 23));// 0

	}
	
	//Given 2 integer values greater than 0, return whichever is closest to 21 without going over 21. 
	//If they both go over 21 then return 0.
	public static int play (int a, int b) {
		if (a > 21 && b > 21) {
			return 0;
		} else if (a > 21 && b <= 21) {
			return b;
		} else if (a <= 21 && b > 21) {
			return a;
		} else {
			// return closest number to 21
			int numA = 21 - a;
			int numB = 21 - b;
			
			if (numA < numB) {
				return a;
			} else if (numA >= numB) {
				return b;
			} 
			return 1; // it will never run
		}
	}

}

package com.qa.bonusexercises;

import java.util.ArrayList;
import java.util.List;

public class Bonus {

	public static void main(String[] args) {
		System.out.println(isPrimeNumber(1));
		System.out.println(isPrimeNumber(2));
		System.out.println(isPrimeNumber(3));
		System.out.println(isPrimeNumber(5));
		System.out.println(isPrimeNumber(7));
		System.out.println(isPrimeNumber(51));
		System.out.println(isPrimeNumber(17));
		
		greatCommonDivisor(12, 6);
		greatCommonDivisor(12, 2);
		greatCommonDivisor(12, 5);
		
		BottlesOfBeerSong();
	}

	//A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself. Write a method that checks if a 
	//number is a prime number.
	public static boolean isPrimeNumber(int number) {
		if (number > 1) {
			int numDivisible = 0;
			
			for (int i = 2; i <= number; i++) {
				if (number % i == 0) {
					numDivisible++;
				}
			}
			
			if (numDivisible == 1) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	//The Greatest Common Divisor of two positive integers is the largest integer that divides both without remainder. 
	//Write a method that returns the Greatest Common Divisor of p and q.
	public static void greatCommonDivisor(int p, int q) {
		
		if (p > 0 && q > 0) {
			if (p > q) { //if p greater than q
				if (p % p == 0 && p % q == 0) {
					System.out.println(p + " is the Greatest Common Divisor");
				} else {
					System.out.println("No Common Divisor found");
				}
						
			} else if (q > p) { // if q greater than p
				if (q % q == 0 && q % p == 0) {
					System.out.println(q + " is the Greatest Common Divisor");
				} else {
					System.out.println("No Common Divisor found");
				}
			}
		} else {
			System.out.println("Numbers must be both positive");
		}
	}
	
	public static void BottlesOfBeerSong() {
		for (int i = 99; i >= 0; i--) {
			if (i == 0) {
				System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
				System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
			} else {
				System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
				System.out.println("Take one down and pass it around, " + (i - 1) + " bottles of beer on the wall.");
			}
		}
	}
	

}

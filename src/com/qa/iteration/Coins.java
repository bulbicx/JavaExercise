package com.qa.iteration;

public class Coins {

	public static void main(String[] args) {
		
		giveChange(4.58, 20);
	}
	
	public static void giveChange(double cost, int amount) {
		int fifties = 0;
		int twenties = 0;
		int tens = 0;
		int fives = 0;
		int twos = 0; 
		int ones = 0; 
		int fiftyPennies = 0;
		int twentyPennies = 0;
		int tenPennies = 0;
		int fivePennies = 0;
		int twoPennies = 0;
		int onePennies = 0;
		
		double changeDue = amount - cost;
		
		while (changeDue >= 50) {
			changeDue -= 50;
			fifties++;
		}
		if (fifties > 0) {
			System.out.println(fifties + " 50£ note");			
		}
		
		while (changeDue >= 20) {
			changeDue -= 20;
			twenties++;
		}
		if (twenties > 0) {
			System.out.println(twenties + " 20£ note");			
		}
		
		while (changeDue >= 10) {
			changeDue -= 10;
			tens++;
		}
		if (tens > 0) {
			System.out.println(tens + " 10£ note");			
		}
		
		while (changeDue >= 5) {
			changeDue -= 5;
			fives++;
		}
		if (fives > 0) {
			System.out.println(fives + " 5£ note");			
		}
		
		while (changeDue >= 2) {
			changeDue -= 2;
			twos++;
		}
		if (twos > 0) {
			System.out.println(twos + " 2£ pound");			
		}
		
		while (changeDue >= 1) {
			changeDue += 0.001; //adjust not precise operation
			changeDue -= 1;
			ones++;
		}
		if (ones > 0) {
			System.out.println(ones + " 1£ pound");			
		}
		
		while (changeDue >= 0.5) {
			changeDue += 0.001;
			changeDue -= 0.5;
			fiftyPennies++;
		}
		if (fiftyPennies > 0) {
			System.out.println(fiftyPennies + " 50p's");			
		}
		
		while (changeDue >= 0.2) {
			changeDue += 0.001;
			changeDue -= 0.2;
			twentyPennies++;
		}
		if (twentyPennies > 0) {
			System.out.println(twentyPennies + " 20p's");			
		}
		
		while (changeDue >= 0.1) {
			changeDue += 0.001;
			changeDue -= 0.1;
			tenPennies++;
		}
		if (tenPennies > 0) {
			System.out.println(tenPennies + " 10p's");			
		}
		
		while (changeDue >= 0.05) {
			changeDue += 0.001;
			changeDue -= 0.05;
			fivePennies++;
		}
		if (fivePennies > 0) {
			System.out.println(fivePennies + " 5p's");			
		}
		
		while (changeDue >= 0.02) {
			changeDue += 0.001;
			changeDue -= 0.02;
			twoPennies++;
		}
		if (twoPennies > 0) {
			System.out.println(twoPennies + " 2p's");			
		}
		
		while (changeDue >= 0.01) {
			changeDue += 0.001;
			changeDue -= 0.01;
			onePennies++;
		}
		if (onePennies > 0) {
			System.out.println(onePennies + " 1p's");			
		}
	}

}

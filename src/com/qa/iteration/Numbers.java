package com.qa.iteration;


public class Numbers {
	
	private static int sum = 0;
	private static String text = "";
	
	public static void main(String[] args) {
		System.out.println(sumDigit(15));
		
		System.out.println(convertNumToText(20));
		System.out.println(convertNumToText(70));
		System.out.println(convertNumToText(11));
		System.out.println(convertNumToText(1));
		System.out.println(convertNumToText(2));
		System.out.println(convertNumToText(3));
		System.out.println(convertNumToText(4));
		System.out.println(convertNumToText(5));
		System.out.println(convertNumToText(6));
		System.out.println(convertNumToText(7));
		System.out.println(convertNumToText(8));
		System.out.println(convertNumToText(9));
		System.out.println(convertNumToText(99));
		System.out.println(convertNumToText(10));
		System.out.println(convertNumToText(89));
	}
	
	public static int sumDigit(int number) {
		if (number >= 10 && number <= 99) {
			int firstDigit = Integer.parseInt(Integer.toString(number).split("")[0]);
			int secondDigit = Integer.parseInt(Integer.toString(number).split("")[1]);
			sum = firstDigit + secondDigit;
		}
		return sum;
	}
	
	public static String convertNumToText (int number) {
		int [] listOneToNine = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		String [] listStringOneToNine = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		int [] list11To19 = {11, 12, 13, 14, 15, 16, 17, 18, 19};
		String [] listString11To19 = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		int [] listTens = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		String [] listStringTens = {"ten", "twenty", "thirty", "Fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		
		if (number >= 1 && number <= 99) {
			for (int i = 0; i < 9; i++) {
				if (number < 10) {
					if (number == listOneToNine[i]) {
						text = listStringOneToNine[i];
						return text;
					}
				} else if (number >= 11 && number <= 19) {
					if (number == list11To19[i]) {
						text = listString11To19[i];
						return text;
					}
				} else {
					int firstDigit = Integer.parseInt(Integer.toString(number).split("")[0]);
					int secondDigit = Integer.parseInt(Integer.toString(number).split("")[1]);
					
					if (firstDigit == i + 1 && secondDigit == 0) {
						text = listStringTens[i];
						return text;
					} else if (firstDigit == i + 1 && secondDigit != 0) {
						text = listStringTens[i] + "-"; 
						for (int x = 0; x <= 9; x++) {
							if (listOneToNine[x] == secondDigit) {
								text += listStringOneToNine[x];
								break;
							}
						}
						return text;
					}
				}
			}
		}
		return text;
	}
	
	

}

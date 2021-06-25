package com.qa.iteration;


public class NumbersPartTwo {

	public static void main(String[] args) {
		transformNumbersToText();
	}
	
	public static void transformNumbersToText() {
		String[] oneToNineLs = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		String[] elevenToNineteenLs = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		String[] tensLs = {"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety", "hundred"};
		int indexElevens = 0;
		int indexTens = 0;
		int index = 1;
		
		for (int i = 1; i <= 100; i++) {
			if (i < 10) {
				System.out.println(oneToNineLs[i - 1]);				
			} else if (i > 10 && i < 20) {
				System.out.println(elevenToNineteenLs[indexElevens]);
				indexElevens++;
			}  else if (i >= 20 && i <= 100) {
				int secondDigit = Integer.parseInt(Integer.toString(i).split("")[1]);
				
				if (secondDigit == 0) { // if number is tens like 20, 30, 40 etc
					System.out.println(tensLs[indexTens + 1]);
					indexTens++;
				} else { // any other number more than 20 containing a second digit between 1 and 9
					for (int z = 0; z < 9; z++) {
						System.out.println(tensLs[index] + "-" + oneToNineLs[z]);
					}
					index++;
					i += 8;
				}
				
			}
		}
	}

}

package com.qa.iteration;


public class Numbers {
	
	private static int sum = 0;
	
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
		System.out.println(convertNumToText(99));
		System.out.println(convertNumToText(100));
		System.out.println(convertNumToText(104));
		System.out.println(convertNumToText(110));
		System.out.println(convertNumToText(115));
		System.out.println(convertNumToText(150));
		System.out.println(convertNumToText(800));
		System.out.println(convertNumToText(999));
		
		System.out.println(convertNumToText(1000));
		System.out.println(convertNumToText(4003));
		System.out.println(convertNumToText(6017));
		
		System.out.println(convertNumToText(6016));
		System.out.println(convertNumToText(6018));
		System.out.println(convertNumToText(6018));
		System.out.println(convertNumToText(6020));
		System.out.println(convertNumToText(6015));
		System.out.println(convertNumToText(6014));
		
		System.out.println(convertNumToText(7022));
		System.out.println(convertNumToText(4512));
		System.out.println(convertNumToText(6038));
		
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
		String text = "";
		int [] listOneToNine = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		String [] listStringOneToNine = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		int [] list11To19 = {11, 12, 13, 14, 15, 16, 17, 18, 19};
		String [] listString11To19 = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		int [] listTens = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		String [] listStringTens = {"ten", "twenty", "thirty", "Fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		String [] listStringHundreds = {"hundred", "two-hundred", "three-hundred", "four-hundred", "five-hundred", "six-hundred", "seven-hundred", "eight-hundred", "nine-hundred"};
		String [] listThousands = {"one-thousand", "two-thousand", "three-thousand", "four-thousand", "five-thousand", "six-thousand", "seven-thousand", "eight-thousand", "nine-thousand"};
		int[] listThousandsInt = {1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000};
		int firstDigit = Integer.parseInt(Integer.toString(number).split("")[0]);
		
		if (number >= 1 && number <= 99) {
			return transformTensToText(number, listOneToNine, list11To19, listStringOneToNine, listString11To19, firstDigit, listStringTens);
		} else if (number > 999 && number < 10000) { // do thousand first
			int num = number;
			int secondDigit = Integer.parseInt(Integer.toString(number).split("")[1]);
			int thirdDigit = Integer.parseInt(Integer.toString(number).split("")[2]);
			int fourthDigit = Integer.parseInt(Integer.toString(number).split("")[3]);
			
			if (secondDigit == 0 && thirdDigit == 0 && fourthDigit != 0) { // if number is 1001, 2003, 4003 etc
				for (int i = 0; i < 9; i++) {
					if (firstDigit == i + 1) { // if first digit is 1 assign 1000, 2 assign 2000 etc
						text = listThousands[i];
						break;
					}				
				}
				
				for (int x = 0; x < 9; x++) {
					if (listOneToNine[x] == fourthDigit) { //assign last digit 1 to 9
						text += "-and-" + listStringOneToNine[x];
						break;
					}
				}
				return text;
			}
			
			if (secondDigit == 0 && thirdDigit >= 1 && fourthDigit <= 99) {
				for (int i = 0; i < 9; i++) {
					if (firstDigit == i + 1) { // if first digit is 1 assign 1000, 2 assign 2000 etc
						text = listThousands[i];
						break;
					}				
				}
				
				if (thirdDigit == 1 && fourthDigit >= 1) {
					return text + "-" + transformTeenNumToText(number, listOneToNine, list11To19, listStringOneToNine, listString11To19, firstDigit, listStringTens);
				}
				return text + "-" + transformTensToText(number, listOneToNine, list11To19, listStringOneToNine, listString11To19, firstDigit, listStringTens);
			}
			
			for (int i = 0; i < 9; i++) {
				if (firstDigit == i + 1) {
					text = listThousands[i];
					num -= listThousandsInt[i]; //remove thousand from it to process
					break;
				}				
			}
			
			if (firstDigit == 0 && thirdDigit == 0 && fourthDigit == 0) { // if number is 1000, 2000, 3000, etc return the text
				return text;
			}
			
			return text + "-" + transformHundredsToText(num, secondDigit, listStringHundreds, listStringTens, listString11To19, listOneToNine, listStringOneToNine);
		} else if (number > 99 && number <= 999) {
			return transformHundredsToText(number, firstDigit, listStringHundreds, listStringTens, listString11To19, listOneToNine, listStringOneToNine);
		}
		return text;
	}
	
	//Transform numbers from 11 to 19 into text
	public static String transformTeenNumToText(int number, int[] listOneToNine, int[] list11To19, String[] listStringOneToNine, String[] listString11To19, int firstDigit, String[] listStringTens) {
		String text = "";
		firstDigit = Integer.parseInt(Integer.toString(number).split("")[2]);
		int secondDigit = Integer.parseInt(Integer.toString(number).split("")[3]);
		int firstAndSecondDigit = Integer.parseInt(firstDigit + "" + secondDigit);
		
		for (int i = 0; i < 9; i++) {
			if (firstAndSecondDigit >= 11 && firstAndSecondDigit <= 19) {
				if (firstAndSecondDigit == list11To19[i]) {
					text = listString11To19[i];
					return text;
				}
			} 
			
		}
		
		return text;
	}
	
	//Transform numbers from 1 to 99 into text
	public static String transformTensToText(int number, int[] listOneToNine, int[] list11To19, String[] listStringOneToNine, String[] listString11To19, int firstDigit, String[] listStringTens) {
		String text = "";
		
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
				int secondDigit = Integer.parseInt(Integer.toString(number).split("")[1]);
				
				if (number > 999) { // if number is greater than 999 then we need the third and fourth digits changed
					firstDigit = Integer.parseInt(Integer.toString(number).split("")[2]);
					secondDigit = Integer.parseInt(Integer.toString(number).split("")[3]);
				}
				
				if (firstDigit == i + 1 && secondDigit == 0) {
					text = listStringTens[i];
					return text;
				} else if (firstDigit == i + 1 && secondDigit != 0) {
					text = listStringTens[i] + "-"; 
					for (int x = 0; x < 9; x++) {
						if (listOneToNine[x] == secondDigit) {
							text += listStringOneToNine[x];
							break;
						}
					}
					
					if (firstDigit == 1 && secondDigit >= 1) {
						int firstAndSecondDigit = Integer.parseInt(firstDigit + "" + secondDigit);
						for (int x = 0; x < 9; x++) {
							if (list11To19[x] == firstAndSecondDigit) {
								text += listString11To19[x];
								break;
							}
						}
						text = listString11To19[i];
					}
					return text;
				}
			}
		}
		
		return text;
	}
	
	//Transform numbers from 100 to 999 into text
	public static String transformHundredsToText(int number, int firstDigit, String[] listStringHundreds, String[] listStringTens, String[] listString11To19, int[] listOneToNine, String[] listStringOneToNine) {
		String text = "";
		
		for (int i = 0; i < 9; i++) {
			
			if (i + 1 == firstDigit) {
				int secondDigit = Integer.parseInt(Integer.toString(number).split("")[1]);
				int thirdDigit = Integer.parseInt(Integer.toString(number).split("")[2]);
				
				text = listStringHundreds[i];
				
				if (thirdDigit == 0 && secondDigit == 0) {
					return text;
					
				} else {
					for (int z = 0; z < 9; z++) {
						
						if (secondDigit == z + 1 && thirdDigit == 0) {
							text += "-" + listStringTens[z];
							return text;
						} else if (secondDigit == 1) {
							for (int s = 0; s < 9; s++) {
								if (thirdDigit == s + 1) {
									text += "-" + listString11To19[s]; 
									break;
								}
								
							}
							return text;
						} else if (secondDigit == z + 1 && thirdDigit != 0) {
							text += "-" + listStringTens[z] + "-"; 
							for (int x = 0; x < 9; x++) {
								if (listOneToNine[x] == thirdDigit) {
									text += listStringOneToNine[x];
									break;
								}
							}
							return text;
						} else if (secondDigit == 0) {
							for (int x = 0; x < 9; x++) {
								if (listOneToNine[x] == thirdDigit) {
									text += "-and-" + listStringOneToNine[x];
									break;
								}
							}
							return text;
						}
					}						
				}
			}
		
		}
		return text;

	}
	
	

}

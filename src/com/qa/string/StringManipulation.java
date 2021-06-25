package com.qa.string;

public class StringManipulation {

	public static void main(String[] args) {
		String str1 = "yesterday it was raining";
		String str2 = "today it is sunny";
		
		System.out.println((str2 + ", ".concat(str1)).toUpperCase());
		System.out.println((str2.substring(0, 11).concat(str1.substring(16, 24))).toUpperCase());
		
		System.out.println(countWordsLength("this is a phrase"));
		printVerticalWords("print this in differents lines");
		System.out.println();
		printVerticalWordsReverse("Now it is time to play");
		System.out.println();
		System.out.println(isInTheText("today is an amazing day, we should go out!", "amazInG"));
		System.out.println(isInTheText("today is an amazing day, we should go out!", "beg"));

	}
	
	//Method 1 - When given a String, count and return how many words there are in that String.
	public static String countWordsLength(String phrase) {
		int wordsCount = phrase.split(" ").length;
		return "The phrase: \"" + phrase + "\" has " + wordsCount + " words";
	}
	
	//Method 2 - When given a String, print out this String in a vertical fashion, each word on a different line.
	public static void printVerticalWords(String phrase) {
		int lengthPhrase = phrase.split(" ").length;
		int indexToLen = 0;
		
		while (indexToLen < lengthPhrase) {
			System.out.println(phrase.split(" ")[indexToLen]);	
			indexToLen++;
		}
	}
	
	//Method 3 - When given a String, print out this String in a vertical fashion in reverse order, each word on a different line.
	public static void printVerticalWordsReverse(String phrase) {
		int lengthPhrase = phrase.split(" ").length;
		int endArray = 0;
		
		while (lengthPhrase > endArray) {
			System.out.println(phrase.split(" ")[lengthPhrase - 1]);	
			lengthPhrase--;
		}
	}
	
	//Method 4 - A find method, which takes 2 Strings; the first is message and the second is the String you want to find in the message. 
	//A boolean value should be returned to indicate whether or not the second String has been found in the message.
	public static boolean isInTheText(String message, String word) {
		if (message.toUpperCase().contains(word.toUpperCase())) {
			return true;
		} else {
			return false;
		}
	}

}

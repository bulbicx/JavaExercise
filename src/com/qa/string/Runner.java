package com.qa.string;

public class Runner {

	public static void main(String[] args) {
		System.out.println(StringManipulation.countWordsLength("this is a phrase"));
		
		StringManipulation.printVerticalWords("This is awesome");
		
		StringManipulation.printVerticalWordsReverse("This is awesome");
		
		System.out.println(StringManipulation.isInTheText("This is awesome", "is"));

	}

}

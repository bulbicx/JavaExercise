package com.qa.hashmap;

import java.util.HashMap;

public class MorseTranslator {

	HashMap<String, String> morseCode;
	
	public MorseTranslator() {
		morseCode = new HashMap<>(); 
		addCodeToMap();
	}
	
	public void addCodeToMap() {
		morseCode.put(".-","A");
		morseCode.put("-...", "B");
		morseCode.put("-.-.", "C");
		morseCode.put("-..", "D");
		morseCode.put(".", "E");
		morseCode.put("..-.", "F");
		morseCode.put("--.", "G");
		morseCode.put("....", "H");
		morseCode.put("..", "I");
		morseCode.put(".---", "J");
		morseCode.put("-.-", "K");
		morseCode.put(".-..", "L");
		morseCode.put("--", "M");
		morseCode.put("-.", "N");
		morseCode.put("---", "O");
		morseCode.put(".--.", "P");
		morseCode.put("--.-", "Q");
		morseCode.put(".-.", "R");
		morseCode.put("...", "S");
		morseCode.put("-", "T");
		morseCode.put("..-", "U");
		morseCode.put("...-", "V");
		morseCode.put(".--", "W");
		morseCode.put("-..-", "X");
		morseCode.put("-.--", "Y");
		morseCode.put("--..", "Z");
		morseCode.put(".-.-.-", ".");
		morseCode.put("--..--", ",");
		morseCode.put("-.-.--", "!");
		morseCode.put("/", " ");
		morseCode.put("..--..", "?");
	}
	
	public String translate(String phrase) {
		String[] splittedPhrase = phrase.split(" ");
		String phraseTranslated = "";
		
		for(String letter : splittedPhrase) {
			phraseTranslated += morseCode.get(letter);	
		}
		
		return phraseTranslated.substring(0, 1).toUpperCase() + phraseTranslated.substring(1).toLowerCase();
	}
}

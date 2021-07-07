package com.qa.hashmap;

import java.util.Map.Entry;

public class Runner {

	public static void main(String[] args) {
		MorseTranslator morse = new MorseTranslator();
		
//		//keys
//		for(String key : morse.morseCode.keySet()) {
//			System.out.println(key);
//		}
//		
//		//values
//		for(String value : morse.morseCode.values()) {
//			System.out.println(value);
//		}
//		
//		//sets
//		for(Entry<String, String> set : morse.morseCode.entrySet()) {
//			System.out.println(set);
//		}
		
		System.out.println(morse.translate(".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-"));
		System.out.println(morse.translate("- .... .. ... / .. ... / .- / - .-. .- -. ... .-.. .- - .. --- -. / ..-. .-. --- -- / . -. --. .-.. .. ... .... / - --- / -- --- .-. ... . / -.-. --- -.. . -.-.--"));
	}

}

package com.qa.enums;

public class Runner {

	public static void main(String[] args) {
		Directions[] array = Directions.values();
		
		for(Directions dir : array) {
			dir.getInfo();
		}
	}
}

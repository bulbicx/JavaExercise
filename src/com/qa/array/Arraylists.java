package com.qa.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylists {

	public static void main(String[] args) {
//		create a new ArrayList
		List<String> food = new ArrayList<>();
		
//		add() several elements
		food.add("banana");
		food.add("meat");
		food.add("strawberry");
		food.add("beans");
		food.add("broccoli");
		food.add("sour cream");
		
//		print out the entire ArrayList
		System.out.println(food);
		
//		iterate through the ArrayList and print out each element (with both normal and enhanced for-loops)
		for (String el : food) {
			System.out.println(el);
		}
		
//		get() specific elements
		food.get(2);
		
//		set() different elements
		food.set(3, "apple");
		System.out.println(food);
		
//		remove() elements
		food.remove(4);
		System.out.println(food);
		
//		sort() the ArrayList (try this with several object types)
		Collections.sort(food);
		System.out.println(food);
		
//		try using the reverse(), swap() and clone() methods from the Collections class
		Collections.reverse(food);
		System.out.println(food);
		
		Collections.swap(food, 1, 4);
		System.out.println(food);
		
		List <String> cloneList = new ArrayList<>(food);
		//cloneList = (ArrayList) food.clone();
		
		System.out.println();
		System.out.println(cloneList);
	}

}

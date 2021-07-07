package com.qa.generic;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		Cat cat = new Cat();
		
		Cage<Cat> catCage = new Cage<>(cat);
		Cage<Animal> cageEmpty = new Cage<>(); 
		
//		System.out.println(catCage.getEntity());
//		System.out.println(elephantCage.getEntity());
//		System.out.println(parrotCage.getEntity());
		
		List<Cage<Animal>> cages = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			cages.add(new Cage<>());
		}
		
		cages.get(2).setEntity(new Elephant("Charlie", false));
		cages.get(3).setEntity(cat);
		
		for (Cage<Animal> handle : cages) {
			handle.viewEntity();
		}
	}
}

package com.qa.abstraction;

public class Runner {

	public static void main(String[] args) {
		Animal a = new Dog("Bob", "brown", 3, "yorkshire");
		Deer b = new Deer("Daino", "brown", 5, "ggg");
		Dog dog = (Dog) a;
		System.out.println(dog.getBreed());
		
		WalkBehaviour wb = (WalkBehaviour) a;
		WalkBehaviour wb2 = (WalkBehaviour) b;
		TailBehaviour tb = new Dog("Bob", "brown", 3, "yorkshire");
		wb.walk();
		wb2.walk();
		tb.wag();
	}

}

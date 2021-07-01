package com.qa.inheritance;

public class Dog extends Animal {
	
	public Dog() {
		this("UNKNOWN", 7);
	}
	
	public Dog(String name, int age) { 
		super(name, "Dog", age);
	}

	public void bark() {
		System.out.println("Dog is barking");
	}

	@Override
	public void eat() {
		System.out.println("Dog is eating");
	}
	
	
}

package com.qa.abstraction;

public class Dog extends LandAnimal implements WalkBehaviour, TailBehaviour {

	private String breed;
	
	public Dog(String name, String hairColour, int age, String breed) {
		super(name, hairColour, age);
		this.breed = breed;
	}
	
	public void bark() {
		System.out.println("Im barking");
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public void wag() {
		System.out.println("Wagging the tail");
	}

	@Override
	public void walk() {
		System.out.println("Walking");
	}

	@Override
	public void eat() {
		System.out.println("Eating food");
	}

	@Override
	public void sleep() {
		System.out.println("Sleeping");
	}

}

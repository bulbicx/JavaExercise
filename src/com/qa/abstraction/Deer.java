package com.qa.abstraction;

public class Deer extends LandAnimal implements WalkBehaviour {

	private String typeHuntlers;

	public Deer(String name, String hairColour, int age, String typeHuntlers) {
		super(name, hairColour, age);
		this.typeHuntlers = typeHuntlers;
	}

	public String getTypeHuntlers() {
		return typeHuntlers;
	}

	public void setTypeHuntlers(String typeHuntlers) {
		this.typeHuntlers = typeHuntlers;
	}

	@Override
	public void walk() {
		System.out.println("Im walking as a deer");
	}

	@Override
	public void eat() {
		System.out.println("Im eating as a deer");
	}

	@Override
	public void sleep() {
		System.out.println("Im sleeping as a deer");
	}

}

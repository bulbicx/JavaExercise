package com.qa.abstraction;

public abstract class Animal {

	private String name;
	private String hairColour;
	private int age;
	
	public Animal(String name, String hairColour, int age) {
		this.name = name;
		this.hairColour = hairColour;
		this.age = age;
	}
	
	public abstract void eat();
	
	public abstract void sleep();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHairColour() {
		return hairColour;
	}

	public void setHairColour(String hairColour) {
		this.hairColour = hairColour;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

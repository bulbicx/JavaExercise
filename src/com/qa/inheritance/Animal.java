package com.qa.inheritance;

public class Animal {
	
	private String name;
	final private String species;
	private int age;
	
	public Animal() {
		this("UNKNOWN", "UNKNOWN", 0);
	}
	
	public Animal(String name, String species, int age) {
		this.name = name;
		this.species = species;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecies() {
		return species;
	}
//	public void setSpecies(String species) {
//		this.species = species;
//	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void eat() {
		System.out.println("Animal is eating");
	}
	
	

}

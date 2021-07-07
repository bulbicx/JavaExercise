package com.qa.generic;


/*
 * Create a Class called Cage, it should have a generic that it stores an instance of.
 * Create the abstract class "Animal"
 * 
 * 		Provide Animal with the interfaces `Attack` & `Speak` & `Sleep` 
 * 		(you could encapsulate these interfaces in a behaviour interface)
 * 
 * 		Create 3 child classes of Animal (perhaps: Cat, Parrot, Elephant)
 * 
 * Change Cage's Generic so that it extends Animal.
 * 
 * Create a Cage that can store each Animal.
 * 
 * Implement a method that lets Cage print out what animal it has stored.
 * 
 * In your Runner, create a List of Cages and use the previous method to print out all the Animals stored inside.
 * 
 * Add a Cage that doesn't have a Animal Inside it and print a message to the same effect.
*/
public class Cage<T extends Animal> {
	
//	private List<T> list;
	private T entity;
	
	public Cage() {
		
	}
	
	public Cage(T entity) {
		this.entity = entity;
	}
	
	public T getEntity() {
		return this.entity;
	}
	
	public void setEntity(T entity) {
		this.entity = entity;
	}
	
	public void viewEntity() {
		if (entity != null ) {
			System.out.println("The animal inside is: " + this.entity.getName());
		} else {
			System.out.println("There is no animal inside this cage");
		}
	}
}

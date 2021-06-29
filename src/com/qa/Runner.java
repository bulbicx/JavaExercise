package com.qa;

import com.qa.inheritance.Animal;
import com.qa.inheritance.Bird;
import com.qa.inheritance.Dog;
import com.qa.inheritance.Duck;

public class Runner {

	public static void main(String[] args) {
		
		Dog myDog = new Dog();
		myDog.eat();
		myDog.bark();
		
		Bird myBird = new Bird();
		myBird.eat();
		myBird.chipping();
		myBird.setName("Nice birdy");
		System.out.println(myBird.getName());
		
		Animal anotherBird = new Bird();
		anotherBird.eat();
		anotherBird.setAge(23);
		System.out.println(anotherBird.getAge());
		
		Duck myDuck = new Duck();
		myDuck.chipping();
		myDuck.eat();
		myDuck.ducking();
		
	}

}

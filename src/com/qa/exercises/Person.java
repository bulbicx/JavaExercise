package com.qa.exercises;


/** 
 * 1. Create a Person class modelling name, age and job title variables.
 * 2. Create a empty constructor, and a constructor which takes name, age, and job title as input parameters
 * 3. Create a method which prints out the details of a Person instance when called
 * 4. Create multiple instances of the Person class and store these in a List<Person>
 * 5. Iterate through the list of Person, calling the method from step 3
 * */

public class Person {
	public String name;
	public int age;
	public String job;
	
	public Person() { }
	
	public Person(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getJob() {
		return this.job;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	public void printPersonDetails() {
		System.out.println("Hi, I'm " + name + ", I am " + age + " years old and I am a " + job);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", job=" + job + "]";
	}
}

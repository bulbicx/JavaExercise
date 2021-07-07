package com.qa.generic;

public abstract class Animal implements Behaviour {
	private String name;
	private boolean isSleeping;

	public Animal() {
		
	}
	
	public Animal(String name, boolean isSleeping) {
		this.name = name;
		this.isSleeping = isSleeping;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isSleeping() {
		return isSleeping;
	}

	public void setSleeping(boolean isSleeping) {
		this.isSleeping = isSleeping;
	}

}

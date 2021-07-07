package com.qa.generic;

public class Cat extends Animal {


	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, boolean isSleeping) {
		super(name, isSleeping);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sleep() {
		super.setSleeping(true);		
	}

	@Override
	public void wakeUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dream() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void speak(String msg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void shout(String msg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(Object target) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defend() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dodge() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void parry() {
		// TODO Auto-generated method stub
		
	}

}

package com.qa.abstraction;

public class Lion extends LandAnimal implements WalkBehaviour {

	private boolean isTheKing;
	private boolean hasChildren;
	
	public Lion(String name, String hairColour, int age, boolean isTheKing, boolean hasChildren) {
		super(name, hairColour, age);
		this.isTheKing = isTheKing;
		this.hasChildren = hasChildren;
	}
	
	public void roar() {
		System.out.println("Im roaring");
	}
	
	public boolean isTheKing() {
		return isTheKing;
	}

	public void setTheKing(boolean isTheKing) {
		this.isTheKing = isTheKing;
	}

	public boolean isHasChildren() {
		return hasChildren;
	}

	public void setHasChildren(boolean hasChildren) {
		this.hasChildren = hasChildren;
	}

	@Override
	public void walk() {
		System.out.println("Im walking as a lion");
	}

	@Override
	public void eat() {
		System.out.println("Im eating as a lion");
	}

	@Override
	public void sleep() {
		System.out.println("Im sleeping as a lion");
	}

}

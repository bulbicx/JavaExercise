package com.qa.enums;

public enum Directions {
	NORTH("Forward"),
	EAST("Right"),
	SOUTH("Backward"),
	WEST("Left");
	
	private String motion;

	Directions(String motion) {
		this.motion = motion;
	}
	
	public String getMotion() {
		return this.motion;
	}
	
	public void getInfo() {
		System.out.println(this + " is the same as moving " + this.motion);
	}
	
	
}

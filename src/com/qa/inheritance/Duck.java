package com.qa.inheritance;

public class Duck extends Bird {

	public void ducking() {
		System.out.println("Im ducking");
	}
	
	@Override
	public void chipping() {
		System.out.println("chip ducki chip ducky");
	}
}

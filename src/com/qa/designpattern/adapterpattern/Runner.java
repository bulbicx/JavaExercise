package com.qa.designpattern.adapterpattern;

public class Runner {

	public static void main(String[] args) {
		
		Mallard mallard = new Mallard();
		WildTurkey wildTurkey = new WildTurkey();
		System.out.println("wildTurkey:");
		wildTurkey.gobble();
		wildTurkey.fly();
		System.out.println();
		
		System.out.println("mallard");
		mallard.fly();
		mallard.quack();
		System.out.println();
		
		Turkey duckAdapter = new DuckAdapter(mallard);
		duckAdapter.fly();
		duckAdapter.gobble();
		
		System.out.println();
		
		Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
		turkeyAdapter.fly();
		turkeyAdapter.quack();
	}
}

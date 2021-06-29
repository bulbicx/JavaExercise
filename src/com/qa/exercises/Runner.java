package com.qa.exercises;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		
		List<User> people = new ArrayList<User>();
		
		User u1 = new User();
		User u2 = new User();
		User u3 = new User();
		
		u1.setForename("Lucas");
		u1.setSurname("Lavar");
		u1.setAge(29);
		u1.setEmail("Lucas@gmail.com");
		u1.setTelephoneNo("07123123123");
		u1.setMiddleNames("Kabr Parol");
		
		u2.setForename("Maria");
		u2.setSurname("Kabeza");
		u2.setAge(32);
		u2.setEmail("Maria@gmail.com");
		u2.setTelephoneNo("07333123123");
		u2.setMiddleNames("Lorel Val");
		
		u3.setForename("Matteush");
		u3.setSurname("Polinski");
		u3.setAge(34);
		u3.setEmail("Matteush@gmail.com");
		u3.setTelephoneNo("07444423123");
		u3.setMiddleNames("Ler Pasolina");
		
		people.add(u1);
		people.add(u2);
		people.add(u3);
		
		for (User person : people) {
			System.out.println(person);
		}
		

	}

}

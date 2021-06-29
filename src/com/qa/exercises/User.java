package com.qa.exercises;

import java.util.ArrayList;
import java.util.List;

public class User {

	private String forename;
	private String surname;
	private int age;
	private String email;
	private String telephoneNo;
	private List<String> middleNames;

	public String getForename() {
		return this.forename;
	}

	public String getSurname() {
		return this.surname;
	}

	public int getAge() {
		return this.age;
	}

	public String getEmail() {
		return this.email;
	}

	public String getTelephoneNo() {
		return this.telephoneNo;
	}

	public List<String> getMiddleNames() {
		if (middleNames == null) {
			return middleNames = new ArrayList<>();
		}
		return this.middleNames;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setEmail(String email) {
		if (email.contains("@")) {
			this.email = email;
		} else {
			System.out.println("You need to insert a valid email");
		}
	}

	public void setTelephoneNo(String telephoneNo) {
		this.telephoneNo = telephoneNo;
	}

	public void setMiddleNames(List<String> middleNames) {
		if (middleNames == null) {
			this.middleNames = new ArrayList<>();
		} else {
			this.middleNames = middleNames;			
		}
	}

	@Override
	public String toString() {
		return "User [forename=" + forename + ", surname=" + surname + ", age=" + age + ", email=" + email
				+ ", telephoneNo=" + telephoneNo + ", middleNames=" + middleNames + "]";
	}

}

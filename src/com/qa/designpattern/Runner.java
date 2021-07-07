package com.qa.designpattern;

import com.qa.designpattern.builder.BankAccount;
import com.qa.designpattern.builder.BankAccountBuilder;

public class Runner {

	public static void main(String[] args) {
		BankAccount myAccount = new BankAccountBuilder()
				.accountNumber(24567)
				.branch("Foster")
				.build();
		
		System.out.println(myAccount);
	}

}

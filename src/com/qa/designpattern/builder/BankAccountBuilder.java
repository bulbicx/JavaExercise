package com.qa.designpattern.builder;

public class BankAccountBuilder {
	
	private BankAccount bankAccountBuild;
	
	public BankAccountBuilder() {
		this.bankAccountBuild = new BankAccount();
	}
	
	public BankAccount build() {
		return this.bankAccountBuild;
	}
	
	public BankAccountBuilder accountNumber(long accountNumber) {
		bankAccountBuild.setAccountNumber(accountNumber);
		return this;
	}
	
	public BankAccountBuilder owner(String owner) {
		bankAccountBuild.setOwner(owner);
		return this;
	}
	
	public BankAccountBuilder branch(String branch) {
		bankAccountBuild.setBranch(branch);
		return this;
	}
	
	public BankAccountBuilder balance(double balance) {
		bankAccountBuild.setBalance(balance);
		return this;
	}
	
	public BankAccountBuilder interestRate(double interestRate) {
		bankAccountBuild.setInterestRate(interestRate);
		return this;
	}
}

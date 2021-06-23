package com.qa.apackage;


/**
 * @author arkan
 * 
 * 0 - 14,999 : 0% tax
 * 15,000 - 19,999 : 10% tax
 * 20,000 - 29,999 : 15% tax
 * 30,000 - 44,999 : 20% tax
 * 45,000+ : 25% tax
 */
public class Tax {

	public static void main(String[] args) {
		System.out.println(calculatePercentageToPay(14999));
		System.out.println(calculatePercentageToPay(15000));
		System.out.println(calculatePercentageToPay(19999));
		System.out.println(calculatePercentageToPay(20000));
		System.out.println(calculatePercentageToPay(29999));
		System.out.println(calculatePercentageToPay(30000));
		System.out.println(calculatePercentageToPay(44999));
		System.out.println(calculatePercentageToPay(45000));
		
		System.out.println(calculateTaxToPay(14999));
		System.out.println(calculateTaxToPay(15000));
		System.out.println(calculateTaxToPay(19999));
		System.out.println(calculateTaxToPay(20000));
		System.out.println(calculateTaxToPay(29999));
		System.out.println(calculateTaxToPay(30000));
		System.out.println(calculateTaxToPay(44999));
		System.out.println(calculateTaxToPay(45000));
	}
	
	//This method takes a salary and works out the percentage by which the salary will be taxed.
	public static int calculatePercentageToPay (int salary) {
		if (salary <= 14999) {
			return 0;
		} else if (salary >= 15000 && salary <= 19999) {
			return 10;
		} else if (salary >= 20000 && salary <= 29999) {
			return 15;
		} else if (salary >= 30000 && salary <= 44999) {
			return 20;
		} else { // salary above or equal to 45000
			return 25;
		}
	}
	
	//This method works out the exact amount that the user will be taxed using a similar process to that in the first method. 
	//That amount should be returned and output to the console.
	public static double calculateTaxToPay (int salary) {
		double totTaxes = 0;
		int taxPercentage = calculatePercentageToPay(salary);
		
		totTaxes = salary / 100 * taxPercentage;
		
		return totTaxes;
	}

}

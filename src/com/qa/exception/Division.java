package com.qa.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {

	Scanner scanner = new Scanner(System.in);
	
	public void operation() {
			try {
				System.out.println("Please enter the first number for the division");
				int firstInput = scanner.nextInt();
				System.out.println("Please enter the second number for the division");
				int secondInput = scanner.nextInt();
				if (firstInput < secondInput) throw new LargeNumberException("");
				System.out.println(divide(firstInput, secondInput));
			} catch (InputMismatchException e) {
				System.out.println("Error. The input must be an integer");
			} catch (ArithmeticException e) {
				System.out.println("You cannot divide by zero");
			} catch(Exception e) {
				System.out.println(e);
			} finally {
				scanner.close();				
			}
	}
	
	public int divide(int a, int b) throws ArithmeticException, LargeNumberException {
		if (a == 0 || b == 0) throw new ArithmeticException("cannot div by 0");
		else if (a < b) throw new LargeNumberException("Second number is bigger!");
		return a / b;
	}
}

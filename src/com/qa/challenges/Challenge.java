package com.qa.challenges;

public class Challenge {

	public static void main(String[] args) {
		
		challenge3000(3000, "Team 3");
	}

	public static void challenge3000(int numTimes, String teamName) {
		if (numTimes > 0) {
			System.out.println(teamName);
			challenge3000(numTimes - 1, teamName);
		}
	}
	
}

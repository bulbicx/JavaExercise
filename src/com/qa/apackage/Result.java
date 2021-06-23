package com.qa.apackage;


public class Result {
	
	private static int physics = 0;
	private static double physicsPercentage = 0;
	private static int chemistry = 0;
	private static double chemistryPercentage = 0;
	private static int biology = 0;
	private static double biologyPercentage = 0;
	private static double total = 0;
	private static double percentage = 0;
	
	public static void main(String[] args) {
		resultExams(150, 150, 150); // all passed
		resultExams(150, 150, 84); // physics and chemistry passed
		resultExams(150, 84, 150); // physics and biology passed
		resultExams(84, 150, 150); // chemistry and biology passed
		resultExams(150, 84, 84); // physics passed
		resultExams(84, 150, 84); // chemistry passed
		resultExams(84, 84, 150); // biology passed
		resultExams(84, 84, 84); // all failed
	}
	 
	private static void resultExams (int physicsRes, int chemistryRes, int biologyRes) {
		physics = physicsRes;
		chemistry = chemistryRes;
		biology = biologyRes;
		total = (physics + chemistry + biology) / 3;
		physicsPercentage = physics * 100 / 150;
		biologyPercentage = biology * 100 / 150;
		chemistryPercentage = chemistry * 100 / 150;
		percentageResult();
		
		if (percentage >= 60.0) {
			if (physicsPercentage >= 60.0 && chemistryPercentage >= 60.0 && biologyPercentage >= 60.0) {
				System.out.println("You have passed!");
				System.out.println("Physics Exam result: " + physics);
				System.out.println("Chemistry Exam result: " + chemistry);
				System.out.println("Biology Exam result: " + biology);
				System.out.println("Total mark: " + total);	
				System.out.println("###############################");	
			} else if (physicsPercentage >= 60.0 && chemistryPercentage >= 60.0 && biologyPercentage < 60.0) {
				System.out.println("You have passed Physics and Chemistry modules with a respective of " + physicsPercentage + "% and " + chemistryPercentage + "%, but unfortunately you have not passed Biology module with a result of " + biologyPercentage + "% score");
				System.out.println("###############################");
			} else if (physicsPercentage >= 60.0 && chemistryPercentage < 60.0 && biologyPercentage >= 60.0) {
				System.out.println("You have passed Physics and Biology modules with a respective of " + physicsPercentage + "% and " + biologyPercentage + "%, but unfortunately you have not passed Chemistry module with a result of " + chemistryPercentage + "% score");
				System.out.println("###############################");
			} else if (physicsPercentage < 60.0 && chemistryPercentage >= 60.0 && biologyPercentage >= 60.0) {
				System.out.println("You have passed Chemistry and Biology modules with a respective of " + chemistryPercentage + "% and " + biologyPercentage + "%, but unfortunately you have not passed Physics module with a result of " + physicsPercentage + "% score");
				System.out.println("###############################");
			} else if (physicsPercentage >= 60.0 && chemistryPercentage < 60.0 && biologyPercentage < 60.0) {
				System.out.println("You have passed Physics module with a: " + physicsPercentage + "%, but unfortunately you have not passed Chemistry and Biology modules, with a respective " + chemistryPercentage + "% and " + biologyPercentage + "% score");
				System.out.println("###############################");
			} else if (physicsPercentage < 60.0 && chemistryPercentage >= 60.0 && biologyPercentage < 60.0) {
				System.out.println("You have passed Chemistry module with a result of " + chemistryPercentage + "%, but unfortunately you have not passed Biology and Physics modules with a result of " + biologyPercentage + "% and " +  physicsPercentage + "% respectively");
				System.out.println("###############################");
			} else if (physicsPercentage < 60.0 && chemistryPercentage < 60.0 && biologyPercentage >= 60.0) {
				System.out.println("You have passed Biology module with a result of " + biologyPercentage + "%, but unfortunately you have not passed Chemistry and Physics modules with a result of " + chemistryPercentage + "% and " +  physicsPercentage + "% respectively");
				System.out.println("###############################");
			} else {
				System.out.println("Physics results: " + physicsPercentage + "%");
				System.out.println("Chemistry results: " + chemistryPercentage + "%");
				System.out.println("Biology results: " + biologyPercentage + "%");
				System.out.println("You have failed the year because you must have at least 60% on all subjects");
				System.out.println("###############################");
			}
		} else {
			System.out.println("You have failed the year!");
		}

	}
	
	//Method to calculate overall exam result in percentage
	private static void percentageResult () {
		percentage = ( physics + chemistry + biology ) * 100 / 450;
		System.out.println("The percentage overall is: " + percentage + "%");
	}
	
}

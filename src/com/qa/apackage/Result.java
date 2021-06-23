package com.qa.apackage;


public class Result {
	
	private static int physics = 0;
	private static int chemistry = 0;
	private static int biology = 0;
	private static double total = 0;
	private static double percentage = 0;
	
	public static void main(String[] args) {
		resultExams(100, 135, 146);
		percentageResult();
	}
	
	private static void resultExams (int physicsRes, int chemistryRes, int biologyRes) {
		physics = physicsRes;
		chemistry = chemistryRes;
		biology = biologyRes;
		total = (physics + chemistry + biology) / 3;
		System.out.println("Physics Exam result: " + physics);
		System.out.println("Chemistry Exam result: " + chemistry);
		System.out.println("Biology Exam result: " + biology);
		System.out.println("Total mark: " + total);
	}
	
	private static void percentageResult () {
		percentage = ( physics + chemistry + biology ) * 100 / 450;
		System.out.println("The percentage overall is: " + percentage + "%");
	}
	
	

}

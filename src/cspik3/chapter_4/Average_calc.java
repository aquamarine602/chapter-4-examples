package cspik3.chapter_4;

import java.util.Scanner;
import static java.lang.System.out;

public class Average_calc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// user enters grades and assigns values
		out.println("Enter your grade percentages:");
		double grade_1 = input.nextDouble();
		double grade_2 = input.nextDouble();
		double grade_3 = input.nextDouble();
		double grade_4 = input.nextDouble();
		double grade_5 = input.nextDouble();
		double grade_6 = input.nextDouble();
		double grade_7 = input.nextDouble();
		double grade_8 = input.nextDouble();
		double grade_9 = input.nextDouble();
		double grade_10 = input.nextDouble();
		
		// calculates sum and average
		double sum = grade_1 + grade_2 + grade_3 + grade_4 + grade_5+ grade_6 + grade_7 + grade_8 + grade_9 + grade_10;
		double average = sum/10;
		
		// initialize grade variable
		String grade;
		
		// assigns number grade to letter grade
		if (average >= 90) {
			grade = "A";
		} else if (average >= 80) {
			grade = "B";
		} else if (average >= 70) {
			grade = "C";
		} else if (average >= 60) {
			grade = "D";
		} else if (average >= 50) {
			grade = "F";
		} else {
			grade = "F-----";
		}
		
		// displays user's average and letter grade
		out.println();
		out.println("Your average is " + average + "% and your overall grade is a "+ grade + ".");
		

	}

}

package cspik3.chapter_4;

import static java.lang.System.out;
import java.util.Scanner;

public class If_calculator {

	public static void main(String[] args) {
		//  get 2 numbers from user
		// get the operator
		// test input
		// do calculations
		// print output
		
		// import scanner
		Scanner input = new Scanner(System.in);
		
		// gives all variables values
		out.println("Enter the first value you wish to calculate:");
		double value_1 = input.nextDouble();
		out.println();
		
		out.println("Enter the second value:");
		double value_2 = input.nextDouble();
		out.println();
		
		out.println("Enter +, -, /, * or %:");
		String operator = input.next();
		out.println();
		
		double answer = 0;
		int boi = 0;
		
		while (boi == 0) {
			// determines operator
			if (operator.equals("+")) {
				answer = value_1 + value_2;
				boi ++;
			} else if (operator.equals("-")) {
				answer = value_1 - value_2;
				boi ++;
			} else if (operator.equals("/")) {
				answer = value_1 / value_2;
				boi ++;
			} else if (operator.equals("*")) {
				answer = value_1 * value_2;
				boi ++;
			} else if (operator.equals("%")) {
				answer = value_1 % value_2;
				boi ++;
			} else {	// else the input is invalid
				out.println("That's not an operator!");
				out.println("Enter +, -, /, * or %:");
				operator = input.next();
				out.println();
			}
		}
		
		// prints output
		out.println("The answer is: " + answer + ".");

	}

}

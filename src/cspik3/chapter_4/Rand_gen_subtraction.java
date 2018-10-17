package cspik3.chapter_4;

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.out;

public class Rand_gen_subtraction {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // import scanner
		Random rand = new Random();	// import random
		
		// gives random value, initializes variables
		int num1 = rand.nextInt(10);
		int num2 = rand.nextInt(10);
		String calc_str = null;
		int answer = 0;
		
		// assigns positions, calc and answer -- larger number comes first
		if (num1 > num2) {
			calc_str = "What is: " + num1 + " - " + num2 + " ?";
			answer = num1 - num2;
			
		} else if (num1 < num2) {
			calc_str = "What is: " + num2 + " - " + num1 + " ?";
			answer = num2 - num1;
			
		} else if (num1 == num2) {
			calc_str = "What is: " + num1 + " - " + num2 + " ?";
			answer = num1 - num2;
			
		} else {	// just in case something goes wrong
			out.println("Something went wrong!");
		}
		
		// asks question & gets user's answer
		out.println(calc_str);
		int answer_in = input.nextInt();
		out.println();
		
		// checks user's answer
		if (answer == answer_in) {
			out.println("Correct!");
		} else {
			out.println("Incorrect!");
			out.println("The answer was " + answer + ".");
		}
		
		

	}

}

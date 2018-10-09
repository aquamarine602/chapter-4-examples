package cspik3.chapter_4;

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.out;

/**
 * @author chloe.spilker
 * 10/9/18
 * first grade addition program
 */

public class Random_generation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();	// imports random from the system
		
		int x = 1;
		while (x == 1) {
		
		// gets two random numbers
		int num1 = rand.nextInt(10);
		int num2 = rand.nextInt(10);
		
		// another way to get random numbers
		int num3 = (int)(System.currentTimeMillis() % 10);
		int num4 = (int)(System.currentTimeMillis() / 7 % 10);
		
		// displays question
		out.println("What is: " + num1 + " + " + num2 + " ?");
		
		// gets user input and calculates the answer
		int answer_in = input.nextInt();
		int answer_calc = num1 + num2;
		
		out.println();
		
		// informs user if their answer was correct or incorrect
		if (answer_in == answer_calc) {
			out.println("Correct!");
		} else {
			out.println("Incorrect!");
			x = 0;
		}
		
		// displays correct answer
		out.println("The answer was " + answer_calc + ".");
		
		out.println();
		
		}

	}

}

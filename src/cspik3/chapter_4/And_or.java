package cspik3.chapter_4;

import java.util.Scanner;
import static java.lang.System.out;

public class And_or {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		out.println("Enter an integer:");
		int number = input.nextInt();
		
		// and
		if (number % 2 == 0 && number % 3 == 0) {
			out.println("The number is divisible by 2 and 3.");
		}
		// or
		if (number % 2 == 0 || number % 3 == 0) {
			out.println("The number is divisible by 2 and/or 3.");
		}
		// exclusive or
		if (number % 2 == 0 ^ number % 3 == 0) {
			out.println("The number is divisible by either 2 or 3.");
		}
	}

}

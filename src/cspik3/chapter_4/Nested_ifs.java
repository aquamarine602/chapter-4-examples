package cspik3.chapter_4;

import static java.lang.System.out;
import java.util.Scanner;

/**
 * @author chloe.spilker
 * 10/4/18
 */

public class Nested_ifs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		out.println("x value:");
		int x = input.nextInt();
		out.println("");
		
		out.println("y value:");
		int y = input.nextInt();
		out.println("");
		
		out.println("z value:");
		int z = input.nextInt();
		out.println("");
		
		if (x < y) {
			out.println("x is less than y");
			
			if (z > y) {
				out.println("z is greater than y");
				
				if (x > z) {
					out.println("x is greater than z");
					
				} else {
					out.print("x is less than z");
				}
				
			} else {
				out.println("second condition not true");
			}
			
		} else {
			out.println("first condition not true");
		}

	}

}

package cspik3.chapter_4;

import java.util.Scanner;
import static java.lang.System.out;
import java.util.Random;

public class Switch_example {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		int keep_going = 1;
				
		while (keep_going == 1) {
			
			out.println("Enter the year you were born: ");
			int year = input.nextInt();
			
			out.println();
		
		switch (year % 12) {
		case 0:
			out.println("Monkey");
			out.println("------");
			out.println("Monkies are smart, clever and intelligent, especially\n"
					+ "in their career and wealth. They are lively, flexible, quick-witted and\n"
					+ "versatile. In addition, their gentleness and honesty bring them an everlasting\n"
					+ "love life. Although they were born with enviable skills, they still have several\n"
					+ "shortcomings, such as an impetuous temper and a tendency to look down\n"
					+ "upon others.");
			break;
		
		case 1:
			out.println("Rooster");
			out.println("-------");
			out.println("Roosters are the representative of confidence and intelligence.\n"
					+ "People who born in the Years of the Rooster usually share lots of\n"
					+ "common personality traits such as being responsive, distinctive,\n"
					+ "smart and earnest. Being strict with themselves is their strongest\n"
					+ "characteristic.");
			break;
		
		case 2:
			out.println("Dog");
			out.println("---");
			out.println("Dogs are usually independent, sincere, loyal and decisive according\n"
					+ "to Chinese zodiac analysis. They are not afraid of difficulties in\n"
					+ "daily life. These shining characteristics make them have harmonious\n"
					+ "relationship with people around.");
			break;
		
		case 3:
			out.println("Boar");
			out.println("----");
			out.println("Boars are considerate, responsible, independent and optimistic.\n"
					+ "They always show generousness and mercy to endure other people's mistakes,\n"
					+ "which help them gain harmonious interpersonal relationships. However, sometimes\n"
					+ "they will behave lazy and lack actions. In addition, pure hearts would let\n"
					+ "them be cheated easily in daily life.");
			break;
			
		case 4:
			out.println("Rat");
			out.println("---");
			out.println("Rats are instinctive, acute and alert in nature which makes them to be\n"
					+ "brilliant businessmen. They can always react properly before the worst\n"
					+ "circumstances take place. They are also sophisticated and popular in\n"
					+ "social interaction. They are sanguine and very adaptable, being popular\n"
					+ "with others.");
			break;
			
		case 5:
			out.println("Ox");
			out.println("--");
			out.println("Oxen bear persistent, simple, honest, and straightforward characteristics.\n"
					+ "They are talent leaders with strong faith, and strong devotion to work.\n"
					+ "They are contemplative before taking actions, not easily affected by the\n"
					+ "surroundings but just follow their concept and ability. Being conservative\n"
					+ "with a lack of wit in speaking, they usually look silent and sometimes\n"
					+ "stubborn in their old ways.");
			break;
			
		case 6:
			out.println("Tiger");
			out.println("-----");
			out.println("Tigers are powerful, independent, confident and brave. They have strong\n"
					+ "sense of errantry, being frank and easy to win others' trust. In their\n "
					+ "middle age, their fate may be uneven, but after hardships, they will enjoy\n"
					+ "a bright prospect. While they are also likely to be dogmatic, and like\n"
					+ "showing off when accomplishing something.");
			break;
			
		case 7:
			out.println("Rabbit");
			out.println("------");
			out.println("Rabbits usually impress others with an image of tenderness, grace\n"
					+ "and sensitive. They are romantic in relationship, having a high demand\n"
					+ "in life quality. They avoid arguing with others, and have a capability\n"
					+ "of converting an enemy into a friend. They are homebody and hospitable,\n"
					+ "and like house fitting-up. They can work with speed and efficiency, do not\n"
					+ "insist and get angry easily. But they also like hesitating, which makes\n"
					+ "them lose many chances.");
			break;
			
		case 8:
			out.println("Dragon");
			out.println("------");
			out.println("Dragons are usually a group of people who are lively, intellectual and\n"
					+ "excitable. They can clearly tell right from wrong. They are upright and frank.\n"
					+ "However, they are also a bit arrogant and impatient. Female Dragons tend to\n"
					+ "be overly confident. They hate hypocrisy, gossip and slander. They are not\n"
					+ "afraid of difficulties but hate to be used or controlled by others.");
			break;
			
		case 9:
			out.println("Snake");
			out.println("-----");
			out.println("Snakes are a symbol of wisdom and wit. Therefore, Snakes are sensitive and\n"
					+ "humorous, and most of them are gifted in literature and art, such as Goethe and\n"
					+ "Picasso. Suspicion is their weakness, which makes them hesitant and a bit paranoid.");
			break;
			
		case 10:
			out.println("Horse");
			out.println("-----");
			out.println("Horses have nice personalities, warm-hearted, upright and easygoing. Hence,\n"
					+ "they usually have a lot of friends flocking around them. Independence and endurance\n"
					+ "makes them more powerful, and they do not easily give up when in difficulties.\n"
					+ "Positive attitude leads to a brighter direction.");
			break;
			
		case 11:
			out.println("Sheep");
			out.println("-----");
			out.println("Sheep are tender, polite, filial, clever, and kind-hearted. They have special sensitivity\n"
					+ "to art and beauty and a special fondness for quiet living. They are wise, gentle and\n"
					+ "compassionate and can cope with business cautiously and circumspectly. In their daily\n"
					+ "life, they try to be economical. They are willing to take good care of others, but\n"
					+ "they should avoid pessimism and hesitation.");
			break;
		
		}
		
		out.println();
		out.println("Did you want to enter a new year? (1 for yes, 2 for no)");
		keep_going = input.nextInt();
		out.println();
		
		while (keep_going != 1 && keep_going != 2) {
			out.println("Invalid answer! Choose a new one.");
			out.println();
			out.println("Did you want to enter a new year? (1 for yes, 2 for no)");
			keep_going = input.nextInt();
			out.println();
		}		
	}
		
		out.println();
		out.println("Goodbye!");
	
		// example switch statement
		/**
		 * switch (switch-expression) {
		 * case value1:
		 * 	Statements;
		 * 	break;
		 * case value2:
		 *  Statements;
		 *  break;
		 * default:
		 * 	Statements;
		 * break;
		 * }
		 */

	}

}

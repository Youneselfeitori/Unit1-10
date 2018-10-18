/****************************************************************************
 * Created by: Younes Elfeitori
 * Created on: october 2018
 * This is a program about list the info of planets
 ****************************************************************************/

import java.util.Scanner;

public class planets {
	
	public static void main(String[] args) {
		Planets userChoice;
		
		for(Planets planetName : Planets.values()) {
			System.out.println(planetName);
		}
		
		System.out.println("\nEnter a planet in our solar system ");
		
		Scanner scanner = new Scanner(System.in);
		String user = scanner.nextLine();
		
		userChoice = Planets.valueOf(user.toUpperCase());
		
		switch(userChoice) {
		
		case MERCURY :
			System.out.println("You choosed " + Planets.MERCURY + " and the position is " + Planets.MERCURY.position + "st");
			break;
			
		case VENUS :
			System.out.println("You choosed " + Planets.VENUS + " and the position is " + Planets.VENUS.position + "nd");
			break;
		
		case EARTH :
			System.out.println("You choosed " + Planets.EARTH + " and the position is " + Planets.EARTH.position + "rd");
			break;
			
		case MARS :
			System.out.println("You choosed " + Planets.MARS + " and the position is " + Planets.MARS.position + "th");
			break;
		
		case JUPITER :
			System.out.println("You choosed " + Planets.JUPITER + " and the position is " + Planets.JUPITER.position + "th");
			break;	
		
		case SATURN :
			System.out.println("You choosed " + Planets.SATURN + " and the position is " + Planets.SATURN.position + "th");
			break; 
			
		case URANUS :
			System.out.println("You choosed " + Planets.URANUS + " and the position is " + Planets.URANUS.position + "th");
			break;
			
		case NEPTUNE :
			System.out.println("You choosed " + Planets.NEPTUNE + " and the position is " + Planets.NEPTUNE.position + "th");
			break;
			
		}
		
	}
	
	public enum Planets{
		MERCURY(1),
		VENUS(2),
		EARTH(3),
		MARS(4),
		JUPITER(5),
		SATURN(6),
		URANUS(7),
		NEPTUNE(8);
		
		private final int position;
		
		private Planets(int position) {
			this.position = position;
		}
		
	}

}

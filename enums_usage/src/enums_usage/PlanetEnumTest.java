package enums_usage;

import java.util.Scanner;

public class PlanetEnumTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enums test class");
		System.out.println(" ------------------------------------------------- ");
		for(Planet p: Planet.values()) {
			System.out.println(p.toString().toLowerCase() + " is a planet");
		}
	
		System.out.println("Enter your weight on Earth");
		double weight = sc.nextDouble();
		
		double mass = weight/Planet.EARTH.surfaceGravity();
		System.out.println("mass: " + mass);
		
		for (Planet planet : Planet.values()) {
			System.out.printf("Your weight on %s is %.2f\n", planet, planet.surfaceWeight(mass) );
		}
	}
	

	
}

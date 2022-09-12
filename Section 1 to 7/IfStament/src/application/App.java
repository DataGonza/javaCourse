package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter room temperature (F) > ");
		
		double temperatureFahrenheit = scanner.nextFloat();
		
		double temperatureCelsius = (temperatureFahrenheit - 32) * (5.0/9.0);
		
		System.out.printf("Temperature in Celsius: %.2f\n", temperatureCelsius);
		
		// If temperature less than 21, print "Too cold!"
		// If temperature in celsius greater than 21, print "Warm enough"
		
		if (temperatureCelsius < 21) {
			System.out.println("Too cold");
		}
		else {
			System.out.println("Warm enough");
		}
		
	}

}

package hello;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter value in fahrenheit to convert > ");
		
		double fahrenheit = scanner.nextFloat();
		scanner.close();
		
		double celsius = (fahrenheit - 32) * 5.0/9;
		
		System.out.printf("%.2f degrees Fahrenheit is %.2f degress celcius.\n", fahrenheit, celsius);

	}

}

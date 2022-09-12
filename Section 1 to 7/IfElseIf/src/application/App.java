package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		System.out.println("Menu");
		System.out.println("-----------------------");
		System.out.println("\t1. Hello > ");
		System.out.println("\t2. How are you? > ");
		System.out.println("\t3. Exit program > ");
		System.out.print("Enter an option > ");
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		scanner.close();
		
		if(input == 1) {
			System.out.println("Hello");
		}
		else if(input == 2) {
			System.out.println("How are you?");
		}
		else if(input == 3) {
			System.out.println("Exting ...");
			System.exit(0);
		}
		else if(input > 100) {
			System.out.println("Yo've found the hidden Easter egg");
			System.exit(0);
		} else {
			System.out.println("Invalid option.");
		}
	}

}

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
		
		if(input > 100) input = 100;
		
		switch(input) {
		case 1:
			System.out.println("Hello");
			break;
		case 2:
			System.out.println("How are you?");
			break;
		case 3:
			System.out.println("Exting ...");
			System.exit(0);
			break;
		case 100:
			System.out.println("Yo've found the hidden Easter egg");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid option.");
			break;
		}
	}

}

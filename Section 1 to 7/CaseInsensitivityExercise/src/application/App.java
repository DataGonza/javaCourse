package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String input = null;
		do {
			System.out.print("Please, enter a command > ");
			input = scanner.nextLine();
			
			if(input.equalsIgnoreCase("start")) {
				System.out.println("Machine starting ....");
			}
			else if(input.equalsIgnoreCase("stop")) {
				System.out.println("Exiting ....");
			}
			else if(input.length() == 0 || input.equalsIgnoreCase("quit")) {
				continue;
			}
			else {
				System.out.println("Unrecognised command");
			}
			
		} while(!input.equalsIgnoreCase("quit"));
		
		scanner.close();
	}

}

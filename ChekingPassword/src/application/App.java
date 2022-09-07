package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		final String USER_PASSWORD = "hello";
		
		Scanner scanner = new Scanner(System.in);
		boolean maxAttemp = false;
		
		for(int i = 0; i<3; i++) {
			System.out.print("Enter password > ");
			String password = scanner.nextLine();
			if(password.equals(USER_PASSWORD)) {
				System.out.println("Access granted.");
				break;
			}
			else {
				System.out.println("Incorrect password");
			}
			if(i == 2) {
				maxAttemp = true;
			}
		}
		if(maxAttemp) {
			System.out.println("Acces denied.");
		}
		scanner.close();
	}

}

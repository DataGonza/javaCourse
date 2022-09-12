package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		final int N = 3;

		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[N];
		
		for(int i =0; i<N; i++) {
			System.out.print("Enter a number: ");
			
			numbers[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		int total = 0;
		
		for(int number : numbers) {
			System.out.println(number);
			total += number;
		}
		
		System.out.println("Total value is: " + total);
		
	}

}

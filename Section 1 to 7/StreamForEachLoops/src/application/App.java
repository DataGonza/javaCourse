package application;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {

		String[] animals = {"cat", "dog", "sloth", "elephant"};
		
		Arrays.stream(animals).forEach(animal -> {
			System.out.println(animal);
		});
	}

}

package application;

public class App {

	public static void main(String[] args) {

		int counter = 0;

		while (counter < 10) {
			System.out.printf("Counter: %d\n", counter);

			counter += 1;

			System.out.printf("Counter: %d\n", counter);

			counter++;
			
			System.out.printf("Counter: %d\n", counter);

			++counter;
			
			System.out.printf("Counter: %d\n", counter);

			counter -= 1;
			
			System.out.printf("Counter: %d\n", counter);

			counter--;
			
			System.out.printf("Counter: %d\n", counter);

			--counter;
		}

		System.out.println("End loop");
	}

}

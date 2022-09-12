package application;

public class App {

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		
		final int toSquared = 9;
		int squeared = calc.square(toSquared);
		
		System.out.printf("%d squared is : %d\n", toSquared, squeared);
		
		int added = calc.add(7, 5);
		System.out.println("7 plus 5 is: " + added);
	}

}

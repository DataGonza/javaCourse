package application;

public class App {

	public static void main(String[] args) {
		
		boolean isRaining = false;
		
		if(isRaining) {
			System.out.println("It's raining!");
		}
		else {
			System.out.println("It's not raining");
		}
		
		if(isRaining)
			System.out.println("It's raining!"); // It will be execute is isRaining is true
			System.out.println("Take an umbrella."); // It will be to execute always
	}

}

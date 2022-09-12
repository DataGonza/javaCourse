package application;

public class App {

	public static void main(String[] args) {

		int cats = 42;
		int dogs = 23;
		int weasels = 42;
		
		boolean moreCatsThanDogs = cats > dogs;
		System.out.println("More cats than dogs; " + moreCatsThanDogs);
		
		System.out.printf("Same number of cats and weasels: %b\n", cats == weasels);
		System.out.printf("Same number of cats and dogs: %b\n", cats == dogs);
		
		System.out.printf("Same number of cats grater than number of weasels: %b\n", cats > weasels);
		
		// Don't use == with doubles
		
	}

}

package application;

public class App {

	public static void main(String[] args) {

		String[][] words = {
				{"one", "two", "three"},
				{"apple", "orange", "banana"},
				{"fox", "cat", "horse"}
		};
		
		for(String[] subArray: words) {

			for(String word: subArray ) {
				System.out.printf("%s\t", word);
			}
			
			System.out.println();
		}
	}

}

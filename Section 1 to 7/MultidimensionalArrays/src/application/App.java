package application;

public class App {

	public static void main(String[] args) {

		String[][] texts = {
				{"one", "two", "three"},
				{"four", "five", "six"},
				{"seven", "eight", "nine"}
		};
		
		for(int i = 0; i < texts.length; i++) {

			for(String word : texts[i]) {
				System.out.println(word);
			}
		}
	}

}

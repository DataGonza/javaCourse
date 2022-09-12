package application;

public class App {

	public static void main(String[] args) {

		String text = "Hello!";
		//text = new String("Hello!");
		
		String[] texts = new String[3];
		System.out.println(texts);
		
		
		texts[0] = "Hi";
		texts[1] = "Hello";
		texts[2] = "Bye";
		
		for(String word: texts) {
			System.out.println(word);
		}
	}

}

package application;

public class App {

	public static void main(String[] args) {

		Person person1 = new Person("Mary", 17);
		
		Person person2 = new Person("Joe", 75);
		
		Person person3 = new Person();
		
		System.out.println(person1.toString());
		System.out.println(person2.toString());
		System.out.println(person3.toString());
		
	}

}

package application;

public class App {

	public static void main(String[] args) {

		Person person1 = new Person("Mary", 17);
		
		Person person2 = new Person("Joe", 75);
		
		Person person3 = new Person();
		
		System.out.println(person1.getName());
		System.out.println(person1.getAge());
		
		System.out.println(person2.getName());
		System.out.println(person2.getAge());
		
		System.out.println(person3.getName());
		System.out.println(person3.getAge());
		
	}

}

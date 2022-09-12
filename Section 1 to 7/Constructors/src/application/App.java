package application;

public class App {

	public static void main(String[] args) {

		Person person1 = new Person();
		person1.setName("Mary");
		person1.setAge(17);
		
		Person person2 = new Person();
		person2.setName("Joe");
		person2.setAge(75);
		
		Person person3 = new Person();
		
		System.out.println(person1.getName());
		System.out.println(person1.getAge());
		
		System.out.println(person2.getName());
		System.out.println(person2.getAge());
		
		System.out.println(person3.getName());
		System.out.println(person3.getAge());
		
	}

}

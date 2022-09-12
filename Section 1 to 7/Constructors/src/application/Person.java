package application;

public class Person {
	String name;
	int age;
	
	public Person() {
		this.name = "?";
		this.age = 0;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	String getName() {
		return this.name;
	}
	
	int getAge() {
		return this.age;
	}

}

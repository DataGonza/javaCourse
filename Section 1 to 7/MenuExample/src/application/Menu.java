package application;

public class Menu {
	String[] options = {
			"View database",
			"Add new item",
			"Delete item",
			"Quit program"
	};
	
	public void display() {
		
		System.out.println("Choose an option:");
		
		for(int i = 0; i < this.options.length; i++) {
			System.out.println(String.format("%d. %s", i+1, this.options[i]));
		}
	}

}

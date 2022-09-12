package application;

public class Menu {
	String[] options = {
			"View database",
			"Add new item",
			"Delete item",
			"Quit program"
	};
	
	String get() {
		
		String menuText = "Choose an option: \n";

		for(int i = 0; i < this.options.length; i++) {
			menuText += String.format("%d. %s \n", i+1, this.options[i]);
		}
		
		return menuText;
	}

}

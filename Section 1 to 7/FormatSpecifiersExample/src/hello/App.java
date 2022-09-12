package hello;

public class App {

	public static void main(String[] args) {
		
		System.out.println("Enter value in fahrenheit to convert > ");
		
		double fahrenheit = 96;
		
		double celsius = (fahrenheit - 32) * 5.0/9;
		
		System.out.printf("%.2f degrees Fahrenheit is %.2f degress celcius.\n", fahrenheit, celsius);

	}

}

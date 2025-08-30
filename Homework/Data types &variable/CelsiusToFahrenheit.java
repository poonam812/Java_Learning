// Write a program to convert temperature from Celsius to Fahrenheit.

import java.util.Scanner;
public class CelsiusToFahrenheit{
	public static void main(String args[]){
		
		Scanner Input=new Scanner(System.in);
	
	System.out.print("Enter temprature in celsius: ");
	double celsius = Input.nextDouble();
	
	
	
	double fahrenheit = (celsius*9/5)+32;
	
	System.out.println(celsius + "°C=" + fahrenheit + "°F");

	
}
	 

}
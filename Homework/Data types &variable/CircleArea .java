Write a program to calculate the area of a circle given the radius (use double).

import java.util.Scanner;
public class CircleArea{
	public static void main(String[]args){
		
		Scanner Input=new Scanner(System.in);
		
		System.out.print("Enter radius of a circle");
		double radius=Scanner.nextDoubal();
		
		doubal area=PI*radius*radius;
		
		System.out.println("Area of a circle " + area);
	}
	
	
}
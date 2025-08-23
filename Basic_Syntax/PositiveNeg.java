

// Write a program input a number and check whether it is positive negative or zero.
// If positive print Positive Number if negative print Negative Number If Zero ,Print Number is Zero.

import java.util.Scanner;
public class PositiveNeg{
	
	public static void main(String[] args){
		
	Scanner Input = new Scanner(System.in);
	
	System.out.print("Enter Your Number:");
	int Number = Input.nextInt();
	
	
	if(Number > 0){
	    System.out.println("Positive Number");
		
	}else if(Number < 0){
		System.out.print("Negative Number");
		
	}else{
		System.out.println("Number is Zero");
		}
	
	}
	
	
}

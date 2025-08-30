// Write a program to find the factorial of a number. 

import java.util.Scanner;
public class FactorialNumber{
	public static void main(String[]args){
	Scanner Input=new Scanner(System.in);
	
	System.out.println("Enter a number ");
	int num=Input.nextInt();
	
	long fact=1;
	
	for(int i=1; i<=num; i++){
		fact*=i;
		
	}
		System.out.println("Factorial of " +  num + "=" + fact);
	}
}
 
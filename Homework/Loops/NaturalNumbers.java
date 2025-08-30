// Write a program to find the sum of first n natural numbers.

import java.util.Scanner;
public class NaturalNumbers{
	
	public static void main(String[]args){
		
		Scanner Input=new Scanner(System.in);
		
		
		System.out.println("Enter a number");
		int num=Input.nextInt();
		
		int sum=0;        //0+1=1 1+2=3
		
	   for(int i=1; i<=num; i++){
		   sum+=i;       //sum=sum+i//
		   
		 
	   }
		
		   System.out.println("Sum of first  " + num + " natural numbers is: " +sum);
		
		
		
	}
}

//natural numbers 5= 0+1=1 1+2=3 3+3=6 4+6=10 10+5=15 //
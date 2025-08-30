// Write a program to reverse a number using a loop.

import java.util.Scanner;
public class ReverseNumber{
	public static void main(String[] args){
		
		Scanner Input=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num =Input.nextInt();
		int reversed=0;
		
		while(num!=0){
			int digit=num%10;
			reversed=reversed*10+digit;
			num=num/10;
			
		}
		System.out.println("Reversed number:" + reversed);
		
		
	}

}
// Write a program to check if a year is a century year and also a leap year.

import java.util.Scanner;
public class CheckYear{
	
	public static void main(String[]args){
		
		Scanner Input=new Scanner(System.in);
		
		System.out.println("Enter a Year");
		int year=Input.nextInt();
		
		if(year%100==0){
			System.out.println(year +  "Is a century year");
			
			if(year%400==0){
			System.out.println(year + "Is also a leap year");
			
		}else{
			System.out.println("Is not a leap year");
		}
		
			
		}else{
			System.out.println("Is not a century year");
			
			if(year%4==0){
				System.out.println(year + "is a leap year");
				
				
			}else{
				System.out.println(year + "is not a leap year");
			}
			
		}
		
		
		
	
		
			
		}
	}

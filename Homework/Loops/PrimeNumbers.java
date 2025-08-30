// Program to find all prime numbers between 1 and 100

import java.util.Scanner;
public class PrimeNumbers{
	public static void main(String[]args){
		
		System.out.println("Prime Numbers between 1 and 100 are: ");
		
		for(int num=2; num<=100; num++){
			boolean isprime=true;
			
			
			for(int i=2; i<=num/2; i++){
				if(num%i==0){
					isprime=false;
				
				}
			}
			if(isprime){
				System.out.print(num + " ");
				
			}
		}
	}

}

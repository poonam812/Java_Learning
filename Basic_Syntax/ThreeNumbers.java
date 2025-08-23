// Write a program to input character from the user 


import java.util.Scanner;
public class ThreeNumbers{
	
	public static void main(String[]args){
		
		Scanner Input = new Scanner(System.in);
		
		
		System.out.print("Enter First Number:");
		int num1 = Input.nextInt();
		
		System.out.print("Enter Second Number:");
		int num2 = Input.nextInt();
		
		System.out.print("Enter Third Number:");
		int num3 = Input.nextInt();
		
		if(num1 > num2 && num1 > num3){
			System.out.println(num1 +":Is Greater");
			
		}else if(num2 > num1 && num2 > num3){
			System.out.println(num2 + ":Is Greater");
			
		}else if(num3 > num1 && num3 > num2){
			System.out.println(num3 + " :Is Greater");
			
		}else{
			System.out.println("All are equal");
		}
	}
}
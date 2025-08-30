// Write a program to categorize age into Child, Teen, Adult, Senior.


import java.util.Scanner;
public class AgeCategorize{
	public static void main(String args[]){
		
		Scanner Input=new Scanner(System.in);
		
		System.out.println("Enter your age");
		int age=Input.nextInt();
		
		if(age>=0 && age<=12){
			System.out.println("You are a child");
			
		}else if(age>=13 && age<=19){
			System.out.println("You are a Teenager");
			
		}else if(age>=20 && age<=59){
			System.out.println("You are a adult");
			
		}else if(age>=60){
			System.out.println("You are a Senior");
			
		}
	}
}
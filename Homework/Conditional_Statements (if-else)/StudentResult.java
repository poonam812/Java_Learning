// Write a program to determine if a student passed or failed based on marks in 5 
// subjects (minimum 40 in each and 50% overall). 


import java.util.Scanner;
public class StudentResult{
	public static void main(String args[]){
	
	Scanner Input=new Scanner(System.in);
	
	
	System.out.print("Enter marks of first subject: ");
	int a1 = Input.nextInt();
	
	System.out.print("Enter marks of second subject: ");
	int a2 = Input.nextInt();
	
	System.out.print("Enter marks of third subject: ");
	int a3 = Input.nextInt();
	
	System.out.print("Enter marks of fourth subject: ");
	int a4 = Input.nextInt();
	
	System.out.print("Enter marks of fifth subject: ");
	int a5 = Input.nextInt();
	
	
	int total = a1+a2+a3+a4+a5;
	double percentage = total/5.0;
	
	
	if(a1>=40 && a2>=40 && a3>=40 && a4>=40 && a5>=40 && percentage>=50){
		System.out.print("Result is pass ");
		
	}else{
		System.out.print("Result faill ");
		
	}
	}
}
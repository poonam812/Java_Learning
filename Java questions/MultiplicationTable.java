// Write a program to print the multiplication table of a number. 


import java.util.Scanner;
public class MultiplicationTable{
	public static void main(String args[]){
	
	Scanner Input=new Scanner(System.in);
	
	System.out.println("Enter a number");
	int num=Input.nextInt();
	
	
	for(int i=1; i<=10; i++){
		System.out.println(num + " * " + i + " = " + (num * i));

	}
	}
}
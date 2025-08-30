 // Write a program to check if three sides can form a valid triangle.Write a program to check whether a character is a vowel or consonant. 
 
 import java.util.Scanner;
 public class TriangleValidity{
	 
	 public static void main(String[]args){
		 
		 Scanner Input=new Scanner(System.in);
		 
		 System.out.print("Enter first side: ");
		 int a = Input.nextInt();
		 
		 System.out.print("Enter second side: ");
		 int b = Input.nextInt();
		 
		 System.out.print("Enter third side: ");
		 int c = Input.nextInt();
		 
		 if(a+b>c && a+c>b && b+c>a){
			 System.out.println("The sides are valid triangle");
			 
		 }else{
			 System.out.println("The sides are not valid triangle");
		 }
		 
		 
		 
	 }
 
 }
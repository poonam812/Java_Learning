 Write a program to find the largest of three numbers. 
 
 import java.util.java;
 public class LargestOfThree{
	 
	 public static void main(String args[]){
		 
		 System.out.print("Enter the first number: ");
		 int num1 = Scanner.nextInt();
		 
		 System.out.print("Enter second number: ");
		 int num2 = Scanner.nextInt();
		 
		 System.out.print("Enter third number: ");
		 int num3 = Scanner.nextInt();
		 
		 
		 if(num1>=num2 && num1>=num3){
			 System.out.println("Largest number is: " num1);
			 
		 }else if (num2>=num1 && num2>=num3){
		 System.out.println("Largest number is :" num2);
		 
		 }else{
			 System.out.print("largest number is:" num3);
		 }
		 
		 
		 
	 }
 }
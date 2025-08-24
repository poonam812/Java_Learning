 // Write a program to check whether a number is positive, negative, or zero. 
 
 
 import java.util.Scanner;
 public class CheckNumber{
	 
	 public static void main(String[]args){
		 Scanner Input=new Scanner(System.in);
		 
		 
		 System.out.println("Enter a number");
		 int num=Input.nextInt();
		 
		 
		 if(num>0){
			 
			System.out.println(num + " Is positive");
			
		 }else if(num<0){
			 System.out.println(num + " Is negative");
			
		 }else{
			 System.out.println("Number is Zero");
		 }
			 
		 
		 
	 }
 
 }
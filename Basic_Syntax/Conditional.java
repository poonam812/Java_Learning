/*
write a program to to take an input of marks of a student of 5 subjects and then calculate the percentage of it
if percentage is greater than 90% the student has grade A
if percentage is greater than 75% the student has grade B
if percentage is greater than 60% the student has grade C
if percentage is greater than 35% the student has grade D
and if the student get percentage less than 35 then show you are fail.

*/



import java.util.Scanner;

public class Conditional {
	public static void main(String []args){
		
	   Scanner Input = new Scanner(System.in);
	   
	   System.out.println("Enter your Marks Of First Subject");
	   int sub1= Input.nextInt();
	    
	   System.out.println("Enter Your Marks Of Second Subject");
	   int sub2= Input.nextInt();
	   
	   System.out.println("Enter Your Marks Of Third Subject");
	   int sub3= Input.nextInt();
	   
	   System.out.println("Enter Your Marks Of Forth Subject");
	   int sub4= Input.nextInt();
	   
	   System.out.println("Enter Your Marks Of Fifth Subject");
	   int sub5= Input.nextInt();
	   
	   int Total=sub1+sub2+sub3+sub4+sub5;
	   System.out.println("Total Is " + Total);
	   
	   double Percentage= Total/5;
	   System.out.println("Percentage Is " + Percentage);
	   
	   
	   if(Percentage>=90){
		   System.out.println("Student has grade A with percentage" + Percentage);
		   
	   }else if(Percentage>=75){
		   System.out.println("Student has grade B with percentage" + Percentage);
		   
	   }else if(Percentage>=60){
		   System.out.println("Student has grade C with percentage" + Percentage);
		   
	   }else if(Percentage>=35){
		   System.out.println("Student has grade D with percentage" + Percentage);
		   
	   }else{
		   System.out.println("You are faill" + Percentage);
	   }
	   
	       
	   }

}
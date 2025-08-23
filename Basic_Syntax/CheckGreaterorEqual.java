// write a program to input two numbers from the user and print the greater one.
// If both are equal print Both numbers are equal.



import java.util.Scanner;
public class CheckGreaterorEqual{
	public static void main(String[]args){
		
		
		Scanner Input = new Scanner(System.in);
		
		
		System.out.print("Enter First Number:");
		int num1 = Input.nextInt();
		
		System.out.print("Enter Second Number:");
		int num2 = Input.nextInt();
		
		if(num1 > num2){
			System.out.print(num1 + ":Is Greater");
			
		}else if(num1==num2){
			System.out.println("Both are equal");
		}
		   
	}
	
}

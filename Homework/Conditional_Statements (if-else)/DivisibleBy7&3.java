// Write a program to check if a number is divisible by both 3 and 7.



import java util.Scanner;
public class DivisibleBy7and3{
	public static void main(String[]args){
		Scanner Input=new Scanner(System.in);
		
		
		System.out.print("Enter a number");
		int num1 = Input.nextInt();
		
		if(num1%3==0 && num1%7==0){
			System.out.println(num1 + "Divisibale by both 3 and 7");
			
		}else{
			System.out.println(num1 + "Is not divisibleby both 3 and 7");
		}
	}
	
	
}
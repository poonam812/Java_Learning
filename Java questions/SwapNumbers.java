
// Write a program to swap two numbers without using a third variable.
import java.util.Scanner;
public class SwapNumbers{
	public static void main(String[]args){
	
	Scanner Input=new Scanner(System.in);
	
	System.out.println("Enter your first number");
	int a=Input.nextInt();
	
	System.out.println("Enter your second number");
	int b=Input.nextInt();
	
	System.out.println("Before Swapping");
	System.out.println("a=" + a + ",b=" +b);
	
	a=a+b;
	b=a-b;
	a=a-b;
	
	System.out.println("After Swap");
	System.out.println("a=" + a + ",b="+b);
	}

}
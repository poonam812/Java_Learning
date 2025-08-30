// Write a program to print the Fibonacci series up to n terms.


import java.util.Scanner;
public class FibonacciSeries{
	public static void main(String[]args){
		
		Scanner Input=new Scanner(System.in);
		
		
		System.out.println("Enter a number");
		int num=Input.nextInt();
		
		
		int first=0,second=1;
		
		
		for(int i=1; i<=num; i++){
			System.out.print(first +" ");
			
			
			int next=first+second;
			first=second;
			second=next;
		}
	}

}
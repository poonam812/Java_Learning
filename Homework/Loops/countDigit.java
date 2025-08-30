// Write a program to count the number of digits in a number.

import java.util.Scanner;
public class countDigit{
	public static void main(String[]args){
		
		Scanner Input=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num=Input.nextInt();
		
		int count=0;
		int temp=Math.abs(num); //Handle negative numbers//
		
		
		if(temp==0){        //temp is a temporary veriable//
			count=1;
			
		}else{
			while(temp>0){
				temp=temp/10;  //remove last digits//
				count++;
			}
		}          
		System.out.println("Number of digits:" + count );
		
		
	}
	

}
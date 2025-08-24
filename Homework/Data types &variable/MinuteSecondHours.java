// Write a program to convert seconds into hours, minutes, and remaining seconds. 

import java.util.Scanner;
public class MinuteSecondHours{
	public static void main(String[]args){
		
		Scanner Input=new Scanner(System.in);
		
		System.out.print("Enter seconds ");
		int totalSeconds = Input.nextInt();
		
		int hours = totalSeconds / 3600;              
        int minutes = (totalSeconds % 3600) / 60;   
        int seconds = totalSeconds % 60;      
		
		
		System.out.println(hours + "Hours" +  minutes + "Minutes" +  seconds +"seconds" );
		
	}
	
	
}
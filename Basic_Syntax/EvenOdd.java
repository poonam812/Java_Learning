
// Write a program to input a number from the user and check whether it is even or odd.
 // If it is even,print"Even Number".
 // If it is odd,print "Odd Number."



import java.util.Scanner;
public class EvenOdd{
    public static void main(String[] args){
		
		Scanner Input = new Scanner(System.in);
		
		System.out.print("Enter Your Number:");
		int Number = Input.nextInt();
		
		
		if(Number%2 == 0){
			System.out.print(Number + "-Even Number");
		}else{
			System.out.print(Number + "-Odd Number");
		}
		 
	}
	
}
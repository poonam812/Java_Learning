
// Write a program to take a age as input from the user and check whether the person is
// eligibal for voting or not. If age is 18 or more  print Eligibal for Voting .Otherwiase print
// Not Eligibal For Voting.


import java.util.Scanner;

 public class VotingCheck{

public static void main(String[]args){
	
	Scanner Input = new Scanner(System.in);
	
	System.out.print("Enter Your Age:");
	int age = Input.nextInt();
	
	if(age >= 18){
		System.out.println("Eligibal For Voting");
		
			
	}else{
		System.out.print("Not Eligibal For Voting");
	}
	
	
}
	
}
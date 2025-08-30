  // Write a program to find perfect numbers between 1 and 1000.
  
  
  import java.util.Scanner;
  public class PerfectNumbers{
	  
	  public static void main(String[]args){
		  
		  System.out.println("Perfect numbers between 1 and 1000 is: ");
		  
		  
		  for(int num=1; num<=1000; num++){
			  int sum=0;              //sum starts as 0//  
			  
			  for(int i=1; i<=num/2; i++){
				  if(num%i==0){
					  sum +=i;
				  }
			  }

			  if(sum==num){
				  System.out.println(num);
				  
			  }
		  }
		  
	  }
  
  }
  //A perfect number is a number that is equal to the sum of its proper divisors (excluding itself).

// Example: 6 → divisors: 1, 2, 3 → sum = 1+2+3 = 6 

// Example: 28 → divisors: 1, 2, 4, 7, 14 → sum = 28 //
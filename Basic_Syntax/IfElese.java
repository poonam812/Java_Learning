import java.util.Scanner;
public class IfElese{
 
 public static void main(String[]args){
 
 
	Scanner Input = new Scanner (System.in);
	
	System.out.print("Enter Your First Number:");
	int num1 = Input.nextInt();
	
	System.out.print("Enter Your Second Number:");
	int num2 = Input.nextInt();
	
	if(num1>num2){
	 System.out.print(num1 +" Is Greater");
	 
	}
	else{
	
	System.out.print(num2 +" Is Greater");
	}
	
	
 }
}

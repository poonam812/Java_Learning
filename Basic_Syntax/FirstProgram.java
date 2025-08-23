import java.util.Scanner;

public class FirstProgram{
	public static void main(String []args){
	    
	Scanner Input=new Scanner(System.in);
	
	System.out.print("Enter Your Name :");
	String name = Input.nextLine();

	
	System.out.print("Enter Your Age :");
	int age = Input.nextInt();

	
	System.out.print("Enter Your Percentage in 10th :");
	double percentage = Input.nextDouble();
	System.out.println();

	System.out.println("My Name Is ");
	System.out.println(name);
    System.out.println("My Age Is:");
    System.out.println(age);
    System.out.println("My 10th Persentage Is :");
    System.out.println(percentage);
	}
 
 
}

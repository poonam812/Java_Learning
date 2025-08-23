import java.util.Scanner;
public class PersonInfo{
	public static void main(String[]args){
		
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Enter Your name:");
		String name = Input.nextLine();
		
		System.out.println("Enter Your Age:");
		int age = Input.nextInt();
		
		System.out.println("Enter Your City:");
		String city = Input.nextLine();
		
		System.out.println("Hello,my name is " + name + ".I am " + age  + "years old and I live in " + city + ".");
	}
	

}
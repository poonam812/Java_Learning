import java.util.Scanner;
public class Loops{
	public static void main(String[]args){
		
	Scanner Input = new Scanner(System.in);
	
	System.out.println("Enter Your number");
	int number = Input.nextInt();
	
	for(int i=1; i<=10; i++){
		System.out.println(number+"x"+i+"="+i*number);
	}
	
	}
}	
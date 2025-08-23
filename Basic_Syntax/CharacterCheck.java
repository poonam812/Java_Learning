import java.util.Scanner;
public class CharacterCheck{
	public static void main(String[]args){
		
		Scanner Input = new Scanner(System.in);
		System.out.print("Enter a Characters:");
		
	
		char abc = Input.next().charAt(0);
		System.out.println("Value of abc " + abc);
		
		if((abc >= 'A'&& abc <= 'Z') || (abc >= 'a' && abc <= 'z')){
			System.out.println("This is a character");
			
		}else if(abc >= '0'&& abc <= '9'){
			System.out.println("This is a digit");
			
		}else{
			System.out.println("This is a Special character");
		}
			
	}

}
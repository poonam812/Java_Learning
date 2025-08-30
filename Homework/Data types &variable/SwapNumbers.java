import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = Input.nextInt();

        System.out.print("Enter second number: ");
        int b = Input.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

     
        a = a + b;  
        b = a - b;  
        a = a - b; 

        System.out.println("After swapping: a = " + a + ", b = " + b);

       
    }
}

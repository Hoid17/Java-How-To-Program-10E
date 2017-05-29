// Calculate factorial of number entered by user
// @Author: Adam Janecka
package pkg3_37a;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int number; // Number input by user
        int counter; // used for while loop
        int factorial; // Factorial of user input
        
        System.out.print("Enter number: ");
        number = input.nextInt();
        counter = number;
        factorial = number;
        
        while (counter > 1)
        {
            factorial = factorial * (counter - 1);
            counter--;
        }
        
        System.out.printf("%d! is %d%n", number, factorial);
    } // end method main
} // end class Factorial

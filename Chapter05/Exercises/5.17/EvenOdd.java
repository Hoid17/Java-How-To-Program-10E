// See if a function is even or odd using a method
// @Author: Adam Janecka
package pkg5_17;
import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int number = 0; // Number input by user
        
        System.out.print("Enter a string of numbers or -1 to quit: ");
        
        
        while (!input.hasNext("-1")) // while the next number is not -1
        {
            number = input.nextInt();
            
            if (isEven(number)) // if the number is even
                System.out.printf("%d is even.%n", number);
            else // if the number is odd
                System.out.printf("%d is odd.%n", number);

        }
    } // end method main
    
    // Sees if a number is even or odd
    public static boolean isEven(int number)
    {
        if (number % 2 == 0) // If number is even
            return true;
        else  // If number is odd
            return false; 
    } // end method isEven
} // end class EvenOdd

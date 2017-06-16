// See if one number is a multiple of another
// @Author: Adam Janecka
package pkg5_16;
import java.util.Scanner;

public class Multiples {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num1; // First number
        int num2; // Second number
        
        System.out.print("Enter a pair of numbers or x to quit: ");
        while(input.hasNextInt())
        {
        num1 = input.nextInt();
        num2 = input.nextInt();
        
        if (isMultiple(num1, num2))
            System.out.printf("The second number is a multiple of the first number.%n");
        else
            System.out.printf("The second number is not a multiple of the first number.%n");
        }
    } // end method main
    
    // Sees if a number is a multiple of another
    public static boolean isMultiple(int num1, int num2)
    {
        if (num2 % num1 == 0)
            return true;
        else
            return false;
    } // end method isMultiple
} // end class Multiples

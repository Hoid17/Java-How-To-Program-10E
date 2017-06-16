// Write a method equal to Math.pow();
// @Author: Adam Janecka
package pkg5_14;
import java.util.Scanner;

public class Exponentiation {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        int base = 0; // Base value
        int exponent = 0; // Exponent value
        
        System.out.print("Enter base or -1 to quit: ");
        base = input.nextInt();
        
        while (base != 0) // Allows multiple uses of program
        {
            System.out.print("Enter exponent: ");
            exponent = input.nextInt();
            
            System.out.printf("%d^%d = %d%n", base, exponent, integerPower(base, exponent));
            
            System.out.print("Enter base or -1 to quit: ");
            base = input.nextInt();
        }
    } // end method main
    
    // Calculates the exponential value of two numbers 
    public static int integerPower(int base, int exponent)
    {
        int result = 1;
        
        for (int i = 1; i <= exponent; i++)
        {
            result *= base;
        }
        
        return result;
    } // end method integerPower
} //end class Exponentiation

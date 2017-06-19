// Finds the greatest common divisor of two integers
// @Author: Adam Janecka
package pkg5_27;
import java.util.Scanner;

public class GreatestCommonFactor {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num1; // First number
        int num2; // Second number
        
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        System.out.print("Enter second number: ");
        num2 = input.nextInt();
        int divisor = gcd(num1, num2);
        
        System.out.printf("The greatest common divisor is %d%n", divisor);
    } // end method main
    
    // Finds the greatest common divisor of two numbers
    public static int gcd(int num1, int num2)
    {
        
        int divisor = 1; // Every two numbers share a factor of 1
        
        for (int i = 1; i <= num1; i++)
        {
            if (num1 % i == 0 && num2 % i == 0)
                divisor = i;
        }
        
        return divisor;
    } // end method gcd
} // end class GreatestCommonFactor

// Find the sum, product, difference, and quotient of two numbers given
// by user
// @Author: Adam Janecka
package pkg2_15;
import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int x; // First integer
        int y; // Second integer 
        int sum; // Addition
        int difference; // Subtraction
        int product; // Multiplication
        int quotient; // Division
        
        System.out.print("Enter first inger: "); // Prompt
        x = input.nextInt(); // Get First Integer
        
        System.out.print("Enter second integer: "); // Prompt
        y = input.nextInt(); // Get Second Integer
        
        sum = x + y;         //Declaring four operations
        difference = x - y;
        product = x * y;
        quotient = x / y;
        
        System.out.printf("The sum is %d%n", sum); // Sum
        System.out.printf("The difference is %d%n", difference); // Difference
        System.out.printf("The product is %d%n", product); // Product
        System.out.printf("The quotient is %d%n", quotient); // Quotient
    } // end method main
} // end class Arithmetic

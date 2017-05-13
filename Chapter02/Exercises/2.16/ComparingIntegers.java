// Compares two integers and displays which one is bigger
// @Author: Adam Janecka
package pkg2_16;
import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int x; // First Integer
        int y; // Second Integer
        
        System.out.print("Enter first integer: "); // Prompt
        x = input.nextInt(); // Get First Integer
        
        System.out.print("Enter second integer: "); // Prompt
        y = input.nextInt(); // Get Second Integer
        
        if (x > y)                                // If the first
            System.out.printf("%d is larger%n", x); // number is larger
        
        if (x < y)                                // If the second
            System.out.printf("%d is larger%n", y); // number is larger
        
        if (x == y)
            System.out.println("These numbers are equal%n"); // If equal
    } // end method main
} // end class ComparingIntegers

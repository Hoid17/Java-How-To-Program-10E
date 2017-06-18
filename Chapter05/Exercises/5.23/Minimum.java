// Finds the minimum of three numbers
// @Author: Adam Janecka
package pkg5_23;
import java.util.Scanner;

public class Minimum {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num1; // First number
        int num2; // Second number
        int num3; // Third number
        
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        System.out.print("Enter second number: ");
        num2 = input.nextInt();
        System.out.print("Enter third number: ");
        num3 = input.nextInt();
        
        System.out.printf("The smallest number is %d%n", minimum3(num1, num2, num3));
    } // end method main
    
    // Finds the minimum of 3 numbers
    public static int minimum3(int num1, int num2, int num3)
    {
        int smallest = num1; 
        
        if (num2 < smallest)
            smallest = num2;
        if (num3 < smallest)
            smallest = num3;
        
        return smallest;
    } // end method minimum3
} // end class Minimum

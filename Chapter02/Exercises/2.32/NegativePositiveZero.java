// Input five numbers and find the number of positive numbers
// negative numbers and numbers equal to 0 
// @Author: Adam Janecka
package pkg3_32;
import java.util.Scanner;

public class NegativePositiveZero {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num1; // First integer
        int num2; // Second integer
        int num3; // Third integer
        int num4; // Fourth integer
        int num5; // Fifth integer
        int positive = 0; // Number of positive integers
        int negative = 0; // Number of negative integers
        int zero = 0; // Number of zeros
        
        System.out.print("Enter first integer: "); // Prompt
        num1 = input.nextInt(); // Get first integer
        System.out.print("Enter second integer: "); // Prompt
        num2 = input.nextInt(); // Get second integer
        System.out.print("Enter third integer: "); // Prompt
        num3 = input.nextInt(); // Get third integer
        System.out.print("Enter fourth integer: "); // Prompt
        num4 = input.nextInt(); // Get fourth integer
        System.out.print("Enter fifth integer: "); 
        num5 = input.nextInt(); // Get fifth integer
        
        if (num1 > 0)               // Determine number of positive integers
            positive = positive + 1;
        if (num2 > 0)
            positive = positive + 1;
        if (num3 > 0)
            positive = positive + 1;
        if (num4 > 0)
            positive = positive + 1;
        if (num5 > 0)
            positive = positive + 1;
        
        if (num1 < 0)               // Determine number of negative integers
            negative = negative + 1; 
        if (num2 < 0)
            negative = negative + 1;
        if (num3 < 0)
            negative = negative + 1;
        if (num4 < 0)
            negative = negative + 1;
        if (num5 < 0)
            negative = negative + 1;
        
        if (num1 == 0)        // Determine numbe of zeros
            zero = zero + 1;
        if (num2 == 0)
            zero = zero + 1;
        if (num3 == 0)
            zero = zero + 1;
        if (num4 == 0)
            zero = zero + 1;
        if (num5 == 0)
            zero = zero + 1;
        
        System.out.printf("Number of positive numbers: %d%n", positive);
        System.out.printf("Number of negative numbers: %d%n", negative);
        System.out.printf("Number of zeros: %d%n", zero);
        
    } // end method main
} // end class NegativePositiveZero

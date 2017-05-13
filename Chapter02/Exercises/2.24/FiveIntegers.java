// Find the largest and smallest of five integers
// @Author: Adam Janecka
package pkg2_24;
import java.util.Scanner;

public class FiveIntegers {

    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       
       int num1; // First integer
       int num2; // Second integer
       int num3; // Third integer
       int num4; // Fourth integer
       int num5; // Fifth integer
       int largest; // Largest integer
       int smallest; // Smallest integer
       
       System.out.print("Enter first integer: "); //Prompt
       num1 = input.nextInt(); // Get first integer
       System.out.print("Enter second integer: "); // Prompt
       num2 = input.nextInt(); // Get second integer
       System.out.print("Enter third integer: "); // Prompt
       num3 = input.nextInt(); // Get third integer
       System.out.print("Enter fourth integer: "); // Prompt
       num4 = input.nextInt(); // Get fourth integer
       System.out.print("Enter fifth integer: "); // Prompt
       num5 = input.nextInt(); // Get fifth integer
       
       largest = num1;  // Initialize largest
       smallest = num1; // Initialize smallest
       
       if (num2 > largest)  // Find the largest integer
           largest = num2; 
       if (num3 > largest)
           largest = num3; 
       if (num4 > largest)
           largest = num4;
       if (num5 > largest)
           largest = num5;
       
       if (num2 < smallest) // Find the smallest integer
           smallest = num2;
       if (num3 < smallest)
           smallest = num3;
       if (num4 < smallest)
           smallest = num4;
       if (num5 < smallest)
           smallest = num5;
       
       System.out.printf("Largest number is %d%n", largest);
       System.out.printf("Smallest number is %d%n", smallest);
       
    } // end method main
} // end class FiveIntegers

// Find the sum, average, product, smallest and largest of three numbers
// @Author: Adam Janecka
package pkg2_17;
import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int x; // First integer
        int y; // Second integer
        int z; // Third integer
        int sum; // Sum of integers
        int product; // Product of integers
        int average; // Average
        int smallest; // Smallest integer
        int largest; // Largest integer
        
        System.out.print("Enter first integer: "); // Prompt
        x = input.nextInt(); // Get first integer
        
        System.out.print("Enter second integer: "); // Prompt
        y = input.nextInt(); // Get second integer
        
        System.out.print("Enter third integer: "); // Prompt
        z = input.nextInt(); // Get third integer
        
        sum = x + y + z; // Assign value to sum
        product = x * y * z; // Assign value to product
        average = sum / 3; // Assign value to average
        smallest = x; // Initialize smallest
        largest = x; // Initialize largest
        
        if (y > largest)  // Determine largest integer
            largest = y;
        if (z > largest)
            largest = z;
        
        if (y < smallest) // Determine smallest integer 
            smallest = y;
        if (z < smallest)
            smallest = z;
        
        System.out.printf("The sum is %d%n", sum);
        System.out.printf("The product is %d%n", product);
        System.out.printf("The average is %d%n", average);
        System.out.printf("The smallest integer is %d%n", smallest);
        System.out.printf("The largest integer is %d%n", largest);
    } // end method main   
} // end class Calculations

// Ex. 2.6: Product.java
// Calculate the product of three integers
package pkg2_6;
import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        // create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);
        
        int x; // first number input by user
        int y; // second number input by user
        int z; // third number input by user
        int result; // product of numbers
        
        System.out.print("Enter first integer: "); // prompt for input
        x = input.nextInt(); // read first integer
        
        System.out.print("Enter second integer: "); // prompt for input
        y = input.nextInt(); // read second integer
        
        System.out.print("Enter third integer: "); // prompt for input
        z = input.nextInt(); // read third integer
        
        result = x * y * z; // calculate product of numbers
        
        System.out.printf("The product is %d%n", result);
    } // end method main
} // end class Product

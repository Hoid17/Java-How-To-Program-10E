// Test for Complex class
// @Author: Adam Janecka
package pkg8_11;

public class ComplexTest {
    
    
    public static void main(String args[])
    {
        Complex num1 = new Complex(5, 3);
        Complex num2 = new Complex(2, 4);
        
        // Display initial amounts
        System.out.printf("num1 = %s%n", num1);
        System.out.printf("num2 = %s%n", num2);
        
        // Add and subtract operations
        System.out.printf("num1 + num2 = %s%n", num1.add(num2));
        System.out.printf("num1 - num2 = %s%n", num1.subtract(num2));
    } // end method main
} // end class ComplexTest

// Calculates the product of a variable number of arguments
// @Author: Adam Janecka
package pkg6_14;

public class VariableProduct {

    public static void main(String[] args) {
        
        double num1 = 12.5;
        double num2 = 5;
        double num3 = 7.5;
        double num4 = 6.6;
        
        System.out.print("Num1 = 12.5\n"
                + "Num2 = 5\n"
                + "Num3 = 7.5\n"
                + "Num4 = 6.6\n");
        
        System.out.printf("Num1 * Num2 = %.2f%n", product(num1, num2));
        System.out.printf("Num1 * Num2 * Num3 = %.2f%n", product(num1, num2, num3));
        System.out.printf("Num1 * Num2 * Num4 = %.2f%n", product(num1, num2, num4));
    } // end method main
    
    // Calculates the product of a variable number of integers
    public static double product(double... numbers)
    {
        double product = 1;
        
        // Calculates the product of all numbers
        for (int i = 0; i < numbers.length; i++)
            product *= numbers[i];
        
        return product;
    } // end method product
} // end class VariableProduct

// Calculate the product of odd integers from 1 to 15
// @Author: Adam Janecka
package pkg4_12;

public class Product {

    public static void main(String[] args) {
        
        int product = 1; // The product of all the numbers
        
        for (int i = 1; i <= 15; i += 2)
            product *= i;
        
        System.out.printf("The product of all odd integers from 1 to 15 is %d%n", product);
    } // end method main
} // end class Product

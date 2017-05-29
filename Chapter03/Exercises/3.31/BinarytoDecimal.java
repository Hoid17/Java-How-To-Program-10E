// Converts a binary number to a decimal number
// @Author: Adam Janecka
package pkg3_31;
import java.util.Scanner;

public class BinarytoDecimal {

    public static void main(String[] args) {
       
        Scanner input = new Scanner (System.in);
        int bin; // Binary number input by user
        int remainder; //Remainder variable used in calculation
        int decimal = 0; // Decimal output
        int power = 0; // Power variable used in calculation
        
        System.out.print("Enter binary number: ");
        bin = input.nextInt();
        
        while (bin != 0)
        {
            remainder = bin % 10;
            decimal = (int)(decimal + remainder * Math.pow(2, power));
            bin = bin / 10;
            power++;
        } // end while loop
        
        System.out.printf("The number as decimal is: %d%n", decimal);
        
    } // end method main 
} // end class BinarytoDecimal

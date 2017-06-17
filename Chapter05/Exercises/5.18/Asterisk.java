// Create a square of asterisks 
// @Author: Adam Janecka
package pkg5_18;
import java.util.Scanner;

public class Asterisk {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int side; // Side of the asterisk square
        
        System.out.print("Enter length of the side of the square: ");
        side = input.nextInt();
        
        squareofAsterisks(side);
    } // end method main
    
    // Prints a square of asterisks
    public static void squareofAsterisks(int side)
    {
        for (int i = 1; i <= side; i++)
        {
            for (int j = 1; j <= side; j++)
                System.out.printf("*");
            System.out.println();
        }
        
    } // end method squareofAsterisks
} // end class Asterisk

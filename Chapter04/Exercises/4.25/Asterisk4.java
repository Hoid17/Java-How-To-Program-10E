// Create diamond with size input by user
// @Author: Adam Janecka
package pkg4_25;
import java.util.Scanner;

public class Asterisk4 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int row; // Number of rows entered by user
        
        System.out.print("Enter odd number between 1 and 19: ");
        row = input.nextInt();
        
        if (row <= 0 || row >= 20 || row % 2 == 0) // Message if incorrect value is input. 
        {
            System.out.print("Incorrect value.  Enter odd number between 1 and 19: ");
            row = input.nextInt();
        }
        
        for (int i = 1; i <= row / 2; i++) // Top half of diamond
        {
            for (int j = row / 2; j >= i; j--)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            for (int j = 1; j < i; j++)
                System.out.print("*");
            System.out.println();
        }
        
        for (int i = 1; i <= row; i++) // Middle row of diamond
            System.out.print("*");
        System.out.println();
        
        for (int i = 1; i <= row / 2; i++) // Bottom half of Diamond
        {
            for (int j = 1; j <= i; j++)
                System.out.print(" ");
            for (int j = row / 2; j >= i; j--)
                System.out.print("*");
            for (int j = row / 2; j > i; j--)
                System.out.print("*");
            System.out.println();
        }
    } // end method main
} // end class Asterisk4

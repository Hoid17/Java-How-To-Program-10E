// Create a square of asterisks based on user input
// @Author: Adam Janecka
package pkg3_29;
import java.util.Scanner;

public class AsteriskSquare {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        int size; // Size of square input by user
        int row = 0; // Row counter
        int column = 0; // Column counter
        
        System.out.print("Enter size of square between 1 and 20: ");
        size = input.nextInt();
        
        while (size <= 1 || size >= 20) // Refuses value not between 1 and 20
        {
            System.out.print("Incorrect value.  Enter value between 1 and 20: ");
            size = input.nextInt();
        }
        
        while (column < size)
        {
            row = 0; 
            
            while (row < size)
            {
                System.out.print("*"); 
                row++;
            }
            System.out.println();
            column++;
        } // end while loop
    } // end method main
} // end class AsteriskSquare

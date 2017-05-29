// Create Asterisk pattern
// @Author: Adam Janecka
package pkg3_32;

public class AsteriskChecker {

    public static void main(String[] args) {
        
        int counter = 0; // Used for while loop
        int counter2 = 0; // Used for each line
        while (counter < 8)
        {
            if (counter % 2 == 1)
                System.out.print(" ");
            
            counter2 = 0; // Resets counter2
            
            while (counter2 < 8)
            {
            System.out.print("*");
            System.out.print(" ");
            counter2++;
            }
            System.out.println();
            counter++;
        } // end while loop
    } // end method main
} // end class Asterisk Checker

// Modify Exercise 4.15 to display across one set of lines
// @Author: Adam Janecka
package pkg4_22;

public class Asterisk2 {

    public static void main(String[] args) {
       
        for (int i = 1; i <= 10; i++)
        {
            // First Asterisk Design
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            for (int j = 10; j > i; j--)
                System.out.print(" ");
            
            System.out.print(" "); // Space between designs
            
            // Second Asterisk Design 
            for (int j = 10; j >= i; j--)
                System.out.print("*");
            for (int j = 1; j < i; j++)
                System.out.print(" ");
            
            System.out.print(" ");
            
            // Third Asterisk Design
            for (int j = 1; j < i; j++)
                System.out.print(" ");
            for (int j = 10; j >= i; j--)
                System.out.print("*");
            
            System.out.print(" ");
            
            // Fourth Asterisk Design
            for (int j = 10; j > i; j--)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            
            System.out.println();
        }
    } // end method main
} // end class Asterisk2

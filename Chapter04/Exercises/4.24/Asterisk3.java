// Create diamond asterisk pattern
// @Author: Adam Janecka
package pkg4_24;

public class Asterisk3 {

    public static void main(String[] args) {
        
        for (int i = 1; i <= 5; i++) // Top half of diamond
        {
            for (int j = 4; j >= i; j--)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            for (int j = 1; j < i; j++)
                System.out.print("*");
            System.out.println();
        }
        
        for (int i = 1; i <= 4; i++) // Bottom half of diamond
        {
            for (int j = 1; j <= i; j++)
                System.out.print(" ");
            for (int j = 5; j > i; j--)
                System.out.print("*");
            for (int j = 4; j > i; j--)
                System.out.print("*");
            
            System.out.println();
        }
            
    } // end method main
} // end class Asterisk3

// Create a square of a certain character
// @Author: Adam Janecka
package pkg5_19;
import java.util.Scanner;

public class CharacterSquare {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int side; // length of the side 
        char x; // The character input by user
        
        System.out.print("Enter length of side: ");
        side = input.nextInt();
        System.out.print("Enter character: ");
        x = input.next().charAt(0);
        
        CharSquare(side, x);
    } // end method main
    
    // Prints out a square of the ceratin character
    public static void CharSquare(int side, char x)
    {
        for (int i = 1; i <= side; i++)
        {
            for (int j = 1; j<= side; j++)
                System.out.printf("%s", x);
            System.out.println();
        }  
    } // end method CharSquare
} // end class CharacterSquare

// Sees how many times the user flipped heads or tails
// @Author: Adam Janecka
package pkg5_29;
import java.util.Scanner;
import java.security.SecureRandom;

public class HeadTails {

    private enum Result {HEADS, TAILS};
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int choice; // Decides whether the player wants to keep flipping
        int heads = 0; // Number of head flips
        int tails = 0; // Number of tail flips

        
        System.out.print("Enter 1 to flip coin, or 2 to stop: "); 
        choice = input.nextInt();
        
        do
        {
            if (flip() == Result.HEADS)
            {
                heads++; // Adds 1 to head counter
                System.out.print("Heads\n");
            }
            else
            {
                tails++; // Adds 1 to tails counter
                System.out.print("Tails\n");
            }
            
            System.out.print("Enter 1 to flip coin, or 2 to stop: ");  
            choice = input.nextInt();
        } while (choice != 2);
        
        System.out.printf("Number of heads: %d%n", heads);
        System.out.printf("Number of tails: %d%n", tails);
        
    } // end method main
    
    // Flips a coin randomly and returns result
    public static Result flip()
    {
        Result coinResult;  // can be HEADS or TAILS
        SecureRandom random = new SecureRandom();
        int flip = random.nextInt(2);
        
        if (flip == 0)
            coinResult = Result.HEADS;
        else
            coinResult = Result.TAILS;
        return coinResult;
    } // end method flip    
} // end class HeadTails

// Has the user guess a number between 1 and 1000
// @Author: Adam Janecka
package pkg5_30;
import java.util.Scanner;
import java.security.SecureRandom;

public class GuessNumber {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();
        int guess = 0; // Number guessed by user
        int count = 1;
        

        
        while (count == 1) // Allows multiple repetitions of the problem
        {
            System.out.print("Guess the number: ");
            guess = input.nextInt();
        
            int num = 1 + random.nextInt(1000); // Acquires a number at random
            
            while (guess != num)
            {
 
                if (guess < num)
                     System.out.println("Too low.");
                if (guess > num)
                    System.out.println("Too high.");           
                guess = input.nextInt();
            
            }
            
            System.out.println("Congratulations.  You guessed the number! "
                    + "Enter 1 to play again or 2 to quit: ");
            count = input.nextInt();            
        }
    } // end method main
} // end class GuessNumber

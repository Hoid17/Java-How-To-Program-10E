// Modify the guess number program to show how many guesses were used
// @Author: Adam Janecka
package pkg5_31;
import java.util.Scanner;
import java.security.SecureRandom;

public class GuessNumberMod {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();
        int guess = 0; // Number guessed by user
        int counter = 1; // Used to control while loop

        

        
        while (counter == 1) // Allows multiple repetitions of the problem
        {
            System.out.print("Guess the number: ");
            guess = input.nextInt();
            int guessCount = 1; // How many guesses used
        
            int num = 1 + random.nextInt(1000); // Acquires a number at random
            
            while (guess != num)
            {
 
                if (guess < num)
                     System.out.println("Too low.");
                if (guess > num)
                    System.out.println("Too high.");   
                guessCount++;
                guess = input.nextInt();
            
            }
            
            System.out.print("Congratulations.  You guessed the number!  ");
            
            // Displays message based on number of guesses
            if (guessCount < 10)
                System.out.print("Either you know the secret or you got lucky!\n");
            if (guessCount == 10)
                System.out.print("Aha! You know the secret!\n");
            if (guessCount > 10)
                System.out.print("You should be able to do better.\n");
            
            System.out.print("Enter 1 to play again or 2 to quit: ");
            counter = input.nextInt();            
        }    
    } // end method main   
} // end class GuessNumberMod

// Help kids learn multiplication
// @Author: Adam Janecka
package pkg5_35;
import java.security.SecureRandom;
import java.util.Scanner;

public class CAI {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();
        
        int count = 1; // Used for multiple repetition
        int answer; // Answer the student gives
        
        do
        {
        // Numbers are randomly selected between 1 and 10
        int num1 = 1 + random.nextInt(10);
        int num2 = 1 + random.nextInt(10);
        
        displayQuestion(num1, num2); // Displays the question
        
        
            answer = input.nextInt();
            
            while (answer != num1 * num2) // When the answer is wrong
            {
                System.out.print("No.  Please try again. ");
                answer = input.nextInt();
            }
            
            System.out.println("Very Good!");
            
            // Gives user a choice so program can end.  
            System.out.print("Enter 1 to continue or 2 to quit."); 
            count = input.nextInt();
            
        } while (count != 2);
    } // end method main
    
    //Displays multiplication question
    public static void displayQuestion(int num1, int num2)
    {
        System.out.printf("What is %d times %d? ", num1, num2);
    } // end method displayQuestion
} // end class CAI

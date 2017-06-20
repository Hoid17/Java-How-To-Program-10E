// Add different responses when answer is correct and incorrect from previous problem
// @Author: Adam Janecka
package pkg5_36;
import java.util.Scanner;
import java.security.SecureRandom;

public class CAI2 {

    public static SecureRandom random = new SecureRandom();
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        
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
                incorrectAnswer();
                answer = input.nextInt();
            }
            
            correctAnswer();
            
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
    
    // prints a random statement when answer is correct
    public static void correctAnswer()
    {
        int choice = 1 + random.nextInt(4);
        
        switch(choice)
        {
            case 1: 
                System.out.print("Very good!\n");
                break;
            case 2: 
                System.out.print("Excellent!\n");
                break;
            case 3:
                System.out.print("Nice work!\n");
                break;
            case 4:
                System.out.print("Keep up the good work!\n");
                break;
        }
    } // end method correctAnswer
    
    // displays a random statement when answer is incorrect
    public static void incorrectAnswer()
    {
        int choice = 1 + random.nextInt(4);
        
        switch(choice)
        {
            case 1: 
                System.out.print("No. Please try again. ");
                break;
            case 2: 
                System.out.print("Wrong. Try once more. ");
                break;
            case 3:
                System.out.print("Don't give up! ");
                break;
            case 4:
                System.out.print("No. Keep trying. ");
                break;
        }
    } // end method incorrectAnswer
}

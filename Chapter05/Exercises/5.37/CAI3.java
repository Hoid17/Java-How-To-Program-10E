// Add a counter to show what percentage of ten answers is correct.
// @Author: Adam Janecka
package pkg5_37;
import java.security.SecureRandom;
import java.util.Scanner;

public class CAI3 {

    public static SecureRandom random = new SecureRandom();
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        
        int count = 1; // Used for multiple repetition
        int answer; // Answer the student gives
        int correct = 0; // Number of correct answer
        int inputs = 0; // Number of questions answered so far
        
        do // Loops until the user quits
        {
            
            while(inputs <= 10) // Loops until the user inputs 10 answers
            {
                // Numbers are randomly selected between 1 and 10
                int num1 = 1 + random.nextInt(10);
                int num2 = 1 + random.nextInt(10);
        
                displayQuestion(num1, num2); // Displays the question
        
        
                answer = input.nextInt();
                inputs++; // 
            
                while (answer != num1 * num2) // When the answer is wrong
                {
                    incorrectAnswer();
                    answer = input.nextInt();
                    inputs++;
                    
                    if (inputs == 10)
                        break;
                }
                
                if (answer == num1 * num2)
                {
                correctAnswer();
                correct++; // Gets 1 answer correct
                }
                
                if (inputs == 10)
                    break;
            
            }
            
            if (correct <= 7)
                System.out.print("Please ask your teacher for extra help.\n");
            else
                System.out.print("Congratulations, you are ready to go to the next level!\n");
            
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
} // end class CAI3

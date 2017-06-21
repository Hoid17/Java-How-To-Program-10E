// Add addition, subtraction, and division to previous problem
// @Author: Adam Janecka
package pkg5_39;
import java.security.SecureRandom;
import java.util.Scanner;

public class CAI5 {

    public static SecureRandom random = new SecureRandom();
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int difficulty; // Has the user select difficulty level
        int type; // The type of math user has chosen
        int count = 1; // Used for multiple repetition
        int userAnswer; // Answer the student gives
        int answer; // The correct answer to the problem
        
        // Displays main menu for problem
        System.out.print("Difficulty Levels\n"
                + "1 - Single Digits\n"
                + "2 - Two Digits\n"
                + "3 - Three Digits\n");
        
        System.out.print("\nType of Mathematics\n"
                + "1 - Addition\n"
                + "2 - Subtraction\n"
                + "3 - Multiplication\n"
                + "4 - Division\n"
                + "5 - Mixture\n");
        
        do // Loops until the user quits
        {
            System.out.print("Enter difficulty level: ");
            difficulty = input.nextInt();
            System.out.print("Enter type: ");
            type = input.nextInt();
            
            // Resets values after each session
            int correct = 0; // Number of correct answer
            int inputs = 0; // Number of questions answered so far
            int mixture = 0; // Used when user wants a mixture of questions.
            
            while(inputs <= 10) // Loops until the user inputs 10 answers
            {

                if (type == 5)
                {
                    mixture = 1 + random.nextInt(4); // Chooses a type at random
                    answer = displayQuestion(difficulty, mixture);
                }
                
                else
                    answer = displayQuestion(difficulty,type);
                
                // Correct answer to the problem
                userAnswer = input.nextInt();
                inputs++; // 
            
                while (userAnswer != answer) // When the answer is wrong
                {
                    incorrectAnswer();
                    userAnswer = input.nextInt();
                    inputs++;
                    
                    if (inputs == 10)
                        break;
                }
                
                if (userAnswer == answer)
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
    
    // Displays question at proper difficulty level
    public static int displayQuestion(int level, int type)
    {
        int num1 = 0; // First random number 
        int num2 = 0; // Second random number
        
        switch (level)
        {
            case 1: 
                num1 = random.nextInt(10);
                num2 = random.nextInt(10);
                break;
            case 2: 
                num1 = random.nextInt(100);
                num2 = random.nextInt(100);
                break;
            case 3:
                num1 = random.nextInt(1000);
                num2 = random.nextInt(1000);
                break;
        }
        
        // Determines what type of problem to output.  Addition is default return statement
        switch (type)
        {
            default: 
                System.out.printf("What is %d plus %d? ", num1, num2);
                return num1 + num2;
            case 2:
                System.out.printf("What is %d minus %d? ", num1, num2);
                return num1 - num2;
            case 3: 
                System.out.printf("What is %d times %d? ", num1, num2);
                return num1 * num2;
            case 4:
                System.out.printf("What is the quotient of %d divided by %d? (Without the remainder)  ", num1, num2);
                return num1 / num2;
        }
    } // end method displayQuestion
} // end class CAI5

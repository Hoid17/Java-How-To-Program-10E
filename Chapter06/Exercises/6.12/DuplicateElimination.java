// Input five numbers and tell if there are duplicates in the array
// @Author: Adam Janecka
package pkg6_12;
import java.util.Scanner;

public class DuplicateElimination {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[] num = new int[5]; // Creates 5 element array
        int uniqueNum = 0; // Counter for unique numbers entered by user
        int userNum; // Number input by user

        
        while (uniqueNum < num.length)
        {
            boolean digit = false; // Checks to see if duplicate or not
                    
            System.out.print("Enter number: ");
            userNum = input.nextInt();
            
            // Make sure number is valid
            while (userNum < 10 || userNum > 100)
            {
                System.out.print("Invalid number.  Enter number between 10 and 100: ");
                userNum = input.nextInt(0);
            }
            
            // Checks to see if number is a duplicate
            for (int i = 0; i < num.length; i++)
            {
                if (userNum == num[i])
                {
                    System.out.print("Number has already been entered. \n");
                    digit = true;
                }
                
            }
            
            if (!digit)
            {
                num[uniqueNum] = userNum;
                uniqueNum++;
            }
            
            // Displays the array
            for (int i = 0; i < uniqueNum; i++)
            {
                System.out.printf("%d ", num[i]);
            }        
            System.out.println();

        }
    } // end method main
} // end class DuplicateElimination

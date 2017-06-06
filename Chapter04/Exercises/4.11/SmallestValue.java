// Find the smallest value of a list entered by the user
// @Author: Adam Janecka
package pkg4_11;
import java.util.Scanner;

public class SmallestValue {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        int count; // number of integers entered by user
        int number; // The numbers input by user
        int smallest = 0; // The smallest value
        
        System.out.print("Enter how many values you are going to input: ");
        count = input.nextInt();
        
        for (int i = 1; i <= count; i++)
        {
            System.out.print("Enter number: ");
            number = input.nextInt();
            
            if (i == 1)            // sets the first number as default smallest number
                smallest = number;
             
            if (number < smallest)
                smallest = number;
        } // end for loop
        
        System.out.printf("The smallest number is %d%n", smallest);
        
    } // end method main
} // end class SmallestValue

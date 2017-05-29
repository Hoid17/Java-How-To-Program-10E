// Determine whether a five digit number is a palindrome
// @Author: Adam Janecka
package pkg3_30;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int number; // Number input by user
        int digit1; // 1's Digit
        int digit2; // 10's Digit
        int digit3; // 100's Digit
        int digit4; // 1000's Digit
        int digit5; // 10000's Digit
        
        System.out.print("Enter a five digit number: ");
        number = input.nextInt();
        
        while (number < 10000 || number > 99999)
        {
            System.out.print("Incorrect value.  Enter a five digit number: ");
            number = input.nextInt();
        }
        
        digit1 = number % 10; // Put each digit as a variable
        digit2 = (number % 100 - digit1) / 10; 
        digit3 = (number % 1000 - digit2 - digit1) / 100;
        digit4 = (number % 10000 - digit3 - digit2 - digit1) / 1000;
        digit5 = (number % 100000 - digit4 - digit3 - digit2 - digit1) / 10000;
        
        if (digit1 != digit5)
            System.out.println("The number is not a palindrome.");
        else if (digit2 != digit4)
            System.out.println("The number is not a palindrome.");
        else 
            System.out.println("The number is a palindrome.");
    } // end method main
} // end class Palindrome

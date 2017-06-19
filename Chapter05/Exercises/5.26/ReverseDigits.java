// Reverses the digits in a number
// @Author: Adam Janecka
package pkg5_26;
import java.util.Scanner;

public class ReverseDigits {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num; // Number input by user
        
        System.out.print("Enter number: ");
        num = input.nextInt();
        
        System.out.print("Number reversed is ");
        reverseDigits(num);
        System.out.println();
    } // end method main
    
    // Reverses the digits in the number
    public static void reverseDigits(int number)
    {
        while (number > 0)
        {
            System.out.printf("%d", number % 10);
            number = number / 10;
        }
    } // end method reverseDigits
} // end class ReverseDigits

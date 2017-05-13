// Separate the digits of a number and output them back to the user
// @Author: Adam Janecka
package pkg2_30;
import java.util.Scanner;

public class SeparateDigit {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int number; // Five digit number
        int digit1; // 10000's Place digit
        int digit2; // 1000's Place digit
        int digit3; // 100's Place digit
        int digit4; // 10's Place digit
        int digit5; // 1's Place digit
        
        System.out.print("Enter a five digit number: "); //prompt
        number = input.nextInt(); // Get Integer
        
        digit1 = number / 10000; // Obtain digits 
        number = number % 10000;
        digit2 = number / 1000;
        number = number % 1000;
        digit3 = number / 100;
        number = number % 100;
        digit4 = number / 10;
        digit5 = number % 10;
        
        System.out.printf("The digits are %d %d %d %d %d%n", digit1, digit2, 
                digit3, digit4, digit5);
    } // end method main
} // end class SeparateDigit

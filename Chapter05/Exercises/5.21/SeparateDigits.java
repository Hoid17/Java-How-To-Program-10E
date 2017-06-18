// Use methods to separate digits in a number
// @Author: Adam Janecka
package pkg5_21;
import java.util.Scanner;

public class SeparateDigits {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int number; // Number between 1 and 99999
        
        System.out.print("Enter number between 1 and 99999: ");
        number = input.nextInt();
        
        while (number <= 0 || number >= 100000)
        {
            System.out.print("Incorrect value.  Enter number between 1 and 99999");
        }
        
        displayDigits(number);
    }
    
    // Acquires the integer part of the quotient
    public static int getInteger(int a, int b)
    {
        int integer = a / b;
        return integer;
    } // end method integerPart
    
    // Acquires the remainder part of the quotient
    public static int getRemainder(int a, int b)
    {
        int remainder = a % b;
        return remainder;
    }
    
    // Prints out the number as individual digits
    public static void displayDigits(int number)
    {
        int digit1 = getRemainder(number, 10); // 1's Place
        int digit2 = getInteger(getRemainder(number,100), 10); // 10's Place
        int digit3 = getInteger(getRemainder(number,1000), 100); // 100's Place
        int digit4 = getInteger(getRemainder(number,10000), 1000); // 1,000's Place
        int digit5 = getInteger(number, 10000); // 10,000's Place
        
        System.out.printf("The digits are %d  %d  %d  %d  %d%n", digit5, digit4,
                digit3, digit2, digit1);
    } // end method displayDigits
} // end class SeparateDigits

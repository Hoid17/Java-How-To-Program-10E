// A program to encrypt and decrypt a four digit number
// @Author: Adam Janecka
package pkg3_38;
import java.util.Scanner;

public class Encryption {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int number; // Number input by user
        int digit1; // 1's Place
        int digit2; // 10's Place
        int digit3; // 100's Place
        int digit4; // 1000's Place
        int placeholder; // Used in calculations
        
        // Encrypting a number
        
        System.out.print("Enter a four digit integer to be encrypted: ");
        number = input.nextInt();
        
        digit1 = number % 10; // Calculat the digits
        digit2 = (number % 100 - digit1) / 10;
        digit3 = (number % 1000 - digit2 - digit1) / 100;
        digit4 = (number % 10000 - digit3 - digit2 - digit1) / 1000;
        
        digit1 = (digit1 + 7) % 10; // Encrypt the digits
        digit2 = (digit2 + 7) % 10;
        digit3 = (digit3 + 7) % 10;
        digit4 = (digit4 + 7) % 10;
        
        placeholder = digit1;  // Swap the digits
        digit1 = digit3;
        digit3 = placeholder;
        placeholder = digit2;
        digit2 = digit4;
        digit4 = placeholder;
        
        System.out.printf("The encrypted number is %d%d%d%d%n", digit4, digit3, digit2, digit1);
        
        // Decrypting a number
        
        int digit5; // 1's Place
        int digit6; // 10's Place
        int digit7; // 100's Place
        int digit8; // 1000's Place
        
        System.out.print("Enter a four digit number to be decrypted: ");
        number = input.nextInt();
        
        digit5 = number % 10;
        digit6 = (number % 100 - digit5) / 10;
        digit7 = (number % 1000 - digit6 - digit5) / 100;
        digit8 = (number % 10000 - digit7 - digit6 - digit5) / 1000;
        
        placeholder = digit5; //Swap the digits
        digit5 = digit7;
        digit7 = placeholder;
        placeholder = digit6;
        digit6 = digit8;
        digit8 = placeholder;
        
        digit5 = (digit5 + 3) %10; // Decrypt the digits
        digit6 = (digit6 + 3) %10;
        digit7 = (digit7 + 3) %10;
        digit8 = (digit8 + 3) %10;
        
        System.out.printf("The decrdypted integer is %d%d%d%d%n", digit8, digit7, digit6, digit5);      
    } // end method main
} // end class Encryption

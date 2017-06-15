// Create a program that rounds double values to the nearest integer
// @Author: Adam Janecka
package pkg5_09;
import java.util.Scanner;

public class Rounding {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        double number = 0; // Number input by user
        double round; // Rounded answer 
        
        System.out.print("Enter decimal number or -1 to quit: "); 
        number = input.nextDouble();
        
         // allows multiple uses
        while (number != -1){

        round = Math.floor(number + 0.5);
        System.out.printf("Original Number: %.2f%n" //Prints out answer
                + "Rounded Number: %.0f%n", number, round);
        
        System.out.print("Enter decimal number or -1 to quit: ");
        number = input.nextDouble();
        
        } 
    } // end method main
} // end class Rounding

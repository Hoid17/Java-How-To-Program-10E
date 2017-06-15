// Show a number rounded to the tenths, hundreths, and thousandths place
// @Author: Adam Janecka
package pkg5_10;
import java.util.Scanner;

public class Rounding2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double number = 0; // Number input by user
        double round; // Rounded number
        
        System.out.print("Enter decimal number or -1 to quit: ");
        number = input.nextDouble();
        
        while (number != -1)
        {
            System.out.printf("Original Number: %f%n", number);
            round = roundToInteger(number);
            System.out.printf("Rounded Integer: %.0f%n", round);
            round = roundToTenths(number);
            System.out.printf("Rounded to Tenths: %.1f%n", round);
            round = roundToHundredths(number);
            System.out.printf("Rounded to Hundredths: %.2f%n", round);
            round = roundToThousandths(number);
            System.out.printf("Rounded to Thousandths: %.3f%n", round);       
            
            System.out.print("Enter decimal number of -1 to quit: ");
            number = input.nextDouble();
        }
    } // end method main
    
    // Rounds number to the neareset integer
    public static double roundToInteger(double number)
    {
        double round = Math.floor(number + 0.5);
        
        return round;
    } // end method roundToInteger
    
    // Rounds number to the nearest tenths
    public static double roundToTenths(double number)
    {
        double round = Math.floor(number * 10 + 0.5) / 10;
        
        return round;
    } // end method roundToTenths
    
    // Rounds number to the nearest hundredths
    public static double roundToHundredths(double number)
    {
        double round = Math.floor(number * 100 + 0.5) / 100;
        
        return round;
    } // end method roundToHundredths
    
    // Rounds number to the nearest thousandths 
    public static double roundToThousandths(double number)
    {
        double round = Math.floor(number * 1000 + 0.5) / 1000;
        
        return round;
    } // end method roundToThousandths
} // end class Rounding2

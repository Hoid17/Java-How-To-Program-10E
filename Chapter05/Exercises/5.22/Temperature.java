// Converts temperature from Celsius to Fahrenheit and vice versa
// @Author: Adam Janecka
package pkg5_22;
import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double temp; // The temperature input by user
        
        // Converts from Fahrenheit to Celsius
        System.out.print("Enter temperature in Fahrenheit: ");
        temp = input.nextDouble();
        System.out.printf("The temperature in Celcius is %.2f%n", celsius(temp));
        
        // Converts from Celsius to Fahrenheit
        System.out.print("Enter temperature in Celcius: ");
        temp = input.nextDouble();
        System.out.printf("The temperature in Fahrenheit is %.2f%n", fahrenheit(temp));
    } // end method main
    
    // Converts from Fahrenheit to Celsius
    public static double celsius (double fahrenheit)
    {
        double celsius = 5.0 / 9.0 * (fahrenheit - 32);
        return celsius;
    } // end method celsius
    
    // Converts from Celsius to Fahrenheit
    public static double fahrenheit(double celsius)
    {
        double fahrenheit = 9.0 / 5.0 * celsius + 32;
        return fahrenheit;
    } // end method fahrenheit
} // end class Temperature

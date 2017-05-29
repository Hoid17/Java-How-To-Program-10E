// Find the value of mathematical constant e to a certain number of terms 
// @Author: Adam Janecka
package pkg3_37b;
import java.util.Scanner;

public class Factoriale {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int number; // Number input by user
        int i = 1; // Used for while loop
        float e = 1; // Value of e
        
        System.out.print("Enter number of terms to calculate the value of e: ");
        number = input.nextInt();
        
        while (i <= number)
        {
            int result = 1; // Used for factorial
            int j = 1;
            while (j <= i)
            {
                result = result * j; //Calculates the factorial
                j++;
            }
            
            e += 1 / (float)result;
            i++;
        } // end while loop
        
        System.out.printf("The value of e is %f%n", e);
        
    } // end method main
} // end class Factoriale

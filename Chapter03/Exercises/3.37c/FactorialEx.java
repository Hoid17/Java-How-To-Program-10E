// Calculate e^x to a set number of terms
// @Author: Adam Janecka
package pkg3_37c;
import java.util.Scanner;

public class FactorialEx {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int number; // Number of terms input by user
        int i = 1; // Used in while loop
        int x; // Value of x in e^x
        float e = 1; // Default value of e
        
        System.out.print("Enter number of terms to calculate e^x: ");
        number = input.nextInt();
        System.out.print("Enter value for x: ");
        x = input.nextInt();
        
        while (i <= number)
        {
            int result = 1; // Used for factorial
            int j = 1;
            while (j <= i)
            {
                result = result * j; //Calculates the factorial
                j++;
            }
            
            e += Math.pow(x, i) / (float)result;
            i++;
        } // end while loop
        
        System.out.printf("The value of e is %f%n", e);
        
    } // end method main
} // end

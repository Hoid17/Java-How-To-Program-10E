// See if one number is a multiple of another
// @Author: Adam Janecka
package pkg5_16;
import java.util.Scanner;

// See if one number is a multiple of another
// @Author: Adam Janecka
package pkg5_16;
import java.util.Scanner;

public class Multiples {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num1; // First number
        int num2; // Second number
        
        System.out.print("Enter a pair of numbers or -1 to quit: ");
        while(!input.hasNext ("-1")) // While the number is not -1
        {
        num1 = input.nextInt();
        num2 = input.nextInt();
        
        if (isMultiple(num1, num2))
            System.out.printf("%d is a multiple of %d.%n", num2, num1);
        else
            System.out.printf("%d is not a multiple of %d.%n", num2, num1);
        }
    } // end method main
    
    // Sees if a number is a multiple of another
    public static boolean isMultiple(int num1, int num2)
    {
        if (num2 % num1 == 0)
            return true;
        else
            return false;
    } // end method isMultiple
} // end class Multiples

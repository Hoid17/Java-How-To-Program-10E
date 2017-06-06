// Print the factorials of all integers from 1 to 20
// @Author: Adam Janecka
package pkg4_13;

public class Factorial {

    public static void main(String[] args) {
        
        long number = 1; // Integer used to calculate factorial
        
        System.out.printf("Number\tFactorial%n");
        
        for (int i = 1; i <= 20; i++)
        {
            number = i;
            long factorial = 1; // Resets value of factorial after each iteration
            for (int j = 1; j <= number; j++)
            {
                factorial = factorial * j;
            }
            
            System.out.printf("%d\t%d%n", number, factorial);
        } // end for loop    
    } // end method main
} // end class Factorial

// Prints out all the perfect numbers from 1 to 1000 and their factors
// @Author: Adam Janecka
package pkg5_24;

public class PerfectNumbers {

    public static void main(String[] args) {
        
        System.out.printf("Perfect numbers are: %n");
        
        for (int num = 1; num <= 1000; num++)
        {
            if (isPerfect(num))
            {
                System.out.printf("%d: ", num);
                printFactors(num);
                System.out.println();
            }
        }
    } // end method main
    
    // Sees if the number is a perfect number
    public static boolean isPerfect(int number)
    {
        int sum = 0; // The sum off all the factors
        
        for (int i = 1; i < number; i++)
        {
            if (number % i == 0)
                sum += i;
        }
        
        if (sum == number)
            return true;
        else
            return false;
    } // end method isPerfect
    
    // Prints out the factors of the perfect numbers
    public static void printFactors(int num)
    {
        for (int i = 1; i < num; i++)
        {
            if (num % i == 0)
                System.out.printf("%d ", i);
        }
    } // end method printFactors
} // end class PerfectNumbers

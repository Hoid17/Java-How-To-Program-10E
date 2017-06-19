// Find all the prime numbers from 1 to 10,000
// @Author: Adam Janecka
package pkg5_25;

public class Prime {

    public static void main(String[] args) {
        
        for (int num = 1; num <= 10000; num++)
        {
            if (sqrtPrime(num))
                System.out.printf("%d is prime.%n", num);
        }
    } // end method main
    
    // Finds out if the number is prime
    public static boolean isPrime(int num)
    {
        for (int i = 2; i <= num / 2; i++)
        {
            if (num % i == 0)
                return false;
        }
        
        return true;
    } // end method isPrime
    
    // Finds out if the number is prime using square root
    public static boolean sqrtPrime(int num)
    {
        for (int i = 2; i <= Math.sqrt(num); i++)
        {
            if (num % i == 0)
                return false;
        }
        
        return true;
    }
} // end class Prime


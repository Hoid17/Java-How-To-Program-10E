// Show all the prime numbers between 2 and 999 using an array
// @Author: Adam Janecka
package pkg6_27;

public class SieveofEratosthenes {

    public static void main(String[] args) {
        
        boolean[] prime = new boolean[1000];
        
        // Set all values of array to true
        for (int i = 0; i < prime.length; i++)
            prime[i] = true;
        
        for (int i = 2; i < prime.length; i++)
        {
            // If the element is true
            if(prime[i])
            {
                //Iterate through the array and set all multiples to false
                for (int j = i;j * i < prime.length; j++)
                        prime[i * j] = false;
            }
        }
        
        // Display all prime numbers
        for (int i = 2; i < prime.length; i++)
        {
            if (prime[i])
                System.out.printf("%d%n", i);

        }
    } // end method main
} // end class SieveofEratosthenes

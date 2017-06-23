// Fig. 6.7: RollDie.java
// Die-rolling program using arrays instead of switch.
package pkg6_07;
import java.security.SecureRandom;

public class RollDie {

    public static void main(String[] args) {
        
        SecureRandom randomNumbers = new SecureRandom();
        int[] frequency = new int[7]; // array of frequency counters
        
        // roll die 6,000,000 times; use die value as frequency index
        for (int roll = 1; roll <= 6000000; roll++)
            ++frequency[1 + randomNumbers.nextInt(6)];
        
        System.out.printf("%s%10s%n", "Face", "Frequency");
        
        // output each array element's value
        for (int face = 1; face < frequency.length; face++)
            System.out.printf("%4d%10d%n", face, frequency[face]);
    } // end method main
} // end class RollDie

// Assign statements that will display random numbers 
// @Author: Adam Janecka
package pkg5_13;
import java.security.SecureRandom;

public class RandomInteger2 {

    public static void main(String[] args) {
        
        SecureRandom random = new SecureRandom();
        
        // Part a)
        int a = 2 * (1 + random.nextInt(5));
        System.out.printf("Part a) %d%n", a);
        
        // Part b)
        int b = 1 + 2 * (1 + random.nextInt(5));
        System.out.printf("Part b) %d%n", b);
        
        // Part c)
        int c = 2 + 4 * (1 + random.nextInt(5));
        System.out.printf("Part c) %d%n", c);
    } // end method main
} // end class RandomInteger2

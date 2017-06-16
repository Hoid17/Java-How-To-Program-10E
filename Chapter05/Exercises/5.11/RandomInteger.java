// Assign random integer between a certain range
// @Author: Adam Janecka
package pkg5_12;
import java.security.SecureRandom;

public class RandomInteger {

    public static void main(String[] args) {
        
        SecureRandom random = new SecureRandom();
        
        // Part a
        int a = 1 + random.nextInt(2);
        System.out.printf("Part a) %d%n", a);
        
        // Part b
        int b = 1 + random.nextInt(100);
        System.out.printf("Part b) %d%n", b);
        
        // Part c
        int c = random.nextInt(10);
        System.out.printf("Part c) %d%n", c);
        
        // Part d
        int d = 1000 + random.nextInt(113);
        System.out.printf("Part d) %d%n", d);
        
        // Part e
        int e = random.nextInt(3) - 1;
        System.out.printf("Part e) %d%n", e);
        
        // Part f
        int f = random.nextInt(15) - 3;
        System.out.printf("Part f) %d%n", f);
    } // end method main
} // end class RandomInteger

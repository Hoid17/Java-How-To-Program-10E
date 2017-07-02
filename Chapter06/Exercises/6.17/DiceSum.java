// Calculate the sum of two dice rolls 36,000,000 times
// @Author: Adam Janecka
package pkg6_17;
import java.security.SecureRandom;

public class DiceSum {

    public static void main(String[] args) {
        
        SecureRandom random = new SecureRandom();
        int[] sumCount = new int[13]; // Stores the number of times each sum appears
        int sum; // Sum of two dice
        
        // Rolls dice 36,000,000 times
        for (int i = 0; i < 36000000; i++)
        {
            // Get two dice values
            int dice1 = 1 + random.nextInt(6);
            int dice2 = 1 + random.nextInt(6);
            sum = dice1 + dice2;
            sumCount[sum]++; // Add one to sum count
        }
        
        // Displays results
        System.out.printf("%s%8s%n", "Sum", "Count");
        for (int i = 2; i < sumCount.length; i++)
        {
            System.out.printf("%3d%8d%n", i, sumCount[i]);
        }
    } // end method main
} // end class DiceSum

// Find if an integer is odd or even
// @Author: Adam Janecka
package pkg2_25;
import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int x; // Integer inputted by user
        
        System.out.print("Enter integer: "); // Prompt
        x = input.nextInt(); // Get integer
        
        if (x % 2 == 0) // If the integer is even
            System.out.println("The integer is even.");
        
        if (x % 2 == 1) // If the integer is odd
            System.out.println("The integer is odd.");
    } // end method main
} // end class OddEven

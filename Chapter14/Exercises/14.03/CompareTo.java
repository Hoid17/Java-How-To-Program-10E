// Inputs two Strings and outputs whether the first is less then, equal to 
// or greater than the second
// @Author: Adam Janecka
package pkg14_03;
import java.util.Scanner;

public class CompareTo {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String word1; // First string
        String word2; // Second string
        
        // Obtain Strings
        System.out.print("Enter first string: ");
        word1 = input.nextLine();
        System.out.print("Enter second string: ");
        word2 = input.nextLine();
        
        // Determine relationship between strings
        if (word1.compareTo(word2) == 0)
            System.out.println("The strings are equal.");
        else if (word1.compareTo(word2) < 0)
            System.out.println("The first string is less than the second string.");
        else 
            System.out.println("The first string is greater than the second string.");
    } // end method main
} // end class CompareTo

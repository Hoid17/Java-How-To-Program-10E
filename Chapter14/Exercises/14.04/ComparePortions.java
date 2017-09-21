// Sees if portions of two strings are equal
// @Author: Adam Janecka
package pkg14_04;
import java.util.Scanner;

public class ComparePortions {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String s1; // First string
        String s2; // Second string
        
        // Inputs strings
        System.out.print("Enter first string: ");
        s1 = input.nextLine(); 
        System.out.print("Enter second string: ");
        s2 = input.nextLine();
        
        // Select portion of strings to compare
        System.out.print("Enter number of characters to compare: ");
        int num = input.nextInt();
        System.out.print("Enter starting index of first string: ");
        int index1 = input.nextInt();
        System.out.print("Enter starting index of second string: ");
        int index2 = input.nextInt();
        
        if (s1.regionMatches(true, index1, s2, index2, num))
            System.out.println("The portion of the two strings are equal.");
    } // end method main
} // end class ComparePortions

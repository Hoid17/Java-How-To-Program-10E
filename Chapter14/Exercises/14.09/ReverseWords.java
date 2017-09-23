// Prints the words out in reverse order
// @Author: Adam Janecka
package pkg14_09;
import java.util.Scanner;

public class ReverseWords {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String sentence;
        String[] tokens;
        
        // Obtain sentence
        System.out.print("Enter sentence: ");
        sentence = input.nextLine();
        tokens = sentence.split(" ");
        
        // Print out sentence backwards
        for (int i = tokens.length - 1; i >= 0; i--)
        {
            System.out.print(tokens[i] + " ");
        }
        System.out.println();
    } // end method main
} // end class ReverseWords

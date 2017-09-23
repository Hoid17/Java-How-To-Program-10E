// Prints out a string in all uppercase and all lowercase
// @Author: Adam Janecka
package pkg14_10;
import java.util.Scanner;

public class BothCases {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String sentence;
        
        // Obtain sentence
        System.out.print("Enter sentence: ");
        sentence = input.nextLine();
        
        System.out.printf("Sentence as uppercase: %s%nSentence as lowercase: %s%n",
                sentence.toUpperCase(), sentence.toLowerCase());
    } // end method main
} // end class BothCases

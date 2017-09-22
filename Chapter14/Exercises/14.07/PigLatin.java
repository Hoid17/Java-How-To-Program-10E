// Translate sentences into Pig Latin
// @Author: Adam Janecka
package pkg14_07;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PigLatin {

    public static void main(String[] args) {
        
        String sentence;
        int count ; // iterates through sentence
        Scanner input = new Scanner(System.in);
        
        // Enter sentence
        System.out.println("Enter sentence: ");
        sentence = input.nextLine();
        
        // Split into tokens
        StringTokenizer tokens = new StringTokenizer(sentence);
        count = tokens.countTokens();
        while(tokens.hasMoreTokens())
        {
            count--;
            printLatinWord(tokens.nextToken());
        }
        System.out.println();
    } // end method main
    
    // translates English word into Pig Latin
    public static void printLatinWord(String token)
    {
        char letters[] = token.toCharArray();
        String translation = new String();
        
        for (int i = 1; i < letters.length; i++)
        {
            translation += letters[i];
        }
        
        translation += letters[0] + "ay ";
        System.out.print(translation);
    } // end method printLatinWord
} // end class PigLatin

// Shows the number of occurences of a character
// @Author: Adam Janecka
package pkg14_11;
import java.util.Scanner;

public class StringSearch {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        String sentence;
        int index = 0;
        int count = 0; // Number of occurences of character
        String c; // Character to search for
        
        // Obtain sentence
        System.out.print("Enter sentence: ");
        sentence = input.nextLine();
        System.out.print("Enter search character: ");
        c = input.nextLine();
        
        while(index <= sentence.length())
        {
            index = sentence.indexOf(c, index);
            
            if (index >= 0)
            {
                index++;
                count++;
            }
            else
                break;
        }
        
        System.out.printf("Number of occurences of %s: %d%n", c, count);
    } // end method main
} // end classStringSearch

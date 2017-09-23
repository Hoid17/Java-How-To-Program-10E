// Shows the occurences of all letters in a sentence
// @Author: Adam Janecka
package pkg14_12;
import java.util.Scanner;

public class StringSearch2 {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int[] count = new int[26];
        String line; 
        int index = 0;
        
        // Obtain sentence
        System.out.print("Enter sentence: ");
        line = input.nextLine();
        
        for (int i = 0; i <= 25; i++)
        {
            while (index <= line.length())
            {
                index = line.indexOf(alphabet.charAt(i), index);
                
                 if (index >= 0)
                {
                    index++;
                    count[i]++;
                }
            else
                break;
            }
        }
        
        System.out.print("Letter occurences: \n");
        for(int j = 0; j <= 25; j++)
        {
            System.out.printf("%c: %d%n", alphabet.charAt(j), count[j]);
        }
    } // end method main
} // end class StringSearch2

// Create bar graph of numbers printed by user
// @Author: Adam Janecka

package pkg4_16;
import java.util.Scanner;

public class BarGraph {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Enter five integers between 1 and 30 (space-separated),%n"
                + "Input a letter to end the program.%n");

        while(input.hasNextInt()) { // Keeps iterating until a letter is output

            int number = input.nextInt();

            for(; number > 0; number--) {
                System.out.print("*");
            }

            System.out.println();
         }
    } // end method main
} // end class BarGraph

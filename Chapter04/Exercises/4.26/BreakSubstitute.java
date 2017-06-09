// Show a replacement for the break statement
// @Author: Adam Janecka
package pkg4_26;

public class BreakSubstitute {

    public static void main(String[] args) {
       
        int x = 0; // variable used to exit break
        int i = 1;
        
        for (i = 1; (i <= 10) && (x < 1); i++)
        {
            if (i == 5)
                x++;  // equivalent of break statement
            System.out.printf("%d ", i);
        }
        System.out.println();
    } // end method main
} // end class BreakSubstitute

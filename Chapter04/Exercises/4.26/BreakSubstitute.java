// Show a replacement for the break statement
// @Author: Adam Janecka
package pkg4_26;

public class BreakSubstitute {

    public static void main(String[] args) {
       
        int x = 0; // variable used to exit break
        int count = 1;
        
        for (count = 1; (count <= 10) && (x < 1); count++)
        {
            if (count == 5)
                ++x;  // equivalent of break statement
            System.out.printf("%d ", count);
        }
        System.out.println();
    } // end method main
} // end class BreakSubstitute

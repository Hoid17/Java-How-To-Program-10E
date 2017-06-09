// Provide substite for continue statement
// @Author: Adam Janecka

package pkg4_28;

public class ContinueSubstitute {

    public static void main(String[] args) {
        
        for (int count = 1; count <= 10; count++) // loop 10 times
        {
            if (count != 5)
                System.out.printf("%d ", count); // Continue substitute    
        }
        
        System.out.printf("%nUsed continue substitute to skip printing 5%n");
    } // end method main
} // end class ContinueSubstitute

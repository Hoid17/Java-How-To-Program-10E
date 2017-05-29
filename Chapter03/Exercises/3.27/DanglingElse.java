// Determine the output of code when x is 9 and y is 11
package pkg3_27;

public class DanglingElse {

    public static void main(String[] args) {
        
        int x = 9;
        int y = 11;
        
        // Exercise 3.27a
        System.out.println("Exercise 3.27a");
        
        if (x < 10)
            if (y > 10)
                System.out.println("*****");
        else
                System.out.println("#####");
        System.out.println("$$$$$");
        System.out.println();
        
        // Exercise 3.27b
        System.out.println("Exercise 3.27b");
        
        if (x < 10)
        {
            if (y > 10)
                System.out.println("*****");
        }
        else
        {
            System.out.println("#####");
            System.out.println("$$$$$");
        } 
    } // end method main
} // end class DanglingElse

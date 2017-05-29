// Fix code in Exercise 3.34
package pkg3_34;

public class IncrementError {

    public static void main(String[] args) {
        
        int x = 5;
        int y = 6;
        
        System.out.printf("x + y is %d%n", x + y);
        System.out.printf("x + y + 1 is %d%n", ++x + y);
    } // end method main
} // end class IncrementError

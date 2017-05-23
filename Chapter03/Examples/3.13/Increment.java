// Fig. 3.13: Increment.java
// Prefix increment and postfix increment operators
package pkg3_13;

public class Increment {

    public static void main(String[] args) {
        
        // demonstrate postfix increment operator
        int c = 5;
        System.out.printf("c before postincrement: %d%n", c); // prints 5
        System.out.printf("    postincrementing c: %d%n", c++); // prints 5
        System.out.printf(" c after postincrement: %d%n", c);
        
        System.out.println();  // skip a line
        
        // demonstrate prefix increment operator
        c = 5;
        System.out.printf(" c before preincrement: %d%n", c); // prints 5
        System.out.printf("     preincrementing c: %d%n", ++c); // prints 6
        System.out.printf("  c after preincrement: %d%n", c); // prints 6
    } // end method main
} // end class Increment

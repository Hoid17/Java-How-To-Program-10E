// Fig. 5.10: MethodOverload.java
// Overloaded method declarations.
package pkg5_10;

public class MethodOverload {
    
    // test overloaded square methods
    public static void main(String[] args) {
        
        System.out.printf("Square of integer 7 is %d%n", square (7));
        System.out.printf("Square of double 7.5 is %f%n", square(7.5));
    } // end method main
    
    // square method with int argument
    public static int square(int intValue)
    {
        System.out.printf("%nCalled square with int argument: %d%n",
                intValue);
        return intValue * intValue;
    } // end method intValue
    
    // square method with a double argument
    public static double square (double doubleValue)
    {
        System.out.printf("%nCalled square with double argument: %f%n", 
                doubleValue);
        return doubleValue * doubleValue;
    } // end method square
} // end class MethodOverload

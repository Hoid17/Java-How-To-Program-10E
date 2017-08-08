// Modify Fig 8.14 to import each item individually 
// @Author: Adam Janecka
package pkg8_09;
import static java.lang.Math.E;
import static java.lang.Math.PI;
import static java.lang.Math.sqrt;
import static java.lang.Math.ceil;

public class StaticImportTest {

    public static void main(String[] args) {
        
        System.out.printf("sqrt(900.0) = %.1f%n", sqrt(900.0));
        System.out.printf("ceil(-9.8) = %.1f%n", ceil(-9.8));
        System.out.printf("E = %f%n", E);
        System.out.printf("PI = %f%n", PI);
    } // end method main
} // end class StaticImportTest


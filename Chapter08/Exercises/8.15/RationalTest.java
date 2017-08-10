// Test class for Rational application
// @Author: Adam Janecka
package pkg8_15;


public class RationalTest {
    
    public static void main(String[] args)
    {
        Rational num1 = new Rational(2,4);
        Rational num2 = new Rational(3,4);
        Rational num3 = new Rational();
        
        System.out.printf("num1: %s%n", num1);
        System.out.printf("num2: %s%n", num2);
        System.out.printf("Sum of numbers is %s%n", Rational.add(num1,num2));
        System.out.printf("Num2 - Num1 equals %s%n", Rational.subtract(num2, num1));
        System.out.printf("Product of numbers is %s%n", Rational.multiply(num1, num2));
        System.out.printf("Quotient of numbers is %s%n", Rational.divide(num1, num2));
        System.out.printf("Num1 as decimal: %.2f%n", Rational.toDecimal(num1));
    } // end method main
    
} // end class RationalTest

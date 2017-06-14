// Test the Math class methods
package pkg5_03;

public class MathTest {

    public static void main(String[] args) {
        
        System.out.printf("Math.abs(23.7) = %f%n", Math.abs(23.7));
        System.out.printf("Math.abs(0.0) = %f%n", Math.abs(0.0));
        System.out.printf("Math.abs(-23.7) = %f%n", Math.abs(-23.7));
        System.out.printf("Math.ceil(9.2) = %f%n", Math.ceil(9.2));
        System.out.printf("Math.ceil(-9.8) = %f%n", Math.ceil(-9.8));
        System.out.printf("Math.cos(0.0) = %f%n", Math.cos(0.0));
        System.out.printf("Math.exp(1.0) = %f%n", Math.exp(1.0));
        System.out.printf("Math.floor(9.2) = %f%n", Math.floor(9.2));
        System.out.printf("Math.floor(-9.8) = %f%n", Math.floor(-9.8));
        System.out.printf("Math.log(Math.E) = %f%n", Math.log(Math.E));
        System.out.printf("Math.log(Math.E * Math.E) = %f%n", 
                Math.log(Math.E * Math.E));
        System.out.printf("Math.max(2.3, 12.7) = %f%n", Math.max(2.3, 12.7));
        System.out.printf("Math.max(-2.3 -12.7) = %f%n", 
                Math.max(-2.3, -12.7));
        System.out.printf("Math.min(2.3, 12.7) = %f%n", Math.min(2.3, 12.7));
        System.out.printf("Math.min(-2.3, -12.7) = %f%n", Math.min(-2.3, -12.7));
        System.out.printf("Math.pow(2.0, 7.0) = %f%n", Math.pow(2.0, 7.0));
        System.out.printf("Math.pow(9.0, 0.5) = %f%n", Math.pow (9.0, 0.5));
        System.out.printf("Math.sin(0.0) = %f%n", Math.sin(0.0));
        System.out.printf("Math.sqrt(900.0) = %f%n", Math.sqrt(900.0));
        System.out.printf("Math.tan(0.0) = %f%n", Math.tan(0.0));
    } // end method main
} // end class MathTest

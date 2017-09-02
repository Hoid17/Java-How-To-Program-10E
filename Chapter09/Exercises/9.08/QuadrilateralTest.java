// Test class
// @Author: Adam Janecka
package pkg9_08;

public class QuadrilateralTest {
    
    public static void main(String[] args)
    {
        // Create new quadrilaterals
        Trapezoid trapezoid = new Trapezoid(0, 0, 0, 3, 5, 0, 3, 3);
        Parallelogram parallelogram = new Parallelogram(0, 0, 0, 4, 2, 2, 0,2);
        Rectangle rectangle = new Rectangle(0, 0, 0, 4, 6, 4, 6, 0);
        Square square = new Square(0, 0, 4, 0, 4, 4, 0, 4);
        
        System.out.printf("%nTrapezoid: %n%s", trapezoid);
        System.out.printf("%n%nParallelogram: %n%s", parallelogram);
        System.out.printf("%n%nRectangle: %n%s", rectangle);
        System.out.printf("%n%nSquare: %n%s%n", square);
        
    } // end method main
} // end class QuadrilateralTest

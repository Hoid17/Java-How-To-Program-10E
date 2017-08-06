// Test application for class Rectangle
package pkg8_04;

public class RectangleTest {
    
    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle(4.25, 5);
        
        System.out.printf("Length: %.2f%nWidth: %.2f", rectangle.getLength(),
                rectangle.getWidth());
        System.out.printf("%nPerimeter: %.2f%nArea: %.2f%n", rectangle.Perimeter(),
                rectangle.Area());
    } // end method main
} // end class RectangleTest

// Test application for Shape hierarchy 
// @Author: Adam Janecka
package pkg10_13;

public class ShapeTest {

    public static void main(String[] args) {
        
        // create subclass objects
        Square square = new Square(4);
        Circle circle = new Circle(4);
        Triangle triangle = new Triangle(3, 6);
        Cube cube = new Cube(4);
        Sphere sphere = new Sphere(4);
        Tetrahedron tetrahedron = new Tetrahedron(4);
        
        // create Shape array
        Shape[] shapes = new Shape[6];
   
        // initialize array
        shapes[0] = square;
        shapes[1] = circle;
        shapes[2] = triangle;
        shapes[3] = cube;
        shapes[4] = sphere;
        shapes[5] = tetrahedron;
        
        for(Shape currentShape: shapes)
        {
            System.out.println(currentShape);
            
            // see if shape is a two-dimensional or three-dimensional shape
            if (currentShape instanceof ThreeDimensionalShape)
            {
                
                ThreeDimensionalShape threeDim = (ThreeDimensionalShape) currentShape;
                
                System.out.printf("%s: %.2f%n%s: %.2f%n%n", "Surface Area", threeDim.getArea(),
                        "Volume", threeDim.getVolume());
            }
            
            // calculates for two-dimensional shapes
            else
                System.out.printf("%s: %.2f%n%n", "Area", currentShape.getArea());
        } // end for loop
    } // end method main
} // end class ShapeTest

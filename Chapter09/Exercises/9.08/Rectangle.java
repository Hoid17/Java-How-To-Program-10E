//Rectangle extends class Parallelogram
// @Author: Adam Janecka
package pkg9_08;

public class Rectangle extends Parallelogram{
    
    public Rectangle(double x1, double y1, double x2, double y2,
            double x3, double y3, double x4, double y4)
    {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    } // end constructor
    
    @Override
    public String toString()
    {
        return String.format("%s", super.toString());
    } // end method toString
} // end class Rectangle

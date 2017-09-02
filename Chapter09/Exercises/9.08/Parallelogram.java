// Parallelogram is a subclass of Quadrilateral
// @Author: Adam Janecka
package pkg9_08;

public class Parallelogram extends Trapezoid{
    
    public Parallelogram(double x1, double y1, double x2, double y2,
            double x3, double y3, double x4, double y4)
    {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    } // end constructor
    
    // Calculates the width
    
    public double width()
    {
        if (getP().getY() == getQ().getY())
            return Math.abs(getP().getX() - getQ().getX());
        else
            return Math.abs(getQ().getX() - getR().getX());
    } // end method width
    
    // Area method for parallelogram
    @Override
    public double area()
    {
        return width() * height();
    } // end method area
    
    @Override
    public String toString()
    {
        return String.format("%s %n%s: %s%n%s: %s%n%s: %s", super.printCoordinates(), 
                "Height", height(), "Width", width(), "Area", area());
    } // end method toString
} // end class Parallelogram

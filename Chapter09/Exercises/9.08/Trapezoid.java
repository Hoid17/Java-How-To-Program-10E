// Class Trapezoid is a subclass of Quadrilateral
// @Author: Adam Janecka
package pkg9_08;

public class Trapezoid extends Quadrilateral{
    
    private double base1; // Top base
    private double base2; // Bottom base
    
    public Trapezoid (double x1, double y1, double x2, double y2,
            double x3, double y3, double x4, double y4)
    {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
        

        
    } // end constructor
    
    // Defines the height
    public double height()
    {
        // if two points are equal height
        if (getP().getY() == getQ().getY())
            return Math.abs(getQ().getY() - getR().getY());
        else
            return Math.abs(getP().getY() - getQ().getY());
    } // end method height
    
    private String width()
    {
      return String.format("Unknown for this quadrilateral");  
    }
    
    // Finds the sum of both bases
    public double sum()
    {
        // If two points are of same height, they're a base
        if (getP().getY() == getQ().getY())
            return Math.abs(getP().getX() - getQ().getX()) 
                    + Math.abs(getR().getX() - getS().getX());
        else
            return Math.abs(getQ().getX() - getR().getX())
                    + Math.abs(getS().getX() - getP().getX());
    } // end method sum
    
    // Calculates the area
    public double area()
    {
        return sum() * height() / 2.0;
    } // end method area
    
    public String printCoordinates()
    {
        return String.format("%s", super.toString());
    }
    @Override
    public String toString()
    {
        return String.format("%s %n%s: %s", super.toString(), 
                "Height", height(), "Area", area());
    } // end method toString
} // end class Trapezoid

// Class to show the coordinates of the quadrilateral
// @Author: Adam Janecka
package pkg9_08;

public class Point {
    
    private double x, y;
    
    public Point (double x, double y)
    {
        this.x = x;
        this.y = y;
    } // end constructor
    
    // Return x coordinate
    public double getX()
    {
        return x;
    } // end method getX
    
    // Return y coordinate
    public double getY()
    {
        return y;
    } // end method getY
    
    public String toString()
    {
        return String.format("(%.2f, %.2f)", getX(), getY());
    } // end method toString
} // end class Point

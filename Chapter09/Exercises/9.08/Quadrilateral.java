// Create a quadrilateral hierarchy 
// @Author: Adam Janecka
package pkg9_08;

public class Quadrilateral {

    Point p, q, r, s;
    
    public Quadrilateral(double x1, double y1, double x2, double y2,
            double x3, double y3, double x4, double y4)
    {
        p = new Point(x1, y1);
        q = new Point(x2, y2);
        r = new Point(x3, y3);
        s = new Point(x4, y4);
    } // end constructor
    
    // Get first point
    public Point getP()
    {
        return p;
    } // end method getPointW
    
    // Get second point
    public Point getQ()
    {
        return q;
    } // end method getPointX
    
    // Get third point
    public Point getR()
    {
        return r;
    } // end method getPointY
    
    // Get fourth point
    public Point getS()
    {
        return s;
    } // end method getPointZ
    
    // Prints out the coordinates
    public String toString()
    {
        return String.format("The coordinates in the quadrilateral "
                + "are %s, %s, %s, %s", p, q, r, s);
    } // end method toString
} // end class Quadrilateral

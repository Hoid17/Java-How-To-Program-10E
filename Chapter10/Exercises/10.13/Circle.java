// Calculates the area of a circle
// @Author: Adam Janecka
package pkg10_13;

public class Circle extends TwoDimensionalShape{
    
    private double radius; // radius of the circle
    
    // constructor
    public Circle(double radius)
    {
        if (radius < 0)
            throw new IllegalArgumentException
                    ("Radius must be < 0");
        
        this.radius = radius;
    } // end constructor
    
    // Sets the radius 
    public void setRadius(double radius)
    {
        if (radius < 0)
            throw new IllegalArgumentException
                    ("Radius must be < 0");
        this.radius = radius;
    } // end method setRadius
    
    // Returns radius
    public double getRadius()
    {
        return radius;
    } // end method getRadius
    
    // Calculates Area
    @Override
    public double getArea()
    {
        return getRadius() * getRadius() * Math.PI;
    } // end method getArea
    
    // toString method
    @Override
    public String toString()
    {
        return String.format("%s %s%n%s: %.2f", super.toString(), "Circle",
                "Radius", getRadius());
    } // end method toString
} // end class Circle

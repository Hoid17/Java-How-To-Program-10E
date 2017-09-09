// Calculates surface area and volume for sphere
// @Author: Adam Janecka
package pkg10_13;

public class Sphere extends ThreeDimensionalShape{
    
    private double radius; // radius of sphere
    
    // constructor
    public Sphere(double radius)
    {
        if (radius < 0)
            throw new IllegalArgumentException
                    ("Radius must be > 0");
        this.radius = radius;
    } // end constructor
    
    // sets radius value
    public void setRadius(double radius)
    {
        if (radius < 0)
            throw new IllegalArgumentException
                    ("Radius must be > 0");
        this.radius = radius;
    } // end method setRadius
    
    // return radius value
    public double getRadius()
    {
        return radius;
    } // end method getRadius
    
    // calculates surface area
    @Override
    public double getArea()
    {
        return getRadius() * getRadius() * 4 * Math.PI;
    } // end method getArea
    
    // calculates volume
    @Override
    public double getVolume()
    {
        return (getRadius() * getRadius() * getRadius() * Math.PI * 4) / 3;
    } // end method getVolume
    
    // toString method
    @Override
    public String toString()
    {
        return String.format("%s: %s%n%s: %.2f",
                super.toString(), "Sphere", "Radius", getRadius());
    } // end method toString
} // end class Sphere

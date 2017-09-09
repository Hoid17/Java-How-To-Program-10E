// Calculates surface area and volume of a tetrahedron
// @Author: Adam Janecka
package pkg10_13;

public class Tetrahedron extends ThreeDimensionalShape{
    
    private double length; // Length of a side
    
    // constructor
    public Tetrahedron(double length)
    {
        if (length < 0)
            throw new IllegalArgumentException
                    ("Length must be > 0");
        this.length = length;
    } // end constructor
    
    // sets length value
    public void setLength(double length)
    {
        if (length < 0)
            throw new IllegalArgumentException
                    ("Length must be > 0");
        this.length = length;
    } // end method setLength
    
    // returns length value
    public double getLength()
    {
        return length;
    } // end method getLength
    
    // calculates surface area
    @Override
    public double getArea()
    {
        return getLength() * getLength() * Math.sqrt(3);
    } // end method getArae
    
    // calculates volume
    @Override
    public double getVolume()
    {
        return (getLength() * getLength() * getLength()) / (6 * Math.sqrt(2));
    } // end method getVolume
    
    // toString method
    @Override
    public String toString()
    {
        return String.format("%s: %s%n%s: %.2f", 
                super.toString(), "Regular Tetrahedron", "Length of edge", getLength());
    } // end method toString
} // end class Tetrahedron

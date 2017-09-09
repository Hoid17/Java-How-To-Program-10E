// Calculates volume and surface area of cube
// @Author: Adam Janecka
package pkg10_13;

public class Cube extends ThreeDimensionalShape{
    
    private double length; // Length of a side of the cube
    
    // constructor
    public Cube(double length)
    {
        if (length < 0)
            throw new IllegalArgumentException
                    ("Length must be > 0");
        
        this.length = length;
    } // end constructor
    
    // sets value of length
    public void setLength(double length)
    {
        if (length < 0)
            throw new IllegalArgumentException
                    ("Length must be > 0");
        this.length = length;
    } // end method setLength
    
    // returns value of length
    public double getLength()
    {
        return length;
    } // end method getLength
    
    // calculates surface area
    @Override
    public double getArea()
    {
        return getLength() * getLength() * 6;
    } // end method getArea
    
    // calculates volume
    @Override
    public double getVolume()
    {
        return getLength() * getLength() * getLength();
    } // end method getVolume
    
    // toString Method
    @Override
    public String toString()
    {
        return String.format("%s: %s%n%s: %.2f",
                super.toString(), "Cube", "Length", getLength());
    } // end method toString
} // end class Cube

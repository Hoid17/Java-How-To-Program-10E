// Superclass for three dimensional shapes
// @Author: Adam Janecka
package pkg10_13;

public abstract class ThreeDimensionalShape extends Shape{
    
    public abstract double getVolume(); // calculates volume
    
    // toString Method
    @Override
    public String toString()
    {
        return String.format("Three Dimensional Shape");
    } // end method toString
    
} // end class ThreeDimensionalShape

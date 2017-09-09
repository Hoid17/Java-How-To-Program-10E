// Finds area for square
// @Author: Adam Janecka
package pkg10_13;

public class Square extends TwoDimensionalShape{
    
    private double length; // Length of side
    
    // constructor
    public Square(double length)
    {
        if(length < 0)
            throw new IllegalArgumentException
                    ("Length must be > 0");
        
        this.length = length;
    } // end constructor
    
    // set length
    public void setLength(double length)
    {
        if (length < 0)
            throw new IllegalArgumentException
                    ("Length must be > 0");
        this.length = length;
    } // end method setLength
    
    // get length
    public double getLength()
    {
        return length;
    } // end method getLength
    
    // Calculates area
    @Override
    public double getArea()
    {
        return getLength() * getLength();
    } // end method getArea
    
    // toString method
    @Override
    public String toString()
    {
        return String.format("%s %s%n%s: %.2f", super.toString(), "Square",
                "Length", getLength());
    } // end method toString
} // end class Square

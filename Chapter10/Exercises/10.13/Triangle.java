// Calculates the area of a triangle
// @Author: Adam Janecka
package pkg10_13;

public class Triangle extends TwoDimensionalShape{
    
    private double base; // length of the base
    private double height; // Height of the triangle
    
    // constructor
    public Triangle(double base, double height)
    {
        if (base < 0)
            throw new IllegalArgumentException
                    ("Base must be > 0");
        if (height < 0)
            throw new IllegalArgumentException
                    ("Height must be > 0");
        
        this.base = base;
        this.height = height;
    } // end constructor
    
    // sets base value
    public void setBase(double base)
    {
        if (base < 0)
            throw new IllegalArgumentException
                    ("Base must be > 0");
        this.base = base;
    } // end method setBase
    
    // returns base value
    public double getBase()
    {
        return base;
    } // end method getBase
    
    // sets height value
    public void setHeight(double height)
    {
        if (height < 0)
            throw new IllegalArgumentException
                    ("Height must be > 0");
        this.height = height;
    } // end method setHeight
    
    // returns height value
    public double getHeight()
    {
        return height;
    } // end method getHeight
    
    // calculates area
    @Override
    public double getArea()
    {
        return getBase() * getHeight() / 2;
    } // end method getArea
    
    // toString method
    @Override
    public String toString()
    {
        return String.format("%s %s%n%s: %.2f%n%s: %.2f", super.toString(), "Triangle",
                "Base", getBase(), "Height", getHeight());
    } // end method toString
} // end class Triangle

// Rectangle class to calculate the area and perimeter of a Rectangle
// @Author: Adam Janecka
package pkg8_04;

public class Rectangle {

    private double length = 1;
    private double width = 1;
    
    public Rectangle(double length, double width)
    {
        setLength(length);
        setWidth(width);
    } // end constructor
    
    public Rectangle()
    {
        length = 1;
        width = 1;
    } // end no paramter constructor
    
    public double Perimeter()
    {
        return 2 * length + 2 * width;
    } // end method Perimeter
    
    public double Area()
    {
        return length * width;
    } // end method Area
    
    public void setLength(double length)
    {
        if (length > 0 && length <= 20)
            this.length = length;
        else
            throw new IllegalArgumentException("length must be bewteen 1 and 20.");
    } // end method setLength
    
    public void setWidth(double width)
    {
        if (width > 0 && width <= 20)
            this.width = width;
        else
            throw new IllegalArgumentException("width must be bewteen 1 and 20.");
    } // end method setWidth
    
    public double getLength()
    {
        return length;
    } // end method getLength
    
    public double getWidth()
    {
        return width;
    } // end method getWidth
} // end class Rectangle

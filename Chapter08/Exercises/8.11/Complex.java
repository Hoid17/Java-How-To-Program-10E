// Shows complex numbers as a + bi
// @Author: Adam Janecka
package pkg8_11;

public class Complex {
    
    private double real; // Real number portion
    private double imaginary; // Imaginary portion
    
    public Complex()
    {
        real = 0.0;
        imaginary = 0.0;
    } // end default constructor
    
    public Complex(double real, double imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    } // end constructor
    
    // Adds complex numbers
    public Complex add(Complex add)
    {
        return new Complex(real + add.real, imaginary + add.imaginary);
    } // end method add
    
    // Subtract two numbers
    public Complex subtract(Complex subtract)
    {
        return new Complex(real - subtract.real, imaginary - subtract.imaginary);
    } // end method subtract
    
    public String toString()
    {
        return String.format("(%.1f,%.1f)", real,imaginary); 
    } // end method toString
} // end class Complex

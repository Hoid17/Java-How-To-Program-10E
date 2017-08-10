// Class performs various operations on rational numbers
// @Author: Adam Janecka
package pkg8_15;

public class Rational {

    private int numerator; // Numerator value
    private int denominator; // Denominator value
    
    public Rational(int numerator, int denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    } // end constructor
     
    public Rational()
    {
        numerator = 1;
        denominator = 1;
    } // end no-argument constructor
    
    // Adds two rational numbers
    public static Rational add(Rational num1, Rational num2)
    {
        return new Rational(((num1.numerator * num2.denominator) +
                             (num2.numerator * num1.denominator)),
                             (num1.denominator * num2.denominator));
    } // end method add
    
    // Subtracts two numbers
    public static Rational subtract(Rational num1, Rational num2)
    {
        return new Rational(((num1.numerator * num2.denominator) -
                             (num2.numerator * num1.denominator)),
                             (num1.denominator * num2.denominator));
    } // end method subtract
    
    // Multiplies two rational numbers
    public static Rational multiply(Rational num1, Rational num2)
    {
        return new Rational(num1.numerator * num2.numerator, num1.denominator *
                num2.denominator);
    } // end method multiply
    
    // Divides two rational numbers
    public static Rational divide(Rational num1, Rational num2)
    {
        return new Rational(num1.numerator * num2.denominator, num1.denominator * num2.numerator);
    } // end method divide
    
    
    // Simplifies the rational number
    public void simplify()
    {
        int largest; 
        
        if (numerator > denominator)
            largest = numerator;
        else
            largest = denominator;
        
        int i = 2;
        while ( i < largest)
        {  
            if (numerator > denominator)
                largest = numerator;
            else
                largest = denominator;
            
            if(numerator % i == 0 && denominator % i == 0)
            {
                numerator = numerator / i;
                denominator = denominator / i;
                i = 2;
                continue;
            }
            i++;
        }
    } // end method simplify
    
    public static double toDecimal(Rational num1)
    {
       return (double) num1.numerator / num1.denominator; 
    } // end method toDecimal
    
    public String toString()
    {
        return String.format("%d/%d", numerator, denominator);
    } // end method toString
} // end class Rational

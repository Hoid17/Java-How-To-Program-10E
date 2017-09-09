// Pieceworker class added to Employee hierarchy
// @Author: Adam Janecka
package pkg10_14;

public class PieceWorker extends Employee {
    
    private double wage; // stores the employee's wage per piece
    private int pieces; // stores the number of pieces produced
    
    public PieceWorker(String firstName, String lastName, String socialSecurityNumber,
            double wage, int pieces)
    {
        super(firstName, lastName, socialSecurityNumber);
        
        if (wage < 0.0)
            throw new IllegalArgumentException
                    ("Wage must be >= 0");
        
        if (pieces < 0)
            throw new IllegalArgumentException
                    ("Number of pieces must be > 0");
        
        this.wage = wage;
        this.pieces = pieces;
    }
    
    // sets wage value
    public void setWage(double wage)
    {
        if (wage < 0.0)
            throw new IllegalArgumentException
                    ("Wage must be >= 0");
        this.wage = wage;
    } // end method setWage
    
    // returns wage value
    public double getWage()
    {
        return wage;
    } // end method getWage
    
    // sets pieces value
    public void setPieces(int pieces)
    {
        if (pieces < 0)
            throw new IllegalArgumentException
                    ("Number of pieces must be > 0");
        
        this.pieces = pieces;
    } // end method setPieces
    
    // returns pieces value
    public int getPieces()
    {
        return pieces;
    } // end method getPieces
    
    // calculates earnings
    @Override
    public double earnings()
    {
        return getPieces() * getWage();
    }
    // end method earnings
    
    // toString method
    @Override
    public String toString()
    {
        return String.format("%s: %s%n%s: $%,.2f%n%s: %d", "Pieceworker Employee",
                super.toString(), "Wage per piece", getWage(), "Pieces sold", getPieces());
    } // end method toString
} // end class PieceWorker

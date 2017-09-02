
package pkg9_14;

public class CommissionEmployee extends Employee{

    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage
    
    // five-argument constructor
    public CommissionEmployee(String firstName, String lastName, 
            String socialSecurityNumber, double grossSales, double commissionRate)
    {
        // implicit call to Object's default constructor occurs here
        super (firstName, lastName, socialSecurityNumber);
        
        // if grossSales is invalid throw exception
        if (grossSales < 0.0)
            throw new IllegalArgumentException(
            "Gross sales must be >= 0.0");
        
        // if commissionRate is invalid throw exception
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");
        
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    } // end constructor
    
    // return first name
    
    
    // set gross sales amount
    public void setGrossSales(double grossSales)
    {
        if (grossSales < 0.0)
            throw new IllegalArgumentException(
            "Gross sales must be >= 0.0");
        
        this.grossSales = grossSales;
    } // end method setGrossSales
    
    // return gross sales amount
    public double getGrossSales()
    {
        return grossSales;
    } // end method getGrossSales
    
    // set commission rate
    public void setCommissionRate(double commissionRate)
    {
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");
        
        this.commissionRate = commissionRate;
    } // end method setCommissionRate
    
    // return commmission rate
    public double getCommissionRate()
    {
        return commissionRate;
    } // end method getCommissionRate
    
    // calculate earnings
    public double earnings()
    {
        return commissionRate * grossSales;
    } // end method earnings
    
    // return String representation of CommissionEmployee object
    @Override // indicates that this method overides a superclass method
    public String toString()
    {
        return String.format("%s %n%s: %.2f%n%s: %.2f",
                super.toString(),
                "Gross Sales", grossSales,
                "commission rate", commissionRate);
    } // end method toString
} // end class CommissionEmployee

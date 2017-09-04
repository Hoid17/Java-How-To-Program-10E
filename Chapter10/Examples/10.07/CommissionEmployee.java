// Fig. 10.7: CommissionEmployee.java
// CommissionEmployee class extends Employee

package pkg10_07;

public class CommissionEmployee extends Employee{
 
    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage
    
    // constructor
    public CommissionEmployee(String firstName, String lastName,
            String socialSecurityNumber, double grossSales,
            double commissionRate)
    {
        super(firstName, lastName, socialSecurityNumber);
        
        if (commissionRate <= 0.0 || commissionRate >= 1.0) // validate
            throw new IllegalArgumentException
                    ("Commission rate must be > 0.0 and < 1.0");
        
        if (grossSales < 0.0) // validate
            throw new IllegalArgumentException
                    ("Gross sales must be >= 0.0");
        
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    } // end constructor
    
    // set gross sales amount
    public void setGrossSales(double grossSales)
    {
        if (grossSales < 0.0) // validate
            throw new IllegalArgumentException
                    ("Gross sales must be >= 0.0");
        
        this.grossSales = grossSales;
    } // end method setGrossSales
    
    // return gross sales amount
    public double getGrossSales()
    {
        return grossSales;
    } // end method getGrossSales
    
    // set commissionrate
    public void setCommissionRate(double commissionRate)
    {
        if (commissionRate <= 0.0 || commissionRate >= 1.0) // validate
            throw new IllegalArgumentException
                    ("Commission rate must be > 0.0 and < 1.0");
        
        this.commissionRate = commissionRate;
    } // end method setCommissionRate
    
    // return commission rate
    public double getCommissionRate()
    {
        return commissionRate;
    } // end method getCommissionRate
    
    // calculate earnings; override abstract method earnings in Employee
    @Override
    public double earnings()
    {
        return getCommissionRate() * getGrossSales();
    } // end method earnings
    
    // return String representation of CommissionEmployee object
    @Override
    public String toString()
    {
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",
                "commission employee", super.toString(),
                "gross sales", getGrossSales(),
                "commission rate", getCommissionRate());
    } // end method toString
} // end class CommissionEmployee

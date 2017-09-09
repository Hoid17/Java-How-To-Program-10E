// BasePlusCommissionEmployee modified to fit in Payable Interface
// @Author: Adam Janecka

package pkg10_15;

public class BasePlusCommissionEmployee extends CommissionEmployee{

    private double baseSalary; // base salary per week
    
    // constructor
    public BasePlusCommissionEmployee(String firstName, String lastName,
            String socialSecurityNumber, double grossSales, 
            double commissionRate, double baseSalary)
    {
        super(firstName, lastName, socialSecurityNumber, grossSales,
                commissionRate);
        
        if (baseSalary < 0.0) // validate baseSalary
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        
        this.baseSalary = baseSalary;
    } // end constructor
    
    // set base salary
    public void setBaseSalary(double baseSalary)
    {
        if (baseSalary < 0.0) // validate baseSalary
            throw new IllegalArgumentException
                    ("Base salary must be >= 0.0");
        
        this.baseSalary = baseSalary;
    } // end method setBaseSalary
    
    // return base salary
    public double getBaseSalary()
    {
        return baseSalary;
    } // end method getBaseSalary
    
    // calculate earnings; override method earnings in CommissionEmployee 
    @Override
    public double getPaymentAmount()
    {
        return getBaseSalary() + super.getPaymentAmount();
    } // end method earnings
    
    // return String representation of BasePlusCommissionEmployee object
    @Override
    public String toString()
    {
        return String.format("%s %s; %s: $%,.2f",
                "base-salaried", super.toString(),
                "base salary", getBaseSalary());
    } // end method toString
} // end class BasePlusCommissionEmployee

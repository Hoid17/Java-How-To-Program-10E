// Fig. 9.8: BasePlusCommissionEmployee.java
// private superclass members cannot be accessed in a subclass
package pkg9_08;

public class BasePlusCommissionEmployee extends CommissionEmployee
{

    private double baseSalary; // base salary per week
    
    //six-argument constructor
    public BasePlusCommissionEmployee(String firstName, String lastName, 
            String socialSecurityNumber, double grossSales,
            double commissionRate, double baseSalary)
    {
        // explicit call to superclass CommissionEmployee constructor
        super(firstName, lastName, socialSecurityNumber,
                grossSales, commissionRate);
        
        // if base salary is invalid throw exception
        if (baseSalary < 0.0)
            throw new IllegalArgumentException(
            "Base salary must be >= 0.0");
        
        this.baseSalary = baseSalary;
    } // end constructor
    
    // set base salary
    public void setBaseSalary(double baseSalary)
    {
        if (baseSalary < 0.0)
            throw new IllegalArgumentException(
            "Base salary must be >= 0.0");
        
        this.baseSalary = baseSalary;
    } // end method setBaseSalary
    
    // return base salary
    public double getBaseSalary()
    {
        return baseSalary;
    } // end method getBaseSalary
    
    // calculate earnings
    @Override
    public double earnings()
    {
        // not allowed: commissionRate and grossSales priveate in superclass
        return baseSalary + (commissionRate * grossSales);
    } // end method earnings
    
    // return String representation of BasePlusCommissionEmployee
    @Override
    public String toString()
    {
        // not allowed: attempts to access private superclass members
        return String.format(
        "%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
                "base-salaried commission employee", firstName, lastName,
                "social security number", socialSecurityNumber,
                "gross sales", grossSales, "commission rate", commissionRate,
                "base salary", baseSalary);
    } // end method toString   
} // end class BasePlusCommissionEmployee

// Fig. 9.6: BasePlusCommissionEmployee.java
// BasePlusCommissionEmployee class represents an employee who receives
// a base salary in addition to commission.
package pkg9_06;

public class BasePlusCommissionEmployee {

    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage
    private double baseSalary; // base salary per week
    
    // six-argument constructor
    public BasePlusCommissionEmployee(String firstName, String lastName,
            String socialSecurityNumber, double grossSales,
            double commissionRate, double baseSalary)
    {
        // implicit call to Object's default constructor occurs here
        
        // if grossSales is invalid throw exception
        if (grossSales < 0.0)
            throw new IllegalArgumentException(
            "Gross sales must be >= 0.0");
        
        // if commissionRate is invalid throw exception
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");
        
        // if baseSalary is invalid throw exception
        if (baseSalary < 0.0)
            throw new IllegalArgumentException(
                    "Base salary must be >= 0.0");
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
        this.baseSalary = baseSalary;
    } // end constructor
    
    // return first name
    public String getFirstName()
    {
        return firstName;
    } // end method getFirstName
    
    // return last name
    public String getLastName()
    { 
        return lastName;
    } // end method getLastName
    
    // return social security number
    public String getSocialSecurityNumber()
    {
        return socialSecurityNumber;
    } // end method getSocialSecurityNumber
    
    // get sales amount
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
    
    // return commission rate
    public double getCommissionRate()
    {
        return commissionRate;
    } // end method getCommissionRate
    
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
    public double earnings()
    {
        return baseSalary + (commissionRate * grossSales);
    } // end method earnings
    
    // return String representation of BasePlusCommissionEmployee
    @Override 
    public String toString()
    {
        return String.format(
        "%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
                "base-salaried commission employee", firstName, lastName,
                "social security number", socialSecurityNumber,
                "gross sales", grossSales, "commission rate", commissionRate,
                "base salary", baseSalary);
    } // end method toString
} // end class BasePlusCommissionEmployee

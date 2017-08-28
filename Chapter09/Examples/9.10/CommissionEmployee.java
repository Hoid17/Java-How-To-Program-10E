// Fig. 9.4: CommissionEmployee.java
// CommissionEmployee class represents an employee paid a 
// percentage of gross sales
package pkg9_10;

public class CommissionEmployee extends Object{

    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage
    
    // five-argument constructor
    public CommissionEmployee(String firstName, String lastName, 
            String socialSecurityNumber, double grossSales, double commissionRate)
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
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
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
        return getCommissionRate() * getGrossSales();
    } // end method earnings
    
    // return String representation of CommissionEmployee object
    @Override // indicates that this method overides a superclass method
    public String toString()
    {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
                "commission employee", getFirstName(), getLastName(),
                "social security number", getSocialSecurityNumber(),
                "gross sales", getGrossSales(),
                "commission rate", getCommissionRate());
    } // end method toString
} // end class CommissionEmployee

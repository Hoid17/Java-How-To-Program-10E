// Fig. 10.14: SalariedEmployee.java
// SalariedEmployee class that implements interface Payable.
// method getPaymentAmount

package pkg10_14;

public class SalariedEmployee extends Employee{

    private double weeklySalary;
    
    // constructor
    public SalariedEmployee(String firstName, String lastName, 
            String socialSecurityNumber, double weeklySalary)
    {
        super(firstName, lastName, socialSecurityNumber);
        
        if (weeklySalary < 0.0)
            throw new IllegalArgumentException
                    ("Weekly salary must be >= 0.0");
        
        this.weeklySalary = weeklySalary;
    } // end constructor
    
    // set salary
    public void setWeeklySalary(double weeklySalary)
    {
        if (weeklySalary < 0.0)
            throw new IllegalArgumentException
                    ("Weekly salary must be >= 0.0");
        
        this.weeklySalary = weeklySalary;
    } // end method setWeeklySalary
    
    // return salary
    public double getWeeklySalary()
    {
        return weeklySalary;
    } // end method getWeeklySalary
    
    // calculate earnings; implement interface Payable method that was 
    // abstract in superclass Employee
    @Override
    public double getPaymentAmount()
    {
        return getWeeklySalary();
    } // end method getPaymentAmount
    
    // return String representation of SalariedEmployee object
    @Override
    public String toString()
    {
        return String.format("salaried employee: %s%n%s: $%,.2f",
                super.toString(), "weekly salary", getWeeklySalary());
    } // end method toString
} // end class Salariedemployee

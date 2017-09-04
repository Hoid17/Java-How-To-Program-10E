// Fig. 10.5: SalariedEmployee.java
// SalariedEmployee concrete class extends abstract class Employee
package pkg10_05;

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
    
    // calculate earnings; override abstract method earnings in Employee
    @Override 
    public double earnings()
    {
        return getWeeklySalary();
    } // end method earnings
    
    // return String representation of SalariedEmployee object
    @Override
    public String toString()
    {
        return String.format("salaried employee: %s%n%s: $%,.2f",
                super.toString(), "weekly salary", getWeeklySalary());
    } // end method toString
} // end class Salariedemployee

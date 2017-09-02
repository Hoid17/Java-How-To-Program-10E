// Class for hour-based employees
package pkg9_15;

public class HourlyEmployee extends Employee{

    private double hours; // number of hours worked
    private double wage; // wages earned per hour
    
    // five-argument constructor
    public HourlyEmployee(String firstName, String lastName, 
            String socialSecurityNumber, double hours, double wage)
    {
        // implicit call to Object's default constructor occurs here
        super (firstName, lastName, socialSecurityNumber);
        
        // if grossSales is invalid throw exception
        if (hours < 0.0 || hours > 168.0)
            throw new IllegalArgumentException(
            "Hour must be between 0 and 168");
        
        // if commissionRate is invalid throw exception
        if (wage <= 0.0)
            throw new IllegalArgumentException(
            "Wage must be greater than 0");
        
        this.hours = hours;
        this.wage = wage;
    } // end constructor
    
    // return first name
    
    
    // set gross sales amount
    public void setHours(double hours)
    {
        if (hours < 0.0 || hours > 168.0)
            throw new IllegalArgumentException(
            "Hour must be between 0 and 168");
        
        this.hours = hours;
    } // end method setGrossSales
    
    // return gross sales amount
    public double getHours()
    {
        return hours;
    } // end method getGrossSales
    
    // set commission rate
    public void setWage(double wage)
    {
        if (wage <= 0.0)
            throw new IllegalArgumentException(
            "Wage must be greater than 0");
        
        this.wage = wage;
    } // end method setCommissionRate
    
    // return commmission rate
    public double getWage()
    {
        return wage;
    } // end method getCommissionRate
    
    // calculate earnings
    public double earnings()
    {
        if (hours <= 40)
            return hours * wage;
        
        // If the employee worked overtime
        else
            return ((40 * wage) + ((hours - 40) * (wage * 1.5)));
    } // end method earnings
    
    // return String representation of CommissionEmployee object
    @Override // indicates that this method overides a superclass method
    public String toString()
    {
        return String.format("%s %n%s: %.2f%n%s: %.2f %n%s: %.2f%n",
                super.toString(),
                "Hours Worked", hours,
                "Hourly Rate", wage,
                "Total Earnings", earnings());
    } // end method toString
} // end class HourlyEmployee

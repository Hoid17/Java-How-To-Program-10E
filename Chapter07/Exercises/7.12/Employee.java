// Create employee class to display name and monthly salary
// @Author: Adam Janecka
package pkg7_12;

public class Employee {

    private String firstName;
    private String lastName;
    private double salary;
    
    // Constructor
    public Employee(String first, String last, double salary)           
    {
        this.firstName = first;
        this.lastName = last;
        this.salary = salary;
    } // End constructor
    
    // Set method for first name
    public void setFirstName(String first)
    {
        this.firstName = first;
    } // end method setFirstName
    
    // Get first name
    public String getFirstName()
    {
        return firstName;
    } // end method getFirstName
    
    // Set last name
    public void setLastName(String last)
    {
        this.lastName = last;
    } // end method setLastName
    
    // Get last name
    public String getLastName()
    {
        return lastName;
    } // end method getLastName
    
    // Set monthly salary
    public void setSalary(double salary)
    {
        if (salary > 0)
            this.salary = salary;
    } // end method setSalary;
    
    // Get monthly salary
    public double getSalary()
    {
        return salary;
    } // end method getSalary
} // end class Employee

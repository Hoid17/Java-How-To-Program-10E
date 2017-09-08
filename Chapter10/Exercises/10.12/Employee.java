// Fig. 10.4: Employee.java
// Employee abstract superclass
package pkg10_12;

public abstract class Employee {

    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private final Date birthDate;
    
    // constructor
    public Employee(String firstName, String lastName, 
            String socialSecurityNumber, Date birthDate)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.birthDate = birthDate;
    } // end constructor
    
    // return first name
    public String getFirstName()
    {
        return firstName;
    } // end method getFirstName
    
    public String getLastName()
    {
        return lastName;
    } // end method getLastName
    
    // return social security number
    public String getSocialSecurityNumber()
    {
        return socialSecurityNumber;
    } // end method getSocialSecurityNumber
    
    // return date of birth
    public Date getBirthDate()
    {
        return birthDate;
    } // end method getBirthDate
    
    // return String representation of Employee object
    @Override
    public String toString()
    {
        return String.format("%s %s%nsocial security number: %s%nBirth Date:%s",
                getFirstName(), getLastName(), getSocialSecurityNumber(), getBirthDate());
    } // end method toString
    
    // abstract method must be overridden by concrete subclasses
    public abstract double earnings(); // no implementation here
} // end abstract class Employee

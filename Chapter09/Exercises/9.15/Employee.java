
package pkg9_15;

public class Employee extends Object{

    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    
    // five-argument constructor
    public Employee(String firstName, String lastName, 
            String socialSecurityNumber)
    {
        // implicit call to Object's default constructor occurs here

        
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;

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
    
    // return String representation of CommissionEmployee object
    @Override // indicates that this method overides a superclass method
    public String toString()
    {
        return String.format("%s: %s %s%n%s: %s",
                "Commission Employee", firstName, lastName,
                "Social Security Number", socialSecurityNumber);
    } // end method toString
} // end class Employee

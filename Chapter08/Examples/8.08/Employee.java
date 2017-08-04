// Fig. 8.8: Employee.java
// Employee class with references to other objects.
package pkg8_08;

public class Employee {

    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;
    
    // constructor to initialize name, birth date and hire date
    public Employee(String firstName, String lastName, Date birthDate,
            Date hireDate)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    } // end constructor
    
    // convert Employoee to String format
    public String toString()
    {
        return String.format("%s, %s Hired: %s  Birthday: %s",
                lastName, firstName, hireDate, birthDate);
    } // end method toString
} // end method Employee

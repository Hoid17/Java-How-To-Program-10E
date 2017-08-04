// Fig. 8.12: Employee.java
// static variable used to maintain a count of the number of 
// Employee objects in memory
package pkg8_12;

public class Employee {

    private static int count = 0; // number of Employees created
    private String firstName;
    private String lastName;
    
    // initialize Employee, add 1 to static count and 
    // output String indicating that constructor was called
    public Employee(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        
        ++count; // increment static count of employees
        System.out.printf("Employee constructor: %s %s; count = %d%n",
                firstName, lastName, count);
    } // end constructor
    
    // get first name
    public String getFirstName()
    {
        return firstName;
    } // end method getFirstName
    
    // get last name
    public String getLastName()
    {
        return lastName;
    } // end method getLastName
    
    // static method to get static count value
    public static int getCount()
    {
        return count;
    } // end method getCount
} // end class Employee

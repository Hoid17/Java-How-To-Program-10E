// Application to test Employee class
// @Author: Adam Janecka
package pkg7_12;

public class EmployeeTest {
    
    public static void main(String[] args)
    {
        // create employee objects
        Employee employee1 = new Employee("John", "Smith", 725);
        Employee employee2 = new Employee("Sarah", "Johnson", 1000);
        
        // Display info
        System.out.printf("%s %s%nSalary: $%.2f%n", employee1.getFirstName(),
                employee1.getLastName(),employee1.getSalary() * 12);
        System.out.printf("%s %s%nSalary: $%.2f%n%n", employee2.getFirstName(),
                employee2.getLastName(),employee2.getSalary() * 12);
        
        // Display salary with 10% raise
        System.out.printf("%s %s%nSalary after raise: $%.2f%n", employee1.getFirstName(),
                employee1.getLastName(),(employee1.getSalary() * 12) * 1.10);
        System.out.printf("%s %s%nSalary after raise: $%.2f%n", employee2.getFirstName(),
                employee2.getLastName(),(employee2.getSalary() * 12) * 1.10);
    } // end method main
} // end class EmployeeTest

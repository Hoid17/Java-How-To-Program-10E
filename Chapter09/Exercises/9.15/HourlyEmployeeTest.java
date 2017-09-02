// Test class for HourlyEmployee
package pkg9_15;

public class HourlyEmployeeTest {
    
    public static void main(String[] args)
    {
        HourlyEmployee employee = new HourlyEmployee("Adam", "Janecka", "555-55-5555",
                40.00, 10.00);
        
        System.out.printf("Output before modfication:%n%s", employee);
        
        // Change hours for overtime
        employee.setHours(45);
        
        System.out.printf("%nOutput after modification:%n%s", employee);
    } // end method main
} // end class HourlyEmployeeTest

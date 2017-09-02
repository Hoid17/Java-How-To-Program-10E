
package pkg9_03;

public class BasePlusCommissionEmployeeTest {
    
    public static void main(String[] args)
    {
        CommissionEmployee commEmployee = new CommissionEmployee
                ("Adam", "Janecka", "555-55-5555", 5000, .04);
        
        double salary = 5000;
        
        BasePlusCommissionEmployee employee = new
            BasePlusCommissionEmployee(commEmployee, salary);
        
        System.out.println(employee);
    } // end method main
} // end class BasePlusCommissionEmployeeTest

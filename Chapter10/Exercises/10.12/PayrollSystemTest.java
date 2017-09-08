// Modified Fig 10.9 to include a Date variable to show birthdays and
// give a birthday bonus
// @Author: Adam Janecka

package pkg10_12;

public class PayrollSystemTest {

    public static void main(String[] args) {
        
        // create subclass objects
        SalariedEmployee salariedEmployee = 
                new SalariedEmployee ("John", "Smith", "111-11-1111", new Date(07, 31, 2016), 800.00);
        HourlyEmployee hourlyEmployee = 
                new HourlyEmployee("Karen", "Price", "222-22-2222", new Date(01, 12, 2005), 16.75, 40);
        CommissionEmployee commissionEmployee = 
                new CommissionEmployee("Sue", "Jones", "333-33-3333", new Date (9, 21, 1998), 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = 
                new BasePlusCommissionEmployee
                        ("Bob", "Lewis", "444-44-4444", new Date (10, 10, 2000), 5000, .04, 300);
        
        Date currentDate = new Date(9, 7, 2017);
        
        // create four-element Employee array
        Employee[] employees = new Employee[4];
        
        // initialize array with Employees
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        
        System.out.printf("Employees processed polymorphically: %n%n");
        
        // generically procoess each element in array employees
        for (Employee currentEmployee : employees)
        {
            
            // determine whether elemet is a BasePlusCommissionEmployee
            if (currentEmployee.getBirthDate().getMonth() == currentDate.getMonth())
            {
                System.out.printf(
                "%s%nearned: $%,.2f with $100 bonus.%n%n",currentEmployee, currentEmployee.earnings() + 100);
            }
            else
            System.out.printf(
            "%s%nearned: $%,.2f%n%n",currentEmployee, currentEmployee.earnings());
        } // end for
        
        // get type name of each object in employees array
        for (int j = 0; j < employees.length; j++)
            System.out.printf("Employee %d is a %s%n", j, 
                    employees[j].getClass().getName());
    } // end method main
} // end class PayrollSystemTest

// Modified Fig. 10.11 - 10.15 to include HourlyEmployee
// CommissionEmployee and BasePlusCommissionEmployee
// @Author: Adam Janecka
package pkg10_15;

public class PayableInterfaceTest {

    public static void main(String[] args) {
        
        // create four-element Payable array
        Payable[] payableObjects = new Payable[6];
        
        // populate array with objects that implement Payable
        payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
        payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
        payableObjects[2] = 
                new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        payableObjects[3] = 
                new HourlyEmployee("Lisa", "Barnes", "888-88-8888", 10.00, 40);
        payableObjects[4] = 
                new CommissionEmployee("Adam", "Janecka", "555-55-5555", 4000, .06);
        payableObjects[5] = 
                new BasePlusCommissionEmployee("Sarah", "Connor", "333-33-3333", 5000, .06, 2000);
        
        System.out.println(
        "Invoices and Employees processed polymorphically: ");
        
        // generically process each element in array payableObjects
        for (Payable currentPayable: payableObjects)
        {
            System.out.println("\n" + currentPayable);
                    
            // if the object is a BasePlusCommissionEmployee
            if (currentPayable instanceof BasePlusCommissionEmployee)
            {
                BasePlusCommissionEmployee employee = 
                        (BasePlusCommissionEmployee) currentPayable;
                
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                
                System.out.printf(
                "new base salary with 10%% increase is $%,.2f%n",
                        employee.getBaseSalary());
            }
            
            // output currentPayable and its appropriate payment amount
            System.out.printf("%s: $%,.2f%n",
                    "payment due", currentPayable.getPaymentAmount());
        }
    } // end method main
} // end class PayableInterfaceTest

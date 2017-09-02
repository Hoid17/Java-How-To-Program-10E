// Class BasePlusCommissionEmployee using composition
// @Author: Adam Janecka

package pkg9_03;

public class BasePlusCommissionEmployee {

    private CommissionEmployee employee;
    private double baseSalary;
    
    public BasePlusCommissionEmployee(CommissionEmployee employee, double baseSalary)
    {
        this.employee = employee;
        this.baseSalary = baseSalary;
    }
    
    public void setBaseSalary(double baseSalary)
    {
        this.baseSalary = baseSalary;
    } // end method setBaseSalary
    
    public double getBaseSalary()
    {
        return baseSalary;
    } // end method getBaseSalary
    
    public String toString()
    {
        return String.format("%s\n%s %.2f ", employee, 
                "Base Salary:", getBaseSalary());
    } // end method toString
} // end class BasePlusCommissionEmployee

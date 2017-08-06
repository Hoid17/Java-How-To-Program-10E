// Class to find the amount in account while applying interest
// @Author: Adam Janecka
package pkg8_06;

public class SavingsAccount {
    
    private static double annualInterestRate;
    private double savingsBalance;
    
    public SavingsAccount(double savingsBalance)
    {
        this.savingsBalance = savingsBalance;
    }
    // Calculates the monthly interest rate
    public double calculateMonthlyInterest()
    {
        double monthlyInterest = savingsBalance * (annualInterestRate / 12);
        double total = savingsBalance + monthlyInterest;
        savingsBalance = total;
        
        return total;
    } // end method calculateMonthlyInterest
    
    // Modifys the annual interest rate
    public static void modifyInterestRate(double rate)
    {
        annualInterestRate = rate;
    } // end method modifyInterestRate
} // end class SavingsAccount

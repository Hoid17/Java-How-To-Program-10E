// Test class for SavingsAccount
// @Author: Adam Janecka
package pkg8_06;

public class SavingsAccountTest {
    
    public static void main(String args[])
    {
        SavingsAccount account1 = new SavingsAccount(2000);
        SavingsAccount account2 = new SavingsAccount(3000);
        
        // Make annual interest rate 4%
        account1.modifyInterestRate(.04);
        
        // Prints out balance for next 12 months
        System.out.println("Account with 4% annual interest");
        System.out.println("Month   Account1   Account2");
        for (int i = 0; i < 12; i++)
        {
            System.out.printf("%5d%11.2f%11.2f%n", i + 1, account1.calculateMonthlyInterest(),
                    account2.calculateMonthlyInterest());
        }
        
        account1.modifyInterestRate(.05);
        
        // Prints out next month with 5% interest
        System.out.println("Account with 5% annual interest");
        System.out.printf("%5d%11.2f%11.2f%n", 13, account1.calculateMonthlyInterest(),
                    account2.calculateMonthlyInterest());
    } // end method main
} // end class SavingsAccountTest

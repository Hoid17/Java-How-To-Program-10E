// Modify Fig. 7.8 to include a withdraw method
// @Author: Adam Janecka
package pkg7_10;

public class Account {

    private String name; // instance variable
    private double balance; // instance variable
    
    // Account constructor that receives two parameters
    public Account(String name, double balance)
    {
        this.name = name; // assign name to instance variable name
        
        // validate that the balannce is greater than 0.0; if it's not,
        // instance variable balance keeps its default initial value of 0.0
        if (balance > 0.0)
            this.balance = balance;
    } // end constructor
    
    // method that deposits (adds) only a valid amount to the balance
    public void deposit(double depositAmount)
    {
        if (depositAmount > 0.0) // if the depositAmount is valid
                balance += depositAmount;
    } // end method deposit
    
    // methods that withdraws (subtracts) a valid amount from the balance
    public void withdraw(double withdrawAmount)
    {
        if (withdrawAmount > balance)
            System.out.print("Withdrawal amount exceeded account balance.\n\n");
        else
            balance -= withdrawAmount;
    } // end method withdraw
    
    // method returns the account balance
    public double getBalance()
    {
        return balance;
    } // end method getBalance
    
    // method that sets the name
    public void setName(String name)
    {
        this.name = name;
    } // end method setName
    
    // method that returns the name
    public String getName()
    {
        return name; // give value of name back to caller
    } // end method getName
} // end class Account

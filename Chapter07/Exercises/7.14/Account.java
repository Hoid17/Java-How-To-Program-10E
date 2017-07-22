// Fig. 7.8: Account.java
// Account class with a double instance variable balance and a constructor
// and depoist method that perform validation
package pkg7_14;

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

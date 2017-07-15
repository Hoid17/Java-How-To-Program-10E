// Fig. 7.5: Account.java
// Account class with a constructor that initializes the name
package pkg7_05;

public class Account {

    private String name; // instance variable
            
    // constructor initializes name with parameter name
    public Account(String name) // constructor name is class name
    {
        this.name = name;
    }

    // method to set the name
    public void setName(String name)
    {
        this.name = name;
    }
    
    // method to retrieve the name
    public String getName()
    {
        return name;
    }
} // end class Account

// Fig. 7.2: AccountTest.java
// Creating and manipulating an Account object
package pkg7_02;
import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {
        
        // create a Scanner object to obtain input from the command window
        Scanner input = new Scanner(System.in);
    
        // create an Account object and assign it to MyAccount
        Account myAccount = new Account();
        
        // display initial value of name (null)
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());
        
        // prompt for and read name
        System.out.println("Please enter the name:");
        String theName = input.nextLine(); // read a line of text
        myAccount.setName(theName); // put theName in myAccount
        System.out.println(); // outputs a blank line
        
        // display the name stored in object myAccount
        System.out.printf("Name in object myAccount is:%n%s%n", 
                myAccount.getName());
    } // end method main
} // end class AccountTest

// Determine if a credit account exceeds the customer's credit limit
// @Author: Adam Janecka
package pkg3_18;
import java.util.Scanner;

public class CreditLimit {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int account; // The account number
        int beginBalance; // Starting monthly balance
        int charges; // All items charged this month
        int credits; // Credits applied this month
        int creditLimit; // Credit limit allowed
        int newBalance; // New Balance after all calculations
        
        System.out.print("Enter account number or -1 to quit: "); 
        account = input.nextInt();                  // from user
        
        while (account != -1) // to process 3 complete sets of data
        {
            System.out.print("Enter beginning monthly balance: ");
            beginBalance = input.nextInt();
            System.out.print("Enter all charges: ");
            charges = input.nextInt();
            System.out.print("Enter credits applied this month: ");
            credits = input.nextInt();
            System.out.print("Enter credit limit: ");
            creditLimit = input.nextInt();
        
            newBalance = beginBalance + charges - credits; // Calculate new balance
        
            System.out.printf("%nAccount number: %d%n", account);
            System.out.printf("Beginning Balance: %d%n", beginBalance);
            System.out.printf("Charges: %d%n", charges);
            System.out.printf("Credits: %d%n", credits);
            System.out.printf("Credit Limit: %d%n", creditLimit);
            System.out.printf("Final Balance: %d%n", newBalance);
        
        
            if (newBalance > creditLimit) // output based on newBalance
            {
                System.out.println("Credit limit exceeded");
            }
            else 
            {
                System.out.println("You are within your credit limit.");
            } 
        
            System.out.print("Enter next account number or -1 to quit: ");
            account = input.nextInt();
        }
    } // end method main
} // end class CreditLimit

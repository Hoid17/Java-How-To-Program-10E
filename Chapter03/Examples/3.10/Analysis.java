// Fig. 3.10: Analysis.java
// Analysis of examination results using nested control statements.
package pkg3_10;
import java.util.Scanner; // class uses class Scanner

public class Analysis {

    public static void main(String[] args) {
        
        // create Scanner to obtain input from command window
        Scanner input = new Scanner (System.in);
        
        // initializing variables in declarations
        int passes = 0;
        int failures = 0;
        int studentCounter = 1;
        
        // process 10 students using counter-controlled loop
        while (studentCounter <= 10)
        {
            // prompt user for input and obtain value from user
            System.out.print("Enter result (1 = pass, 2 = fail): ");
            int result = input.nextInt();
            
            // if...else is nested in the while statement
            if (result == 1)
                passes = passes + 1;
            else
                failures = failures + 1;
            
            // increment studentCounter so loop eventually terminates
            studentCounter = studentCounter + 1;
        }
        
        // termination phase; prepare and display results
        System.out.printf("Passed: %d%nFailed %d%n", passes, failures);
        
        // determine whether more than 8 students passed
        if (passes > 8)
            System.out.println("Bonus to instructor!");
    } // end method main
} // end class Analysis

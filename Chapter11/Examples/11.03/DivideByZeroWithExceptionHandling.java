// Fig. 11.3: DivideByZeroWithExceptionHandling.java
// Handling ArithmeticExceptions and InputMismatchExceptions.
package pkg11_03;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling {

    // demonstrates throwing an exception when a divide-by-zero occurs
    public static int quotient(int numerator, int denominator)
        throws ArithmeticException
    {
        return numerator / denominator; // possible division by zero
    } // end method quotient
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true; // determines if more input is needed
        
        do
        {
            try // read two numbers and calculate quotient
            {
                System.out.print("Please enter an integer numerator: ");
                int numerator = scanner.nextInt();
                System.out.print("Please enter an integer denominator: ");
                int denominator = scanner.nextInt();
                
                int result = quotient(numerator, denominator);
                System.out.printf("%nResult: %d / %d = %d%n", numerator, 
                        denominator, result);
                continueLoop = false; // input successful; end looping
            }
            catch(InputMismatchException inputMismatchException)
            {
                System.err.printf("%nException: %s%n",
                        inputMismatchException);
                scanner.nextLine(); // discard input so user can try again 
                System.out.printf(
                "You must enter integers. Please try again. %n%n");
            }
            catch(ArithmeticException arithmeticException)
            {
                System.err.printf("%nException: %s%n", arithmeticException);
                System.out.printf(
                "Zero is an invalid denominator.  Please try again.%n%n");
            }
        } while(continueLoop);
    } // end method main
} // end class DivideByZeroWithExceptionHandling

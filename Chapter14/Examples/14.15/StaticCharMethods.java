// Fig. 14.15: StaticCharMethods.java
// Character static methods for testing characters and converting case
package pkg14_15;
import java.util.Scanner;

public class StaticCharMethods {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // create Scanner
        System.out.println("enter a character and press Enter");
        String input = scanner.next();
        char c = input.charAt(0); // get input character
        
        // display character info
        System.out.printf("is defined: %b%n", Character.isDefined(c));
        System.out.printf("is digit: %b%n", Character.isDigit(c));
        System.out.printf("is first charcter in a Java identifier: %b%n",
                Character.isJavaIdentifierStart(c));
        System.out.printf("is letter: %b%n", Character.isLetter(c));
        System.out.printf(
        "is letter or digit: %b%n", Character.isLetterOrDigit(c));
        System.out.printf(
        "is lower case: %b%n", Character.isLowerCase(c));
        System.out.printf(
        "is upper case: %b%n", Character.isUpperCase(c));
        System.out.printf(
        "to upper case %s%n", Character.toUpperCase(c));
        System.out.printf(
        "to lower case: %s%n", Character.toLowerCase(c));
    } // end method main
} // end class StaticCharMethods

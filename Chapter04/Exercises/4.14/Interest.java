// Modified program of Example 4.6
// @Author: Adam Janecka
package pkg4_14;

public class Interest {

    public static void main(String[] args) {
        
        double amount; // amount on deposit at end of each year
        double principal = 1000.0; // initial amount before interest
        double rate = 5; // interest rate
        int counter = 0;
        
        for (counter = 0; counter <=5; counter++) // Iterates through interest amounts
        {
        
        // display headers
        System.out.printf("Interest rate: %.0f%s%n", counter + rate, "%");
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");
        
        
        // calculate amount on deposit for each of ten years
        for (int year = 1; year <= 10; ++year)
        {
            // calculate new amount for specified year
            amount = principal * Math.pow(1.0 + (double)((counter + rate) / 100), year);
            
            // display the year and the amount
            System.out.printf("%4d%,20.2f%n", year, amount);
        }
        System.out.println();
        
        }
    } // end method main
} // end class Interest

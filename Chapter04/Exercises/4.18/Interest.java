// Modified program of Figure 4.6
// @Author: Adam Janecka
// Note: Outputs are slightly off due to keeping the values as integers
package pkg4_18;

public class Interest {

    public static void main(String[] args) {
        
         int amount; // amount on deposit at end of each year
        int principal = 100000; // initial amount before interest
        double rate = 5; // interest rate
        
        // display headers
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");
        
        // calculate amount on deposit for each of ten years
        for (int year = 1; year <= 10; ++year)
        {
            // calculate new amount for specified year
            amount = (principal * (100 + 5)) / 100;
            principal = amount; 
            
            // display the year and the amount
            System.out.printf("%4d%,20d.%d%n", year, amount / 100, amount % 100);
        }
    }
}

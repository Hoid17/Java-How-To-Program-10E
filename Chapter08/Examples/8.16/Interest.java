// Interest.java
// Compound-interest calculations with BigDecimal.
package pkg8_16;
import java.math.BigDecimal;
import java.text.NumberFormat;

public class Interest {

    public static void main(String[] args) {
        
        // initial principal amount before interest
        BigDecimal principal = BigDecimal.valueOf(1000.0);
        BigDecimal rate = BigDecimal.valueOf(0.05); // interest rate
        
        // display headers
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");
        
        // calculate amount on deposit for each of ten years
        for (int year = 1; year <= 10; year++)
        {
            // calculate new amount for specified year
            BigDecimal amount = 
                    principal.multiply(rate.add(BigDecimal.ONE).pow(year));
            
            // display the year and the amount
            System.out.printf("%4d%20s%n", year,
                    NumberFormat.getCurrencyInstance().format(amount));
        }
    } // end method main
} // end class Interest

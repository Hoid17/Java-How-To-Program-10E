// Calculate PI to the first 200,000 terms of a series
// @Author: Adam Janecka
package pkg4_20;

public class PI {

    public static void main(String[] args) {
        
        double PI = 0; // First term of the value of PI
        int terms = 200000; // Total amount of terms
        int x = 1; // Used to determine first value that is 3.14159
        double value = 0; // Stores the value of 3.14159
        
        System.out.printf("Term\tValue");
        
        for (double i = 1; i <= terms; i++)
        {
            if (i == 1) // First term
            {
                PI += 4;
                System.out.printf("%,.0f\t%f%n", i, PI);
                continue;
            }
            if (i % 2 == 0) // Even number term
            {
                PI -= (4 / ((2 * i) - 1));
                System.out.printf("%,.0f\t%f%n", i, PI);
            }
            if (i % 2 == 1) // Odd number term
            {
                PI += (4 / ((2 * i) - 1));
                System.out.printf("%,.0f\t%f%n", i, PI);
            }
            if ( Math.abs(PI - 3.14159 ) <= 0.000005) // Closest to 3.14156
            {
                while (x > 0)
                {
                    value = i;
                    x--;
                }
            }
        } // end for loop
        
        System.out.println();
        System.out.printf("The first term where the value is 3.14159 is %,.0f%n", value);
    } // end method main
} // end class PI

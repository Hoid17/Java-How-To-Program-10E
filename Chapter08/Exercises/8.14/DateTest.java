// Test application for Date class
// @Author: Adam Janecka
package pkg8_14;

public class DateTest {
    
    public static void main(String args[])
    {
        Date day1 = new Date(4, 30, 1999); // Test default constructor
        Date day2 = new Date("February", 28, 2004); // Test with String 
        Date day3 = new Date(334, 2000); // Test with longDay      
        
        // Increment days by one
        day1.nextDay();
        day2.nextDay();
        day3.nextDay();
        
        // Shows new values for date objects
        System.out.printf("%nDates incremented by 1: %n");
        System.out.printf("Date 1: %s%nDate 2: %s%nDate 3: %s%n", day1, day2, day3);
    } // end method main
    
} // end class DateTest

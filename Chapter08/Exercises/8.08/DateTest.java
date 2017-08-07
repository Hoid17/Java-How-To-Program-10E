// Test application for Date class
// @Author: Adam Janecka
package pkg8_08;

public class DateTest {
    
    public static void main(String args[])
    {
        Date day1 = new Date(4, 30, 1999); // Test going into a new month
        Date day2 = new Date(12, 31, 1999); // Test going into a new year
        Date day3 = new Date(2, 28, 2004); // Test for leap year        
        
        // Increment days by one
        day1.nextDay();
        day2.nextDay();
        day3.nextDay();
        
        // Shows new values for date objects
        System.out.printf("%nDates incremented by 1: %n");
        System.out.printf("Date 1: %s%nDate 2: %s%nDate 3: %s%n", day1, day2, day3);
    } // end method main
    
} // end class DateTest

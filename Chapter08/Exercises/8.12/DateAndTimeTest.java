// Test application for class DateAndTime
// @Author: Adam Janecka
package pkg8_12;

public class DateAndTimeTest {
    
    public static void main(String args[])
    {
        DateAndTime day1 = new DateAndTime(1, 1, 1, 1, 1, 2000);
        DateAndTime day2 = new DateAndTime(23,59,59,12,31,2001);
        
        System.out.printf("Initial time and date:%n%s%n%s", day1, day2);
        
        day1.tick();
        day2.tick();
        
        System.out.printf("Time and date after increment of one second:%n%s%n%s", day1, day2);
        
    } // end method main
} // end class DateAndTimeTest

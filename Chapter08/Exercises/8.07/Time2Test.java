// Test application for Exercise 8.7
// @Author: Adam Janecka
package pkg8_07;

public class Time2Test {

    public static void main(String[] args) {
        
        Time2 t1 = new Time2(); // 00:00:00
        Time2 t2 = new Time2(23); // 23:00:00
        Time2 t3 = new Time2(23, 59); // 23:59:00
        Time2 t4 = new Time2(12, 25, 59); // 12:25:59

        
        System.out.println("Constructed with:");
        displayTime("t1: all default arguments", t1);
        displayTime("t2: hour specified; iterates to next day", t2);
        displayTime("t3: hour and minute specified; loops to next hour", t3);
        displayTime("t4: hour, minute and second specified; loops to next minute", t4);
        
        t1.tick();
        t2.incrementHour();
        t3.incrementMinute();
        t4.tick();
        
        System.out.println("After increments");
        displayTime("t1: ", t1);
        displayTime("t2: ", t2);
        displayTime("t3: ", t3);
        displayTime("t4: ", t4);
        
        
        // attempt to initialize t6 with invalid values
        try
        {
            Time2 t6 = new Time2(27, 74, 99); // invalid values
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("%nException while initializing t6: %s%n",
                    e.getMessage());
        }
    } // end method main
    
    // displays a Time2 object in 24-hour and 12-hour formats
    private static void displayTime(String header, Time2 t)
    {
        System.out.printf("%s%n  %s%n  %s%n",
                header, t.toUniversalString(), t.toString());
    } // end method displayTime
} // end class Time2Test

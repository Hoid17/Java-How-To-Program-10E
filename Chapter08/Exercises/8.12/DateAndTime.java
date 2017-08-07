// Combines classes Date and Time into one class
// @Author: Adam Janecka
package pkg8_12;

public class DateAndTime {
    private int hour; // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59
    private int month; // 1-12
    private int day; // 1-31 based on month
    private int year; // any year
    
    private static final int[] daysPerMonth = 
    { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    // Time2 no-argument constructor:
    // initialzies each instance variable to zero
    public DateAndTime()
    {
        hour = 0;
        minute = 0;
        second = 0;
        month = 1;
        day = 1;
        year = 2000;
    } // end constructor1
    
    
    // Time2 constructor: hour, minute, and second supplied
    public DateAndTime(int hour, int minute, int second, int month, int day, int year)
    {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
        
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");
        
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        if (month <= 0 || month > 12)
            throw new IllegalArgumentException(
            "month (" + month + ") must be 1-12");
        
        // check if day in range for month
        if (day <= 0 ||
                (day > daysPerMonth[month] && !(month == 2 && day == 29)))
            throw new IllegalArgumentException("day (" + day + 
                    ") out-of-range for the specified month and year");
        
        // check for leap year if month is 2 and day is 29
        if (month == 2 && day == 29 && !(year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0)))
            throw new IllegalArgumentException("day (" + day + 
                    ") out-of-range for the specified month and year");
        if (year < 0)
            throw new IllegalArgumentException("year (" + year + ") must be"
                    + "greater than 0");
        
        this.month = month;
        this.day = day;
        this.year = year;
    } // end constructor4


    
    // Increments second hand by 1
    public void tick()
    {
        if (second == 59)
        {
            second = 0;
            incrementMinute();
        }
        else
            second++;
    } // end method tick
    
    // Increments the minute by 1
    public void incrementMinute()
    {
        if (minute == 59)
        {
            minute = 0;
            incrementHour();
        }
        else
            minute++;
    } // end method incrementMinute
    
    // Increments the hour by 1
    public void incrementHour()
    {
        if (hour == 23)
        {
            hour = 0;
            nextDay();
        }
        else
            hour++;
    } // end method incrementHour
    
     public void nextDay()
    {
        // Check for leap year
        if (day == 28 && month == 2 && year % 4 == 0 && year % 100 != 0)
        {
            day++;
        }
        // Check for end of year
        else if (day == 31 && month == 12)
        {
            day = 1;
            month = 1;
            year++;
        }
        
        // Checks for all other cases
        else if (day == daysPerMonth[month])
        {
            
            day = 1;
            month++;
        }
        
        // Default case
        else
            day++;     
    }
    
    // Set Methods
    // set a new time value using universal time;
    // validate the data
    public void setTime(int hour, int minute, int second)
    {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
        
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");
        
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    } // end method setTime
    
    // validate and set hour
    public void setHour(int hour)
    {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        
        this.hour = hour;
    } // end method setHour
    
    // validate and set minute
    public void setMinute(int minute)
    {
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
        
        this.minute = minute;
    } // end method setMinute
    
    // alidate and set second
    public void setSecond(int second)
    {
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");
        
        this.second = second;
    } // end method setSecond
    
    // Get Methods
    // get hour value
    public int getHour()
    {
        return hour;
    } // end method getHour
    
    // get minute value
    public int getMinute()
    {
        return minute;
    } // end method getMinute
    
    // get second value
    public int getSecond()
    {
        return second;
    } // end method getSecond
    
    // convert to String in universal-time format (HH:MM:SS)
    public String toUniversalString()
    {
        return String.format(
        "%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    } // end method toUniversal String
    
    // convert to String in standard-time format (H:MM:SS AM or PM)
    public String toString()
    {
        return String.format("%d:%02d:%02d %s%n%d/%d/%d%n",
                ((getHour() == 0 || getHour() == 12) ? 12: getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"), month, day, year );
    } // end method toString
} // end class DateAndTime

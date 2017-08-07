// Modify Fig. 8.5 to include a tick method
// @Author: Adam Janecka
package pkg8_07;

public class Time2 {

    private int hour; // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59
    
    // Time2 no-argument constructor:
    // initialzies each instance variable to zero
    public Time2()
    {
        this(0,0,0); // invokes constructor with three arguments
    } // end constructor1
    
    // Time2 constructor: hour supplied, minute and second defaulted to 0
    public Time2(int hour)
    {
        this(hour, 0, 0); // invoke constructor with three arguments
    } // end constructor2
    
    // Time2 constructor: hour and minute supplied, second defaulted to 0
    public Time2(int hour, int minute)
    {
        this(hour, minute, 0); // invoke constructor with three arguments
    } // end constructor3
    
    // Time2 constructor: hour, minute, and second supplied
    public Time2(int hour, int minute, int second)
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
    } // end constructor4
    
    // Time2 constructor: another Time2 object supplied
    public Time2(Time2 time)
    {
        // invoke constructor with three arguments
        this(time.getHour(), time.getMinute(), time.getSecond());
    } // end constructor5

    
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
            hour = 0;
        else
            hour++;
    } // end method incrementHour
    
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
        return String.format("%d:%02d:%02d %s",
                ((getHour() == 0 || getHour() == 12) ? 12: getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    } // end method toString
} // end class Time2

// Modify class Date to output in various forms
// @Author: Adam Janecka
package pkg8_14;

public class Date {

    private int month; // 1-12
    private int day; // 1-31 based on month
    private int year; // any year
    private int longDay = 0; // Used for long day notation
    
    private static final int[] daysPerMonth = 
    { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] leapYearMonths = 
    { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final String[] namesOfMonths = 
    {"", "January", "February", "March", "April", "May", "June", "July", "August",
        "September", "Octoboer", "November", "December"
    };
    
    // constructor: confirm proper value for month and day given the year
    public Date(int month, int day, int year)
    {
        setMonth(month);
        setDay(day);
        setYear(year);
        
        setLongDay();
        
        System.out.printf(
            "Date object constructor for date %s%n", this);
    }
    
    public Date(String name, int day, int year)
    {
        
        for (int i = 1; i <= 12; i++)
        {
            if (name.equals(namesOfMonths[i]))
                month = i;
        }
        
        setDay(day);
        setYear(year);

        setLongDay();
        
        System.out.printf(
            "Date object constructor for date %s%n", this);
    }
    
    public Date (int dayOfYear, int year)
    {
        setYear(year);
        
        if(dayOfYear <= 0 || dayOfYear > 365)
            throw new IllegalArgumentException("day of year must be 1-365");
        
        longDay = dayOfYear;
        // Determine the month 
        while(dayOfYear > daysPerMonth[month]){
            dayOfYear -= daysPerMonth[month];
            month++;
        }
        
        day  = dayOfYear;
        System.out.printf(
            "Date object constructor for date %s%n", this);
    }
    
    // Increments the date by 1
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
        longDay++;
    }
    
    // Set Method for day
    public void setDay(int day)
    {
        // check if day in range for month
        if (day <= 0 ||
                (day > daysPerMonth[month] && !(month == 2 && day == 29)))
            throw new IllegalArgumentException("day (" + day + 
                    ") out-of-range for the specified month and year");
        
        this.day = day;
    } // end method setDay
    
    // Set Method for month
    public void setMonth(int month)
    {
        if (month <= 0 || month > 12)
            throw new IllegalArgumentException(
            "month (" + month + ") must be 1-12");
        
        // check for leap year if month is 2 and day is 29
        if (month == 2 && day == 29 && !(year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0)))
            throw new IllegalArgumentException("day (" + day + 
                    ") out-of-range for the specified month and year");
        
        this.month = month;
    } // end method setMonth
    
    // Set Method for year
    public void setYear(int year)
    {
        if (year < 0)
            throw new IllegalArgumentException("year (" + year + ") must be"
                    + "greater than 0");
        this.year = year;
    } // end method setYear
    
    // Used to set longDay for constructors that don't have it as a parameter
    public void setLongDay()
    {
        longDay = 0;
        
        // In case of leap year
        if (year % 4 == 0 && year % 100 != 0)
            daysPerMonth[2] = 29;
        
        for (int i = 1; i < month; i++)
        {
            longDay += daysPerMonth[month];
        }
        
        longDay += day;
        
        // Reset in case of leap year
        daysPerMonth[2] = 28;
    } // end method setLongDay
    
    // return a String of the form month/day/year
    public String toString()
    {
        return String.format("%d/%d/%d"
                + "%n%s %d, %d"
                + "%n%d %d%n", month, day, year, namesOfMonths[month], day, year, longDay, year);
    } // end method toString
} // end class Date

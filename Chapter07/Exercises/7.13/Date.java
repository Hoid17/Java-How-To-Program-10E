// Create a class to display the date 
// @Author: Adam Janecka
package pkg7_13;

public class Date {

    private int month;
    private int day;
    private int year;
    
    // Constructor
    public Date(int month, int day, int year)
    {
        setMonth(month);
        setDay(day);
        setYear(year);
    } // end constructor
    
    // Displays date in month/day/year format
    public void displayDate()
    {
        System.out.printf("%d/%d/%d", month, day, year);
    } // end method displayDate
    
    // set month value
    public void setMonth(int month)
    {
        this.month = month;
    } // end method setMonth
    
    // Return the month value
    public int getMonth()
    {
        return month;
    } // end method getMonth
    
    // set day value
    public void setDay(int day)
    {
        this.day = day;
    } // end method setDay
    
    // Returns day value
    public int getDay()
    {
        return day;
    } // end method getDay
    
    // set year value
    public void setYear(int year)
    {
        this.year = year;
    } // end method setYear
    
    // get year value
    public int getYear()
    {
        return year;
    } // end method getYear 
} // end class Date

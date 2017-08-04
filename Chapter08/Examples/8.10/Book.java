// Fig. 8.10: Book.java
// Declaring an enum type with a constructor and explicit instance fields
// and accessors for these fields

public enum Book {
    
    // declare constants of enum type
    JHTP("Java How to Program", "2015"),
    CHTP("C How to Program", "2013"),
    IW3HTP("Internet & World Wide Web How to Program", "2012"),
    CPPHTP("C++ How to Program", "2014"),
    VBHTP("Visual Basic How to Program", "2014"),
    CSHARPHTP("Visual C# How to Program", "2014");
    
    // instance fields
    private final String title; // book title
    private final String copyrightYear; // copyright year
    
    // enum constructor
    Book(String title, String copyrightYear)
    {
        this.title = title;
        this.copyrightYear = copyrightYear;
    } // end constructor
    
    // accessor for field title
    public String getTitle()
    {
        return title;
    } // end method getTitle
    
    // accessor for field copyrightYear
    public String getCopyrightYear()
    {
        return copyrightYear;
    } // end method getCopyrightYear
} // end enum Book

// Creates a boolean array of 100 integers
// @Author: Adam Janecka
package pkg8_13;

public class IntegerSet { 
    
    private boolean[] set; // Set of 100 integers
    
    public IntegerSet()
    {
        set = new boolean[101];
    } // end default constructor
    
    // Creates a set that is the union of two sets
    public IntegerSet union(IntegerSet integerset)
    {
        IntegerSet temp = new IntegerSet();
        // Iterates through both arrays
        for (int count = 0; count < 101; count++)
            temp.set[count] = (set[count]||integerset.set[count]);
        
        return temp;
    } // end method union
    
    // Creates a set that is the intersection of two sets
    public IntegerSet intersect(IntegerSet integerset)
    {
        IntegerSet temp = new IntegerSet();
        // Iterates through both arrays
        for (int count = 0; count < 101; count++)
            temp.set[count] = (set[count]&&integerset.set[count]);
        
        return temp;
    } // end method intersect
    
    
    // Sees if two integer sets are equal
    public boolean isEqualTo(IntegerSet integerset)
    {
        for (int count = 0; count < 101; count++)
        {
            if (set[count]!= integerset.set[count])
                return false;
        }
        return true;
    } // end method isEqualTo
    
    public void insertElement(int integer)
    {
        if (integer >= 0 && integer <= 100)
            set[integer] = true;
        else
            throw new IllegalArgumentException("Number must be "
                    + "between 0 and 100");
    } // end method insertElement
    
    public void deleteElement(int integer)
    {
        if (integer >= 0 && integer <= 100)
            set[integer] = false;
        else
            throw new IllegalArgumentException("Number must"
                    + " be between 0 and 100");
    } // end method deleteelement
    
    public String toString()
    {
        boolean empty = true; // Set is assumed empty by default
        
        String setString = " ";
        for (int count = 0; count < 101; count++)
        {
            if(set[count]){
                setString += count + " ";
                empty = false;
            }
                
        }
        
        if(empty)
            setString += "---"; // displays empty set
        return setString;
    } // end method toString
} // end class IntegerSet

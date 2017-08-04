// Fig. 8.15: PackageDataTest.java
// Package-access members of a class are accessible by other classes
// in the same package.
package pkg8_15;

public class PackageDataTest {

    public static void main(String[] args) {
       
        PackageData packageData = new PackageData();
        
        // output String representation of packageData
        System.out.printf("After instantiation:%n%s%n", packageData);
        
        // change package access data in packageData object
        packageData.number = 77;
        packageData.string = "Goodbye";
        
        // output String representation of packageData
        System.out.printf("%nAfter changing values:%n%s%n", packageData);
    } // end method main
} // end class PackageDataTest

// class with package access instance variables
class PackageData
{
    int number; // package-access instance variable
    String string; // package-access instance variable
    
    // constructor
    public PackageData()
    {
        number = 0;
        string = "Hello";
    } // end constructor
    
    // return PackageData to object String representation
    public String toString()
    {
        return String.format("number: %d; string: %s", number, string);
    } // end method toString
} // end class PackageData

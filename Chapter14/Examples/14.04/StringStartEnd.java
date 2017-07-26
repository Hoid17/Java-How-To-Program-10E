// Fig. 14.4: StringStartEnd.java
// String methods startsWith and endsWith
package pkg14_04;

public class StringStartEnd {

    public static void main(String[] args) {
       
        String[] strings = {"started", "starting", "ended", "ending"};
        
        // test method startsWith
        for (String string : strings)
        {
            if (string.startsWith("st"))
                System.out.printf("\"%s\" starts with \"st\"%n", string);
        }
        
        System.out.println();
        
        // test method startsWith starting from position 2 of string
        for (String string : strings)
        {
            if (string.startsWith("art", 2))
                System.out.printf(
                "\"%s\" starts with \"art\" at poition 2%n", string);
        }
        
        System.out.println();
        
        // test method endsWith
        for (String string : strings)
        {
            if (string.endsWith("ed"))
                System.out.printf("\"%s\" ends with \"ed\"%n", string);
        }
    } // end method main
} // end class StringStartEnd

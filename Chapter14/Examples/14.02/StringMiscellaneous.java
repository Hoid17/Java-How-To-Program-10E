// Fig. 14.2: StringMiscellaneous.java
// This application demonstrates the length, charAt and getChars 
// methods of the String class
package pkg14_02;

public class StringMiscellaneous {

    public static void main(String[] args) {
        
        String s1 = "hello there";
        char[] charArray = new char[5];
        
        System.out.printf("s1: %s", s1);
        
        // test length method
        System.out.printf("%nLength of s1: %d", s1.length());
        
        // loop through characters in s1 with charAt and display reversed
        System.out.printf("%nThe string reversed is: ");
        
        for (int count = s1.length() - 1; count >= 0; count--)
            System.out.printf("%c ", s1.charAt(count));
        
        // copy characters from string into charArray
        s1.getChars(0, 5, charArray, 0);
        System.out.printf("%nThe character array is: ");
        
        for (char character : charArray)
            System.out.print(character);
        
        System.out.println();
    } // end method main
} // end class StringMiscellaneous

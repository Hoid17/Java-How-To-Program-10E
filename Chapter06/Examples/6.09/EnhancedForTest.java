// Fig. 6.9: EnhancedForTest.java
// Using the enhanced for statement to total integers in an array
package pkg6_09;

public class EnhancedForTest {

    public static void main(String[] args) {
        
        int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        int total = 0;
        
        // add each element's value to total
        for (int number: array)
            total += number;
        
        System.out.printf("Total of array elements: %d%n", total);
    } // end method main
} // end class EnhancedForTest

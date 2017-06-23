// Fig. 6.4: InitArray.java
// Calculating the values to be placed into the elements of an array.
package pkg6_04;

public class InitArray {

    public static void main(String[] args) {
        
        final int ARRAY_LENGTH = 10; // declare constant
        int[] array = new int[ARRAY_LENGTH];
        
        // calculate value for each array element
        for(int counter = 0; counter < array.length; counter++)
            array[counter] = 2 + 2 * counter;
        
        System.out.printf("%s%8s%n", "Index", "Value"); // column headings
        
        // output each array element's value
        for (int counter = 0; counter < array.length; counter++)
            System.out.printf("%5d%8d%n", counter, array[counter]);
    } // end method main
} // end class InitArray

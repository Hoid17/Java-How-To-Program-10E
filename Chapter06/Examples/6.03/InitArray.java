// Fig. 6.3: InitArray.java
// Initializing the elements of an array with an array initializer
package pkg6_03;

public class InitArray {

    public static void main(String[] args) {
        
        // initializer list specifies the initial value for each element
        int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
        
        System.out.printf("%s%8s%n", "Inex", "Value"); // column headings
        
        // output each array element's value
        for (int counter = 0; counter < array.length; counter++)
            System.out.printf("%5d%8d%n", counter, array[counter]);
    } // end method main
} // end class InitArray

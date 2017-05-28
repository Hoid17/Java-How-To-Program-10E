// Exercise 3.25: Mystery2.java
package pkg3_25;

public class Mystery2 {

    public static void main(String[] args) {
        
        int count = 1;
        
        while (count <= 10)
        {
            System.out.println(count % 2 == 1 ? "****" : "++++++++");
            ++count;
        } // end while loop
    } // end method main
} // end class Mystery2

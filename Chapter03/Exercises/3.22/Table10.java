// Output table of values using while loops
// @Author: Adam Janecka
package pkg3_22;

public class Table10 {

    public static void main(String[] args) {
        
        int n = 1; // counter variable
        
        System.out.println("N\t10*N\t100*N\t1000*N");
        
        while (n <= 5)
        {
            System.out.printf("%d\t%d\t%d\t%d\t%n", n, n * 10, n * 100, n * 1000);
            n++;
        } // end while loop
    } // end method main
} // end class Table10

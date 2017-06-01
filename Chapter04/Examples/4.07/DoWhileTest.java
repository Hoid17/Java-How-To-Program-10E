// Fig. 4.7: DoWhileTest.java
// do...while repetition statement.
package pkg4_07;

public class DoWhileTest {

    public static void main(String[] args) {
        
        int counter = 1;
        
        do
        {
            System.out.printf("%d ", counter);
            ++counter;
        } while (counter <= 10); // end do...while
        
        System.out.println();
    } // end method main
} // end class DoWhileTest

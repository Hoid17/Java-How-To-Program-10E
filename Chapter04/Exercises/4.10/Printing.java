// Exercise 4.10: Printing.java
package pkg4_10;

public class Printing {

    public static void main(String[] args) {
        
        for (int i = 1; i <= 10; i++)
        {
            for (int j = 1; j <= 5; j++)
                System.out.print('@');
            
            System.out.println();
        }
    } // end method main
} // end class Printing

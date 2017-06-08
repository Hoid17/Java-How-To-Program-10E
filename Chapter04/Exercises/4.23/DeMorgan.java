// Show that two expression are equivalent
// @Author: Adam Janecka
package pkg4_23;

public class DeMorgan {

    public static void main(String[] args) {
        
        int x = 5;  // All values are 5 to test expression
        int y = 5;
        int a = 5; 
        int b = 5;
        int g = 5;
        int i = 5;
        int j = 5;
        
        System.out.println("All variables have value of 5 to compare expressions.\n");
        
        // Exercise a)
        System.out.println("Exercise A");
        System.out.printf("!(x < 5) && !(y >= 7):\t\t%b%n", !(x < 5) && !(y >= 7));
        System.out.printf("(x >= 5) || (y < 7):\t\t%b%n%n", (x >= 5) || (y < 7));
        
        // Exercise b)
        System.out.println("Exercise B");
        System.out.printf("!(a == b) || !(g != 5):\t\t%b%n", !(a == b) || !(g != 5));
        System.out.printf("!((a == b) && (g != 5)):\t%b%n%n", !((a == b) && (g != 5)));
        
        // Exercise c)
        System.out.println("Exercise C");
        System.out.printf("!((x <= 8) && (y > 4)):\t\t%b%n", !((x <= 8) && (y > 4)));
        System.out.printf("!(x <= 8) || !(y > 4):\t\t%b%n%n", !(x <= 8) || !(y > 4));
        
        // Exercise d)
        System.out.println("Exercise D");
        System.out.printf("!((i > 4) || (j <= 6)):\t\t%b%n", !((i > 4) || (j <= 6)));
        System.out.printf("!( i > 4) && !(j < = 6):\t%b%n", !(i > 4) && !(j <= 6));        
    } // end method main
} // end class DeMorgan

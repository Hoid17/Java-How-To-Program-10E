// Modify code for four parts of the problem with only indentations
package pkg3_28;

public class DanglingElse2 {

    public static void main(String[] args) {
        
        int x = 5; 
        int y = 8;
        
        // Exercise 3.28a
        System.out.println("Exercise 3.28a");
        
        if (y == 8)
            if (x == 5)
                System.out.println("@@@@@");
        else
                System.out.println("#####");
        System.out.println("$$$$$");
        System.out.println("&&&&&");
        System.out.println();
        
        // Exercise 3.28b
        System.out.println("Exercise 3.28b");
        
        if (y == 8)
            if (x == 5)
                System.out.println("@@@@@");
        else
        {
            System.out.println("#####");
            System.out.println("$$$$$");
            System.out.println("&&&&&");
        }
        System.out.println();
        
        // Exercise 3.28c
        System.out.println("Exercise 3.28c");
        
        if (y == 8)
            if (x == 5)
                System.out.println("@@@@@");
        else
        {
            System.out.println("#####");
            System.out.println("$$$$$");
            System.out.println("&&&&&");
        }
        System.out.println();
        
        // Exercise 3.28d
        System.out.println("Exercise 3.28d");
        
        x = 5;
        y = 7;
        
        if (y == 8)
        {
            if (x == 5)
                System.out.println("@@@@@");
        }
        else
        {
            System.out.println("#####");
            System.out.println("$$$$$");
            System.out.println("&&&&&");
        }
    } // end method main
} // end class DanglingElse2

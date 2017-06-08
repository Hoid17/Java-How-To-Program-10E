// Find all Pythagorean triples from 1 to 500
// @Author: Adam Janecka
package pkg4_21;

public class PythagoreanTriples {

    public static void main(String[] args) {
        
        System.out.println("Pythagorean triples: ");
        
        for (int side1 = 1; side1 <= 500; side1++) // first side
        {
            for (int side2 = 1; side2 <= 500; side2++) // second side
            {
                for (int hypotenuse = 1; hypotenuse <= 500; hypotenuse++) // hypotenuse 
                {
                    // If statement created to avoid duplicate triples
                    if ((side1 * side1 + side2 * side2) == (hypotenuse * hypotenuse) && (side1 < side2)) 
                        System.out.printf("%d\t%d\t%d%n", side1, side2, hypotenuse);
                } 
            }
        } // end for loop
    } // end method main
} // end class PythagoreanTriples

// Find the hypotenuse given two sides of a triangle
// @Author: Adam Janecka
package pkg5_15;
import java.util.Scanner;

public class Hypotenuse {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double side1; // First side of triangle
        double side2; // Second side of triangle
        double hypotenuse; // Hypotenuse
        
        System.out.print("Enter first side of triangle: ");
        side1 = input.nextDouble();
        System.out.print("Enter second side of triangle: ");
        side2 = input.nextDouble();
        
        System.out.printf("Hypotenuse is %.2f%n", hypotenuse(side1, side2));
    } // end method main
    
    // Finds the hypotenuse 
    public static double hypotenuse(double side1, double side2)
    {
        double x = side1 * side1; // Side 1 squared 
        double y = side2 * side2; // Side 2 squared
        
        double hypotenuse = Math.sqrt(x + y);
        
        return hypotenuse;
    } // end method hypotenuse
} // end class Hypotenuse 

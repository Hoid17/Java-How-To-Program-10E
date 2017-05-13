// Find the diameter, circumference, and area of a circle
// @Author: Adam Janecka
package pkg2_28;
import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int radius; // The radius entered by user
        
        System.out.print("Enter radius: "); // Prompt
        radius = input.nextInt(); // Get radius
        
        System.out.printf("Diameter is %d%n", (radius * 2));
        System.out.printf("Circumference is %f%n", (2 * radius * Math.PI));
        System.out.printf("Area is %f%n", (radius * radius * Math.PI));
    } // end method main
} // end class Circle

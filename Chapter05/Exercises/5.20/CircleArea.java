// Finds the area of a circle
// @Author: Adam Janecka
package pkg5_20;
import java.util.Scanner;

public class CircleArea {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double radius; // The radius of the circle
        
        System.out.print("Enter radius: ");
        radius = input.nextDouble();
        
        double area = circleArea(radius);
        System.out.printf("The area is %.2f%n", area);
    } // end method main
    
    // Calculates the area of a circle
    public static double circleArea(double radius)
    {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    } // end method circleArea
} // end class CircleArea

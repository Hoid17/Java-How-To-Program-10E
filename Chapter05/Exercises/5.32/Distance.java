// Finds the distance between two points
// @Author: Adam Janecka
package pkg5_32;
import java.util.Scanner;

public class Distance {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        int x1; // X value of first point
        int y1; // Y value of first point
        int x2; // X value of second point
        int y2; // Y value of second point
        
        System.out.print("Enter x value of first point: ");
        x1 = input.nextInt();
        System.out.print("Enter y value of first point: ");
        y1 = input.nextInt();
        System.out.print("Enter x value of second point: ");
        x2 = input.nextInt();
        System.out.print("Enter y value of secon point: ");
        y2 = input.nextInt();
        
        double distance = distance(x1, y1, x2, y2);
        
        System.out.printf("Distance between points is %.2f%n", distance);
    } // end method main
    
    // Calculates the distance between two points
    public static double distance(int x1, int y1, int x2, int y2)
    {
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance;
    } // end method distance
} // end class Distance

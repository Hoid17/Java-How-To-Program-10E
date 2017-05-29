// Find out if three number make a right triangle
// @Author: Adam Janecka
package pkg3_36;
import java.util.Scanner;

public class RightTriangle {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        double num1; // First number
        double num2; // Second number
        double num3; // Third number
        
        System.out.print("Enter first number: ");
        num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        num2 = input.nextDouble();
        System.out.print("Enter third number: ");
        num3 = input.nextDouble();
        
        if (num1 * num1 + num2 * num2 == num3 * num3)
            System.out.println("These number can make a right triangle.");
        else if (num1 * num1 + num3 * num3 == num2 * num2)
            System.out.println("These number can make a right triangle.");
        else if (num2 * num2 + num3 * num3 == num1 * num1)
            System.out.println("These number can make a right triangle.");
        else
            System.out.println("These numbers cannot make a right triangle.");
    } // end method main
} // end class RightTriangle

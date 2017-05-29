// Find if three values make a triangle
// @Author: Adam Janecka
package pkg3_35;
import java.util.Scanner;

public class Triangle {

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int num1; // first number
        int num2; // second number
        int num3; // third number
        
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        System.out.print("Enter second number: ");
        num2 = input.nextInt();
        System.out.print("Enter third number: ");
        num3 = input.nextInt();
        
        if (num1 + num2 <= num3)
            System.out.println("These numbers cannot form a triangle.");
        else if (num1 + num3 <= num2)
            System.out.println("These numbers cannot form a trinagle.");
        else if (num2 + num3 <= num1)
            System.out.println("These numbers cannot form a triangle.");
        else 
            System.out.println("These numbers can form a triangle.");
    } // end method main
} // end class Triangle

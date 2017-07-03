// Calculates nth Fibonacci number
// @Author: Adam Janecka
package pkg6_29;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double num; // Number user enters
        double fibnum; // The Fibonacci number at the nth location
        
        System.out.print("Enter number to find the nth Fibonacci number: ");
        num = input.nextInt();
        
        fibnum = fibonacci(num);
        
        // Display nth Fibonacci number
        System.out.printf("The Fibonacci number is %.2f%n", fibnum);
        System.out.print("The highest Fibonacci number that can be displayed is the 47th number\n");
    } // end method main
    
    // Calcuates the Nth fibonacci number
    public static double fibonacci(double num)
    {
        double num1 = 0; // First three numbers of Fibonacci sequence as default
        double num2 = 1; 
        double num3 = 1; 
        
        if(num == 1)
            return num1;
        else if(num == 2)
            return num2;
        else 
        {
            for(int i = 2; i < num; i++) 
            {
                num3 = num2 + num1;
                num1 = num2;
                num2 = num3;
            }
            return num3;
        }
    } // end method fibonacci
} // end class Fibonacci

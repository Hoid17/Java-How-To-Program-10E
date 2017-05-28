// Find the two largest numbers from a group of 10
// @Author: Adam Janecka
package pkg3_23;
import java.util.Scanner;

public class TwoLargest {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int counter = 1; // counter for while loop
        int number; // number input by user
        int largest; // largest number 
        int largest2; // second largest number 
        
        System.out.print("Enter number: ");
        number = input.nextInt();
        largest = number; // Largest number is the first number by default
        largest2 = number; // Set second largest as default
        
        while (counter < 10)
        {
            System.out.print("Enter number: ");
            number = input.nextInt();
            
            if (number > largest)
            {
                largest2 = largest; // Largest number becomes second largest
                largest = number; // New number is largest
            }
            
            if (number < largest && number > largest2) // If number is second highest
            {
                largest2 = number;
            }
            counter++; 
        } // end while loop
        
        System.out.printf("Largest number: %d%n", largest);
        System.out.printf("Second largest number: %d%n", largest2);
        
    } // end method main
} // end class TwoLargest

// Find the largest integer out of ten numbers
// @Author: Adam Janecka
package pkg3_21;
import java.util.Scanner;

public class Largest {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int counter = 1; // counter for the while loop
        int number; // Number input by the user
        int largest; // Largest number so far
        
     
        System.out.print("Enter number: ");
        number = input.nextInt();
        largest = number; // Largest is first number by default
        
        while (counter < 10)
        {
            System.out.print("Enter number: ");
            number = input.nextInt();
            if (number > largest) // If the new number is bigger
                largest = number;
       
            counter++; // While loop counter update
        } // end while loop
        
        System.out.printf("Largest number: %d%n", largest); // output largest
        
    } // end method main
} // end class Largest

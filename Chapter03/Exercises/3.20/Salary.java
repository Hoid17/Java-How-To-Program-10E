// Calculate salary for three employees
// @Author: Adam Janecka
package pkg3_20;
import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int hours; // Number of hours worked
        double rate; // Hourly rate of work
        double salary; // Total earnings for the week
        
        System.out.print("Enter number of hours worked or -1 to quit: ");
        hours = input.nextInt();
        
        while (hours != -1) // sentinel controlled loop
        {
            System.out.print("Enter hourly wage rate: ");
            rate = input.nextDouble();
            
            if (hours <= 40) // If they didn't work overtime
            {
                salary = hours * rate;
                System.out.printf("Total earnings: $%.2f%n", salary);
            }
            else // If they worked overtime
            {
                salary = (rate * 40) + ((hours - 40) * (rate * 1.5)); // Calculating overtime
                System.out.printf("Total earning: $%.2f%n%n", salary);
            }
            
            System.out.print("Enter hours worked or -1 to quit: ");
            hours = input.nextInt();
        } // end while loop
    } // end method main
} // end class Salary

// Calculate the Parking charge for each customer on a given day
// @Author: Adam Janecka
package pkg5_08;
import java.util.Scanner;

public class ParkingCharge {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double hours = 0; // Number of hours car was in the garage
        double charge; // Total charge for each customer during the day
        
        System.out.print("Enter hours parked in garage or -1 to quit: ");
        hours = input.nextDouble();
            
        while (hours != -1) // Allows multiple uses of program
        {

            
            charge = calculateCharges(hours);
            
            System.out.printf("Total charge: $%.2f%n%n", charge);
            
            System.out.print("Enter hours parked in garage or -1 to quit: ");
            hours = input.nextDouble();
            
        }
    } // end method main
    
    // calculate the charge of the parking garage
    public static double calculateCharges(double hours)
    {
        double charge = 0;
        if (hours <= 3) // if the charge is the default minimum fee
            charge = 2.00;
        else  // formula 
            charge = 0.50 * (Math.ceil(hours) - 3) + 2;
        
        if (charge > 10)  // charge cannot exceed $10.00
            charge = 10.00; 
        
        return charge;
    } // end method calculateCharges
} // end class ParkingCharge

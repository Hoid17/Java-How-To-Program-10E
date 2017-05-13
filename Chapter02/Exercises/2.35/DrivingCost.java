// Calculate the daily driving cost
// NOTE: This exercise only uses concepts learned in Chapter 2 so answers 
// are whole numbers
// @Author: Adam Janecka
package pkg2_35;
import java.util.Scanner;

public class DrivingCost {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        int milesDriven; // Miles driven per day
        int costGas; // Cost of gas per gallon
        int milesPerGallon; // Average miles per gallon
        int parkingFees; // Cost of Parking Fees
        int tolls; // Cost of tolls
        int drivingCost; // Total cost of driving per day
        
        System.out.print("Enter miles driven per day: "); // Prompt
        milesDriven = input.nextInt(); // Get miles driven
        System.out.print("Enter cost of gas per gallon: "); // Prompt
        costGas = input.nextInt();  // Get cost of gas
        System.out.print("Enter average miles per gallon: "); // Prompt
        milesPerGallon = input.nextInt(); // Get miles per gallon
        System.out.print("Enter average parking fees per day: "); // Prompt
        parkingFees = input.nextInt(); // Get parking fees
        System.out.print("Enter tolls per day: "); // Prompt
        tolls = input.nextInt(); // Get tolls
        
        drivingCost = ((milesDriven / milesPerGallon) * costGas) + parkingFees
                + tolls; // Calculate the driving cost
        System.out.printf("Average driving cost per day: %d%n", drivingCost);
    } // end method main
} // end class DrivingCost

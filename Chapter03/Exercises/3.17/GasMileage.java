// Display the total gas mileage and gas mileage for each trip
// @Author: Adam Janecka
package pkg3_17;
import java.util.Scanner;

public class GasMileage {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int miles; // Miles for each individual trip
        int gallon; // Gallons for each individual trip
        int totalmiles = 0; // Miles for all trips
        int totalgallon = 0; // Gallons for all combined trips
        
        System.out.print("Enter miles for trip or -1 to quit: ");
        miles = input.nextInt(); // obtain first trip's miles
        
        while (miles != -1)
        {
            totalmiles += miles;  // add to total
            System.out.print("Enter gallons of gas used: ");
            gallon = input.nextInt(); // obtain gallons
            totalgallon += gallon; 
            
            System.out.printf("Miles driven for this trip: %d%n", miles); // Information displayed 
            System.out.printf("Gallons used on this trip: %d%n", gallon); // for user 
            System.out.printf("Average mpg on this trip: %f%n", (double)miles/gallon);
            System.out.printf("Average mpg overall: %f%n", (double)totalmiles/totalgallon);
            
            System.out.print("Enter miles for next trip or -1 to quit: "); 
            miles = input.nextInt(); // Prevents infinite loop
        } // end while loop
    } // end method main
} // end class GasMileage

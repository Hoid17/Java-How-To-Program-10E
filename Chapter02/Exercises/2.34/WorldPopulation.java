// Find the world population and calculate population growth
// @Author: Adam Janecka
package pkg2_34;
import java.util.Scanner;

public class WorldPopulation {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double worldpop; // Current world population
        double popgrowth; // Population growh rate
        
        System.out.print("Enter current world population: "); // Prompt
        worldpop = input.nextDouble(); // Get World Population
        System.out.print("Enter current population growth rate: "); // Prompt
        popgrowth = input.nextDouble(); // Get growth rate
        
        System.out.printf("Population in 1 year: %f%n", worldpop * popgrowth);
        System.out.printf("Population in 2 year: %f%n", worldpop * popgrowth * popgrowth);
        System.out.printf("Population in 3 year: %f%n", worldpop * popgrowth * popgrowth
        * popgrowth);
        System.out.printf("Population in 4 year: %f%n", worldpop * popgrowth * popgrowth
        * popgrowth * popgrowth);
        System.out.printf("Population in 5 year: %f%n", worldpop * popgrowth * popgrowth
        * popgrowth * popgrowth * popgrowth); 
    } // end method main  
} // end class WorldPopulation

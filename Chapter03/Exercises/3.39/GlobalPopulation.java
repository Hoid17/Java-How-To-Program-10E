// Estimate the global population for the next 75 years
// @Author: Adam Janecka
package pkg3_39;

public class GlobalPopulation {

    public static void main(String[] args) {
        
        int counter = 2017; // used for while loop
        double population = 7.5; // Calculated in billions
        double growthrate = 1.11;
        int twice; // Year population is twice current
        int x = 1; // Used to calculate when population doubles
        
        System.out.println("Year\tPopulation (Billions)\tIncrease");
        System.out.println("2017\t7.5 Billion\t\t0");
        
        while (population < 15)
        {
            System.out.printf("%d\t%.2f\t\t\t%.2f%n", counter + 1, population * growthrate
                    , population * 0.11); 
            population = population * growthrate;
            counter++;
            
        } // end while loop
        
        twice = counter;  // Stores the year the population doubles to be displayed at the end
        
        while (counter < 2092)
        {
            System.out.printf("%d\t%.2f\t\t\t%.2f%n", counter + 1, population * growthrate
                    , population * 0.11); 
            population = population * growthrate;
            counter++;
            
        } // end while loop
        
        System.out.printf("%nThe population doubles in the year %d%n.", twice);
        
    } // end method main
} // end class GlobalPopulation

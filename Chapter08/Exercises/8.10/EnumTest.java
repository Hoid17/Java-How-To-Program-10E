/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8_10;

/**
 *
 * @author Adam Janecka
 */
public class EnumTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Light\tDuration");
        
        for (TrafficLight light : TrafficLight.values())
        {
            System.out.printf("%s\t%d%n", light, light.getDuration());
        }
    } // end method main
    
} // end class EnumTest

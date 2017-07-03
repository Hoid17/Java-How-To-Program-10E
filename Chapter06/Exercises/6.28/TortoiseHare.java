// Use arrays to represent a race between tortoise and hare
// @Author: Adam Janecka
package pkg6_28;
import java.security.SecureRandom;

public class TortoiseHare {

    public static void main(String[] args) {
        
        SecureRandom random = new SecureRandom();
        int tortoisePosition = 1; // starting position for tortoise
        int harePosition = 1;  // starting position for hare
        
        // Starting Message
        System.out.print("BANG !!!!!\n"
                + "AND THEY'RE OFF !!!!!\n");
        
        while(harePosition <= 70  && tortoisePosition <= 70)
        {
            // Get random values for each tick of the clock
            int tortoiseTick = 1 + random.nextInt(10);
            int hareTick = 1 + random.nextInt(10);
            
            // Move position of both animals forward and back 
            if (tortoiseTick <= 5)
                tortoisePosition += 3;
            else if (tortoiseTick <= 7)
                tortoisePosition -= 6;
            else
                tortoisePosition += 1;
            if (tortoisePosition < 1) // Sets lowest possible position to 1
                tortoisePosition = 1;
            
            if (hareTick <= 2)
                harePosition = hareTick;
            else if (hareTick <= 4)
                harePosition += 9;
            else if (hareTick <= 5)
                harePosition -= 12;
            else if (hareTick <= 8)
                harePosition += 1;
            else
                harePosition -= 2;
            if (harePosition < 1)
                harePosition = 1;
            
            displayRace(tortoisePosition, harePosition);
            if(tortoisePosition == harePosition)
                System.out.print("Ouch!\n");                 
        } 
        
        // Display winner of race
        if (tortoisePosition >= 70 && harePosition >= 70)
            System.out.print("It's a tie.\n");
        else if (tortoisePosition >= 70)
            System.out.print("TORTOISE WINS!!! YAY!!!\n");
        else
            System.out.print("Hare wins. Yuch.\n");
    } // end method main
    
    // Prints out the race 
    public static void displayRace(int tortoise, int hare)
    {
        // Display tortoise part of race
        for (int i = 0; i < tortoise; i++)
            System.out.print(" ");
        System.out.printf("T%n");
        
        // Display hare part of race
        for (int i = 0; i < hare; i++)
            System.out.print(" ");
        System.out.printf("H%n");
    } // end method displayRace
} // end class TortoiseHare

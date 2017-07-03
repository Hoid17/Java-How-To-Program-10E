// Use an array to reserve seats on a plane
// @Author: Adam Janecka
package pkg6_19;
import java.util.Scanner;

public class Reservation {

    public static boolean[] seating = new boolean[11]; // creates array for seats
    public static Scanner input = new Scanner(System.in); 
    
    public static void main(String[] args) {
        


        int section; // Section user wants to sit in
        int count = 1; // Counter to continue loop
        
        while (count == 1)
        {
            System.out.print("Enter 1 for first class, 2 for economy. ");
            section = input.nextInt();
            if(section == 1)
                firstClass();
            else
                economy();
        
            System.out.print("Enter 1 to add another passenger or 2 to quit: ");
            count = input.nextInt();
        } 
    } // end method main
    
    // Assigns person to first class seat
    public static void firstClass()
    {
        for (int i = 1; i <= 5; i++)
        {
            if(seating[i] == false)
            {
                seating[i] = true;
                System.out.printf("First class.  Seat Number %d%n", i);
                break;
            }
            // If the entire of first class is booked
            else if (seating[5] == true)
            {
                // if the entire plane is booked
                if (seating[10] == true)
                {
                    System.out.print("Plane booked.  Next flight leaves in 3 hours.\n");
                    break;
                }
                else 
                {
                    System.out.print("First class is booked.  Enter 1 if you would like economy.");
                    int num = input.nextInt();
                    if (num == 1)
                    {
                        economy();
                        break;
                    }
                    else
                    {
                        System.out.print("Plane booked.  Next flight leaves in 3 hours.\n");
                        break;
                    }
                }
            }
                
        }
    } // end method firstClass
    
    // assigns a seat to economy
    public static void economy()
    {
        for (int i = 6; i <= 10; i++)
        {
            if (seating[i] == false)
            {
                seating[i] = true;
                System.out.printf("Economy.  Seat Number %d%n", i);
                break;
            }
            // if economy is booked
            else if (seating[10] == true)
            {
                // if the entire plane is booked
                if (seating[5] == true)
                {
                    System.out.print("Plane booked. Next flight leaves in 3 hours.\n");
                    break;
                }
                else
                {
                    System.out.print("Economy is booked.  Enter 1 if you would like first class: ");
                    int num = input.nextInt();
                    
                    if(num == 1)
                    {
                        firstClass();
                        break;
                    }
                    else
                    {
                        System.out.print("Plane booked.  Next flight leaves in 3 hours.\n");
                        break;
                    }
                }
            }
        }
    } // end method economy
} // end class Reservation

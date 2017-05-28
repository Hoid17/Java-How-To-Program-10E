// Calculate a salesperson's earning based on the items they've sold
// @Author: Adam Janecka
package pkg3_19;
import java.util.Scanner;

public class SalesCommission {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int item1; // Number sold for first item
        int item2; // Number sold for second item
        int item3; // Number sold for third item
        int item4; // Number sold for fourth item
        double total = 0; // Total sales made for the week
        int counter = 1;  // Sentinel counter for while loop
        
        while(counter != -1) // to process three sets of data
        {
            System.out.print("Enter number sold of first item: "); //Prompt
            item1 = input.nextInt(); // Obtain item1
            total += (double)(item1 * 239.99); // add item to total
            System.out.print("Enter number sold of second item: ");
            item2 = input.nextInt();
            total+= (double)(item2 * 129.75);
            System.out.print("Enter number sold of third item: ");
            item3 = input.nextInt();
            total += (double)(item3 * 99.95);
            System.out.print("Enter number sold of fourth item: ");
            item4 = input.nextInt();
            total += (double)(item4 * 350.89);
        
            System.out.printf("Total earning for the week: $%.2f%n", (total * .09 + 200));
            System.out.print("Enter 1 to calculate more earnings or -1 to quit: ");
            counter = input.nextInt();
        } // end while loop
    } // end method main
} // end class SalesCommission

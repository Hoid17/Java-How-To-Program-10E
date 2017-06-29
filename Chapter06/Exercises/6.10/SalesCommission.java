// Display the salaries of various salesman in an array
// @Author: Adam Janecka
package pkg6_10;
import java.util.Scanner;

public class SalesCommission {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double sales; // Sales earned by each salesman
        int[] array= new int [10]; // Stores the data for ten saleman
        int count = 0;
        
        // Iterates through the array
        while (count < 10)
        {
        System.out.print("Enter sales earned: ");
        sales = input.nextInt();
        sales = sales * .09 + 200; // Calculates percentage earned by salesman
        
        if (sales >= 200 && sales <= 299)
            array[1]++;
        else if (sales <= 399)
            array[2]++;
        else if (sales <= 499)
            array[3]++;
        else if (sales <= 599)
            array[4]++;
        else if (sales <= 699)
            array[5]++;
        else if (sales <= 799)
            array[6]++;
        else if (sales <=899)
            array[7]++;
        else if (sales <= 999)
            array[8]++;
        else
            array[9]++;
        
        count++;
        }

        // Displays results
        System.out.printf("%-15s No. Earned", "Range");
        System.out.println();
        for (int i = 1; i < array.length; i++)
        {
            displayHeader(i);
            System.out.printf("%d", array[i]);
            System.out.println();
        }
    } // end method main
    
    // displays header for table
    public static void displayHeader(int num)
    {
        switch(num)
        {
            case 1: 
                System.out.printf("$200-299        ");
                break;
            case 2:
                System.out.printf("$300-399        ");
                break;
            case 3: 
                System.out.printf("$400-499        ");
                break;
            case 4:
                System.out.printf("$500-599        ");
                break;
            case 5:
                System.out.printf("$600-699        ");
                break;
            case 6:
                System.out.printf("$700-799        ");
                break;
            case 7:
                System.out.printf("$800-899        ");
                break;
            case 8: 
                System.out.printf("$900-999        ");
                break;
            case 9: 
                System.out.printf("$1,000 and over ");
        }
                
    } // end method displayHeader
} // end class SalesCommission

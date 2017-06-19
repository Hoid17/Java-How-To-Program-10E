// Outputs quality points based on user's average
// @Author: Adam Janecka
package pkg5_28;
import java.util.Scanner;

public class GradeAverage {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int average; // Average of grades input by user
        
        System.out.print("Enter grade average bewteen 1 and 100: ");
        average = input.nextInt();
        
        int points = qualityPoints(average);
        System.out.printf("Quality Points: %d%n", points);
    } // end method main
    
    // Finds out the number of quality points
    public static int qualityPoints(int average)
    {
        int points; 
        
        if (average < 60)
            points = 0;
        else if (average < 70)
            points = 1;
        else if (average < 80)
            points = 2;
        else if (average < 90)
            points = 3;
        else
            points = 4;
        
        return points;
    } // end method qualityPoints
} // end class GradeAverage

// Calculate FairTax a person would pay based on expenses
// @Author: Adam Janecka
package pkg4_31;
import java.util.Scanner;

public class FairTax {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double housing; // Housing expense
        double food; // Food expense
        double clothing; // Clothing expense
        double transportation; // Transportation expense
        double education; // Education expense
        double healthCare; // Health Care Expense
        double vacation; // Vacation expense
        double total = 0; // Total expense
        
        System.out.print("FairTax to be calculatated at 23%\n\n");
        
        System.out.print("Enter housing expense: ");
        housing = input.nextDouble();
        total += housing;
        
        System.out.print("Enter food expense: ");
        food = input.nextDouble();
        total += food;
        
        System.out.print("Enter clothing expense: ");
        clothing = input.nextDouble();
        total += clothing;
        
        System.out.print("Enter transportation expense: ");
        transportation = input.nextDouble();
        total += transportation;
        
        System.out.print("Enter education expense: ");
        education = input.nextDouble();
        total += education;
        
        System.out.print("Enter Health Care expense: ");
        healthCare = input.nextDouble();
        total += healthCare;
        
        System.out.print("Enter vacation expense: ");
        vacation = input.nextDouble();
        total += vacation;
        
        System.out.printf("Your taxes are $%.2f%n", total * .23);
    } // end method main
} // end class FairTax

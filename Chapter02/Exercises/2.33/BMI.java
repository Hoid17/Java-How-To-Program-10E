// BMI Calculator 
// @Author: Adam Janecka
package pkg2_33;
import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);
        int weight; // Weight in pounds
        int height; // Height in inches
        int BMI; // Body Mass Index
        
        System.out.print("Enter weight in pounds: "); // Prompt
        weight = input.nextInt(); // Get weight
        System.out.print("Enter height in inches: "); // Prompt
        height = input.nextInt(); // Get height
        
        BMI = (weight * 703) / (height * height); // Calculate BMI
        System.out.printf("Your BMI is %d%n", BMI);
        
        if (BMI < 18.5)       //Display correct BMI statement
            System.out.println("Your BMI is Underweight\n");
        if (BMI >= 18.5 && BMI <= 24.9)
            System.out.println("Your BMI is Normal\n");
        if (BMI >= 25 && BMI <= 29.9)
            System.out.println("Your BMI is Overweight\n");
        if (BMI > 30)
            System.out.println("Your BMI is Obese\n");  
        
        System.out.println("BMI Values");    //BMI info from Department of Health
        System.out.println("Underweight:\tless than 18.5");
        System.out.println("Normal:\t\tbetween 18.5 and 24.9");
        System.out.println("Overweight:\tbetween 25 and 29.9");
        System.out.println("Obese:\t\t30 or greater");
    } // end method main
} // end class BMI

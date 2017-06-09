// Create a 5 question multiple-choice quiz
// Questions found on a global warming quizlet
// @Author: Adam Janecka
package pkg4_30;
import java.util.Scanner;

public class GlobalWarming {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int answer; // Answer input by user.  
        int correct = 0;  // Total number of answers correct
        
        
        // Question 1
        System.out.print("What is the cause of global warming?\n"
                + "1. Emission of carbon dioxide from car exhaust, and factories into the atmosphere.\n"
                + "2. Solar radiation trapped by carbon dioxide in the Earth's atmosphere.\n"
                + "3. Cigarette Smoke, Aerosols, and CFC's.\n"
                + "4. All of the above.\n"); // Correct answer
        
        answer = input.nextInt(); // If answer is correct
        if (answer == 4)
            correct++;
        
        // Question 2
        System.out.print("Which of the following is a greenhouse gas that i"
                + "s released by human activities and speeds up global warming?\n"
                + "1. Carbon Dioxide\n" // Correct answer
                + "2. Natural Gas\n"
                + "3. Petroleum\n"
                + "4. Nuclear Power\n");
        
        answer = input.nextInt();
        if (answer == 1)
            correct++;
        
        // Question 3
        System.out.print("Which of the following human activities does "
                + "NOT release carbon dioxide into the atmosphere?\n"
                + "1. Burning Fossil Fuels\n"
                + "2. Deforestation\n"
                + "3. Driving\n"
                + "4. Fishing\n"); // Correct answer
        
        answer = input.nextInt();
        if (answer == 4)
            correct++;
        
        // Question 4
        System.out.print("As global warming continues, the intensity of what "
                + "type of storm that hits coastlines is predicted to increase?\n"
                + "1. Tornados\n"
                + "2. Tsunamis\n"
                + "3. Earthquakes\n"
                + "4. Hurricanes\n"); // Correct answer
        
        answer = input.nextInt();
        if (answer == 4)
            correct++;
        
        // Question 5
        System.out.print("Rising water temperatures is a result of global warming"
                + " and may eventually increase sea levels due to the dissolving of what?\n"
                + "1. Glaciers\n" // Correct answer
                + "2. River Beds\n"
                + "3. Wetlands\n"
                + "4. Mountains\n");
        
        answer = input.nextInt();
        if (answer == 1)
            correct++;
        
        switch(correct) // see how many answers are correct
        {
            case 5:
                System.out.println("Excellent!");
                break;
            case 4: 
                System.out.println("Very good!");
                break;
            default:
                System.out.println("Time to brush up on your knowledge of global warming.");
        }
    } // end method main
} // end class GlobalWarming

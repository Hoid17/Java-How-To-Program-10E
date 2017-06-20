// Modify the Craps example to allow wagers 
// @Author: Adam Janecka
package pkg5_33;
import java.util.Scanner;
import java.security.SecureRandom;


public class CrapsMod {

    // create secure random nunber generator for use in method rollDice
        private static final SecureRandom randomNumbers = new SecureRandom();
        
        // enum type with constants that represent the game status
        private enum Status {CONTINUE, WON, LOST };
        
        // constants that represent common rolls of the dice
        private static final int SNAKE_EYES = 2;
        private static final int TREY = 3;
        private static final int SEVEN = 7;
        private static final int YO_LEVEN = 11;
        private static final int BOX_CARS = 12;
        
    // Play one game of craps
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int counter = 1; // If the player wants to play again
        int myPoint = 0; // point if no win or loss on first roll
        Status gameStatus; // can contain CONTINUE, WON or LOST
        double bankBalance = 1000; // Initialize balance to 1000
        double wage = 0; // How much the player wages

        
        do // allows user to play the game multiple times
        {
            
        int message = 1 + randomNumbers.nextInt(3); // Gets a random variable every time
        
        System.out.printf("Bank balance: $%.2f%n", bankBalance);
        System.out.print("Enter wage: ");
        wage = input.nextDouble();
        
        while (wage > bankBalance) // If the player wages more than they have
        {
            System.out.print("Invalid wage.  Enter wage again: ");
            wage = input.nextDouble();
        }
        
        int sumOfDice = rollDice(); // first roll of the dice
        
        // determine game status and point based on first roll
        switch (sumOfDice)
        {
            case SEVEN: // win with 7 on first roll
            case YO_LEVEN: // win with 11 on first roll
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES: // lose with 2 on first roll
            case TREY: // lose with 3 on first roll
            case BOX_CARS: // lose with 12 on first roll
                gameStatus = Status.LOST;
                break;
            default: // did not win or lose, so remember point
                gameStatus = Status.CONTINUE; // game is not over
                myPoint = sumOfDice; // remember the point
                System.out.printf("Point is %d%n", myPoint);
                break;
        }
        
        while (gameStatus == Status.CONTINUE) // not WON or LOST
        {
            sumOfDice = rollDice(); // roll dice again
            
            // determine game status 
            if (sumOfDice == myPoint) // win by making point
                gameStatus = Status.WON;
            else
                if (sumOfDice == SEVEN) // lose by rolling 7 before point
                    gameStatus = Status.LOST;
        }
        
        // display won or lost message
        if (gameStatus == Status.WON)
        {
            System.out.println("Player wins");
            bankBalance += wage; // Player wins money
        }
        else
        {
            System.out.println("Player loses");
            bankBalance -= wage; // Player loses money
        }
        
        if (bankBalance == 0)
        {
            System.out.println("Sorry.  You busted!");
            break;
        }
        
        printMessage(message);
        
        System.out.print("Enter 1 to play again or 2 to quit: ");
        counter = input.nextInt();
        } while (counter != 2);
    } // end method main
    
    // roll dice, calculate sum and display results
    public static int rollDice()
    {
        // pick random die values
        int die1 = 1 + randomNumbers.nextInt(6); // first die roll
        int die2 = 1 + randomNumbers.nextInt(6); // second die roll
        
        int sum = die1 + die2; // sum of die values
        
        // display results of this roll
        System.out.printf("Player rolled %d + %d = %d%n", 
                die1, die2, sum);
        
        return sum;
    } // end method rollDice   
    
    // Displays chatter messages at random
    public static void printMessage(int num)
    {
        switch(num)
        {
            case 1:
                System.out.printf("Oh, you're going for broke, huh?%n");
                break;
            case 2:
                System.out.printf("Aw c'mon, take a chance!%n");
                break;
            case 3: 
                System.out.printf("You're up big.  Now's the time to cash in your chips!%n");
        }
    } // end method printMessage
} // end class CrapsMod

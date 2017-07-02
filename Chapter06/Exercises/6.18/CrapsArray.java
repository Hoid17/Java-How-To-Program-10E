// Play 1,000,000 games of craps and answer questions based on results
// @Author: Adam Janecka
package pkg6_18;
import java.security.SecureRandom;

public class CrapsArray {
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
        
        // plays one game of craps 
    public static void main(String[] args) {
        
        int myPoint = 0; // point if no win or loss on first roll
        int count = 0; // Counter for playing 1,000,000 games
        int[] lose = new int[22]; // Array for losses
        int[] win = new int[22]; // Array for wins
        int winCount = 0; // Number of times player won
        int loseCount = 0; // Number of times player lost
        int winTotal = 0; // Total number of games won
        int lossTotal = 0; // Total number of games lost
        int rollTotal = 0; // Total number of rolls throughout all games
        Status gameStatus; // can contain CONTINUE, WON or LOST
        
        while (count < 1000000)
        {
        int rollCount = 0; // Number of rolls per game
        
        int sumOfDice = rollDice(); // first roll of the dice
        rollCount++;
        
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
                break;
        }
        
        while (gameStatus == Status.CONTINUE) // not WON or LOST
        {
            sumOfDice = rollDice(); // roll dice again
            rollCount++;
            
            // determine game status 
            if (sumOfDice == myPoint) // win by making point
                gameStatus = Status.WON;
            else
                if (sumOfDice == SEVEN) // lose by rolling 7 before point
                    gameStatus = Status.LOST;
        }
        
        rollTotal += rollCount;
        
        if (rollCount > 20) // For all games with 20 or more rolls
            rollCount = 21;
        
        // iterate counter for win or loss
        if (gameStatus == Status.WON)
        {
            winCount++;
            win[rollCount]++;
        }
        else
        {
            loseCount++;
            lose[rollCount]++;
        }
        count++;
        }
                     
        // Displays number of games won per number of rolls
        System.out.printf("%s%8s%n", "Win", "Rolls");
        for (int i = 1; i < win.length; i++)
        {
            if (i <= 20)
                System.out.printf("%3d%8d%n", i, win[i]);  
            else
                System.out.printf("%3s%8d%n", "21+", win[1]);
        }
        
        System.out.println();
        // Displays number of games lost per number of rolls
        System.out.printf("%s%8s%n", "Loss", "Rolls");
        for (int i = 1; i < lose.length; i++)
        {
            if (i <= 20)
                System.out.printf("%4d%8d%n", i, win[i]);
            else
                System.out.printf("%4s%8d%n", "21+", lose[i]);
        }
        
        System.out.println();
        // Get total amount of games won
        for (int i = 0; i < win.length; i++)
            winTotal += win[i];
        
        // Display percentage of games won
        System.out.printf("Percentage of games won: %d%s%n", (winTotal / 10000) , "%");
        
        // Display average number of rolls per game
        System.out.printf("Average number of rolls: %d%n", rollTotal / 1000000);
    } // end method main
    
    // roll dice, calculate sum and display results
    public static int rollDice()
    {
        // pick random die values
        int die1 = 1 + randomNumbers.nextInt(6); // first die roll
        int die2 = 1 + randomNumbers.nextInt(6); // second die roll
        
        int sum = die1 + die2; // sum of die values
        
        return sum;
    } // end method rollDice    
} // end class CrapsArray


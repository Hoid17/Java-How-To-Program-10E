// Create a program that represents turtle graphics
// @Author: Adam Janecka
package pkg6_21;
import java.util.Arrays;
import java.util.Scanner;

public class Turtle {
    
    public static boolean board[][] = new boolean[20][20];
    public enum Arrow {UP, DOWN, LEFT, RIGHT}; // Directions turtle can face
    public static Arrow direction = Arrow.RIGHT; // Initial direction is right
    public static int rowPos = 0; // Initial position of turtle is 0,0
    public static int colPos = 0; 
    public static boolean pen = false; // Pen is initially off the grid

    // raises the pen up
    public static void penUp()
    {
        pen = false;
    }// end method penUp
    
    // puts the pen down
    public static void penDown()
    {
        pen = true;
    } // end method penDown
    
    // Moves the turtle forward
    public static void moveForward(int dist)
    {
        if(pen)
            board[rowPos][colPos] = true;
        for (int i = 0; i < dist; i++)
        {
            switch(direction)
            {
                case UP: 
                    if (rowPos > 0)
                        rowPos--;
                    break;
                case DOWN:
                    if(rowPos < 19)
                        rowPos++;
                    break;
                case LEFT: 
                    if (colPos > 0)
                        colPos--;
                    break;
                case RIGHT:
                    if (colPos < 19)
                        colPos++;
                    break;                   
            }
            if (pen)
                board[rowPos][colPos] = true;
        }
    } // end method moveForward
    
    // Turns the turtle right
    public static void turnRight()
    {
        switch(direction)
        {
            case UP: 
                direction = Arrow.RIGHT;
                break;
            case RIGHT:
                direction = Arrow.DOWN;
                break;
            case DOWN:
                direction = Arrow.LEFT;
                break;
            case LEFT:
                direction = Arrow.UP;
                break;
        }
    } // end method turnRight;
    
    // Turns the turle to the left
    public static void turnLeft()
    {
        switch(direction)
        {
            case UP:
                direction = Arrow.LEFT;
                break;
            case RIGHT:
                direction = Arrow.UP;
                break;
            case DOWN:
                direction = Arrow.RIGHT;
                break;
            case LEFT:
                direction = Arrow.DOWN;
                break;               
        }
    } // end method turnLeft
    
    // Displays the board
    public static void showBoard()
    {
        for (int row = 0; row < 20; row++)
        {
            for (int col = 0; col < 20; col++)
            {
                if (row == rowPos && col == colPos)
                    System.out.print(pen ? 'X' : 'O');
                else
                    System.out.print(board[row][col] ? '#' : '-');
            }
            System.out.println();
        }
    } // end method showBoard
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int command = 0; // Command entered by user
        int distance; // Distance desired for turtle to travel
        
        System.out.print("1 - Pen up\n"
                + "2 - Pen down\n"
                + "3 - Turn Right\n"
                + "4 - Turn Left\n"
                + "5 - Move forward\n"
                + "6 - Display grid\n"
                + "9 - Exit\n");
        while (command != 9)
        {
            System.out.print("Enter command: ");
            command = input.nextInt();
            
            switch(command)
            {
                case 1: 
                    penUp();
                    break;
                case 2: 
                    penDown();
                    break;
                case 3:
                    turnRight();
                    break;
                case 4: 
                    turnLeft();
                    break;
                case 5:
                    System.out.print("Enter distance: ");
                    distance = input.nextInt();
                    moveForward(distance);
                    break;
                case 6: 
                    showBoard();
                    break;
            }
        }
    } // end method main
} // end class Turtle

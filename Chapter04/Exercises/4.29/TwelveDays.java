// Use switch statements to print out the song "Twelve Days of Christmas"
// @Author: Adam Janecka
package pkg4_29;

public class TwelveDays {

    public static void main(String[] args) {
        
        int day = 1; // Current day the song is on
        
        for (day = 1; day <= 12; day++)
        {
            switch(day) // Switch statement for first part of each verse
            {
                case 1: 
                    System.out.println("On the first day of Christmas, my true love gave to me");
                    break;
                case 2: 
                    System.out.println("On the second day of Christmas, my true love gave to me");
                    break;
                case 3: 
                    System.out.println("On the third day of Christmas, my true love gave to me");
                    break;
                case 4: 
                    System.out.println("On the fourth day of Christmas, my true love gave to me");
                    break;
                case 5: 
                    System.out.println("On the fifth day of Christmas, my true love gave to me");
                    break;
                case 6: 
                    System.out.println("On the sixth day of Christmas, my true love gave to me");
                    break;
                case 7: 
                    System.out.println("On the seventh day of Christmas, my true love gave to me");
                    break;
                case 8: 
                    System.out.println("On the eighth day of Christmas, my true love gave to me");
                    break;
                case 9: 
                    System.out.println("On the ninth day of Christmas, my true love gave to me");
                    break;
                case 10: 
                    System.out.println("On the tenth day of Christmas, my true love gave to me");
                    break;
                case 11: 
                    System.out.println("On the eleventh day of Christmas, my true love gave to me");
                    break;
                case 12: 
                    System.out.println("On the twelfth day of Christmas, my true love gave to me");
                    break;
            } // end first switch statement
            
            switch (day) // switch statement for second part of each verse
            {
                case 12:
                    System.out.println("12 Drummers Drumming");
                case 11: 
                    System.out.println("11 Pipers Piping");
                case 10: 
                    System.out.println("10 Lords a-Leaping");
                case 9: 
                    System.out.println("9 Ladies Dancing");
                case 8: 
                    System.out.println("8 Maids a-Milking");
                case 7: 
                    System.out.println("7 Swans a-Swimming");
                case 6:
                    System.out.println("6 Geese a-Laying");
                case 5: 
                    System.out.println("5 Gold Rings");
                case 4:
                    System.out.println("4 Calling Birds");
                case 3: 
                    System.out.println("3 French Hens");
                case 2: 
                    System.out.println("2 Turtle Doves");
                case 1: 
                    System.out.println("A Partridge in a Pear Tree");    
            }
            
            System.out.println();
        } // end for loop
    } // end method main
} // end class TwelveDays

// Show binary, octal, and hexadecimal equivalent of Decimal
// @Author: Adam Janecka
package pkg5_34;

public class DecimalConversion {

    public static void main(String[] args) {
        
        int decimal;
        int position;
        int binary;
        int remainder = 0;
       
        System.out.println("Decimal\t\t\t\tBinary\t\t\t\tOctal\t\t\t\tHexaDecimal");
        
        for (int i = 1; i <= 256; i++) {
             
            decimal = i;
            position = 1;
            binary = 0;
             
            // Converts to binary
            while (decimal > 0) {
                 
                remainder = decimal % 2;
                decimal/= 2;
                binary += (remainder * position);
                position*=10;
                 
            }
                         
            System.out.printf("%-20d\t\t%-20d\t\t", i,binary);
            
            // Converts to Octal
            decimal = i;
            position = 1;
            int octal = 0;
            while (decimal > 0) {
                remainder = decimal % 8;
                decimal /= 8;
                octal += remainder*position;
                position *= 10;
            }
             
            System.out.printf("%-20d\t\t",octal);
            
            // Converts to hexadecimal
            // Had to use ToString method although it has not been taught yet
            // at this point in the book
            decimal = i;
            position = 1;
            String hexadecimal = "";
            String converter = ""; // Used for Letter values
            
            while (decimal > 0)
            {
            remainder = decimal % 16;
            decimal = decimal / 16;
              
                switch (remainder) {
                    
                    case 0:
                        converter = "0";
                        break;
                    case 1: 
                        converter = "1";
                        break;
                    case 2: 
                        converter = "2";
                        break;
                    case 3:
                        converter = "3";
                        break;
                    case 4: 
                        converter = "4";
                        break;
                    case 5: 
                        converter = "5";
                        break;
                    case 6: 
                        converter = "6";
                        break;
                    case 7:
                        converter = "7";
                        break;
                    case 8: 
                        converter = "8";
                        break;
                    case 9: 
                        converter = "9";
                        break;                           
                    case 10:
                        converter = "A";
                        break;
                    case 11:
                        converter = "B";
                        break;
                    case 12:
                        converter = "C";
                        break;
                    case 13:
                        converter = "D";
                        break;
                    case 14:
                        converter = "E";
                        break;
                    case 15:
                        converter = "F";
                        break;
                }// end switch

                hexadecimal = converter + hexadecimal;
            }
       
            System.out.printf("%-20s\n", hexadecimal);
        }

    } // end method main
} // end class DecimalConversion
    

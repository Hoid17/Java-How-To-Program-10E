// Inputs phone number and outputs phone number using String tokenization
// @Author: Adam Janecka
package pkg14_08;
import java.util.Scanner;

public class PhoneNumber {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String phone; // Full phone number
        String areaCode; 
        String token1; 
        String token2;
        String[] phoneNumber = new String[2];
        String[] phoneNumber2 = new String[2];
        
        
        System.out.print("Enter phone number as (xxx) xxx-xxxx: ");
        phone = input.nextLine();
        
        // split to obtain area code
        phoneNumber = phone.split(" ");
        areaCode = phoneNumber[0].substring(1,4);
        
        // Split remaining to obtain 555-5555
        phoneNumber2 = phoneNumber[1].split("-");
        token1 = phoneNumber2[0];
        token2 = phoneNumber2[1];
        
        System.out.printf("Area Code: %s", areaCode);
        System.out.printf("%nPhone Number: %s%s%n", token1, token2);
        
    } // end method main
} // end class PhoneNumber

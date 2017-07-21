// Test application for Invoice class
// @Author: Adam Janecka
package pkg7_11;

public class InvoiceTest {
    
    public static void main(String[] args)
    {
        
        Invoice product = new Invoice("12005", "Battery Powered Drill", 3, 5.65);
        System.out.printf("Product number: %s", product.getNumber());
        System.out.printf("\nDescription: %s", product.getDescription());
        System.out.printf("\nQuantity: %d", product.getQuantity());
        System.out.printf("\nPrice Per Unit: $%.2f", product.getPrice());
        System.out.printf("\nInvoice Amount: $%.2f%n", product.getInvoiceAmount());
    }
} // end class InvoiceTest

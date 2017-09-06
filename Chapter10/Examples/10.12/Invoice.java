// Fig. 10.12: Invoice.java
// Invoice class that implements Payable.

package pkg10_12;

public class Invoice implements Payable{
  
    private final String partNumber;
    private final String partDescription;
    private int quantity;
    private double pricePerItem;
    
    // constructor
    public Invoice(String partNumber, String partDescription, int quantity,
            double pricePerItem)
    {
        if (quantity < 0) // validate quantity
            throw new IllegalArgumentException("Quantity must be >= 0");
        
        if (pricePerItem < 0.0) // valide pricePerItem
            throw new IllegalArgumentException
                    ("Price per item must be >= 0");
        
        this.quantity = quantity;
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.pricePerItem = pricePerItem;
    } // end constructor
    
    // get part number
    public String getPartNumber()
    {
        return partNumber; // should validate
    } // end method getPartNumber
    
    // get description
    public String getPartDescription()
    {
        return partDescription;
    } // end method getPartDescription
    
    // set quantity
    public void setQuantity(int quantity)
    {
        if (quantity < 0) // validate quantity
            throw new IllegalArgumentException("Quantity must be >= 0");
        
        this.quantity = quantity;
    } // end method setQuantity
    
    // get quantity
    public int getQuantity()
    {
        return quantity;
    } // end method getQuantity
    
    // set price per item
    public void setPricePerItem(double pricePerItem)
    {
        if (pricePerItem < 0.0) // valide pricePerItem
            throw new IllegalArgumentException
                    ("Price per item must be >= 0");
        
        this.pricePerItem = pricePerItem;
    } // end method setPricePerItem
    
    // get price per item
    public double getPricePerItem()
    {
        return pricePerItem;
    } // end method getPricePerItem
    
    // return String representation of Invoice object
    @Override
    public String toString()
    {
        return String.format("%s: %n%s: %s(%s) %n%s: %d %n%s: $%,.2f",
                "invoice", "part number", getPartNumber(), getPartDescription(),
                "quantity", getQuantity(), "price per item", getPricePerItem());
    } // end method toString
    
    // method required to carry out contract with interface Payable
    @Override 
    public double getPaymentAmount()
    {
        return getQuantity() * getPricePerItem(); // calculate total cost
    } // end method getPaymentAmount
} // end class Invoice

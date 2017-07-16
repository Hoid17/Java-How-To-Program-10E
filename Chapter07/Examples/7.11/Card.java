// Fig. 7.11: Card.java
// Card class represents a playing card
package pkg7_11;

public class Card {

    private final String face; // face of card ("Ace", "Deuce", ...)
    private final String suit; // suite of card ("Hearts", "Diamonds", ...)
    
    // two-argument constructor initializes card's face and suit
    public Card(String cardFace, String cardSuit)
    {
        this.face = cardFace; // initialize face of card
        this.suit = cardSuit; // initialize suit of card
    } // end constructor
    
    // return String representation of Card
    public String toString()
    {
        return face + " of " + suit;
    } // end method toString
} // end class Card

package sortThemCards;

public class Card {
    int value;
    Suit suit;

    public Card(int value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return this.suit + ", " + this.value;
    }
}

//The exercise template has a class that represents a playing card.
//Each card has a value and a suit. A card's value is represented
//as a number 2, 3, ..., 14 and its suit as Club, Diamond, Heart
//or Spade. Ace's value is 14. The value is represented with an
//integer, and the suit as an enum. Cards also have a method
//toString, which can be used to print the value and the suit
//in a readable form.

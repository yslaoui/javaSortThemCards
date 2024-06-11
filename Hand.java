package sortThemCards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Hand implements Comparable<Hand> {
    List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void print() {
        Iterator<Card> iterator = this.cards.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    public void sort() {
        Collections.sort(this.cards, (card1, card2) -> card1.getValue() - card2.getValue());
    }

    public int value() {
        if (this.cards.isEmpty()) {
            return 0;
        }
        return this.cards.stream()
                .map(card->card.getValue())
                .reduce(0, (current, value) -> current + value );
    }

    @Override
    public int compareTo(Hand h) {
        return this.value() - h.value();
    }

}

//Create a class Hand to represent the cards in a player's hand.
//Add the following methods to the class:
//public void add(Card card) adds a card to the hand
//public void print() prints the cards in hand as shown in the example below
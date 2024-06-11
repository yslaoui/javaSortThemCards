package sortThemCards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Card first = new Card(2, Suit.Heart);
        System.out.println(first);

        Hand hand = new Hand();
        hand.add(new Card(6, Suit.Heart));
        hand.add(new Card(5, Suit.Diamond));
        hand.add(new Card(4, Suit.Spade));
        hand.add(new Card(3, Suit.Club));
        hand.print();
        hand.sort();
        hand.print();
        System.out.println(hand.value());

        Hand hand2 = new Hand();
        hand2.add(new Card(11, Suit.Heart));
        hand2.add(new Card(12, Suit.Diamond));
        hand2.add(new Card(13, Suit.Spade));
        hand2.add(new Card(14, Suit.Club));

        int comparison = hand.compareTo(hand2);
        if (comparison < 0) {
            System.out.println("Better hand is");
            hand2.print();
        }
        else if (comparison > 0) {
            System.out.println("Better hand is");
            hand.print();
        }
        else {
            System.out.println("Hands are equal");
        }

        System.out.println("Sorting cards by suit");
        List<Card> cards = new ArrayList<>();
        cards.add(new Card(1, Suit.Heart));
        cards.add(new Card(2, Suit.Spade));
        cards.add(new Card(15, Suit.Diamond));
        cards.add(new Card(16, Suit.Club));
        cards.add(new Card(12, Suit.Spade));
        cards.add(new Card(6, Suit.Heart));
        cards.add(new Card(4, Suit.Diamond));
        cards.add(new Card(4, Suit.Club));

        System.out.println("Initial cards");
        System.out.println(cards);

//        Collections.sort(cards, new SortBySuit());
//        System.out.println(cards);

        Comparator<Card> BySuitInValueOrder = Comparator.
                                                comparing(Card::getSuit).
                                                thenComparing(Card::getValue);

        Collections.sort(cards, BySuitInValueOrder);
        System.out.println("Cards after sorting");
        System.out.println(cards);



    }
}

package sortThemCards;

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
    }
}

package CSE203.lab5.p4;

import java.util.ArrayList;
import java.util.List;

public class CardPlayer {
    private List<Card> hand = new ArrayList<>();

    public void getCard(Card c) {
        hand.add(c);
    }

    public void showCards() {
        for (Card c : hand) {
            System.out.println(c);
        }
    }
}

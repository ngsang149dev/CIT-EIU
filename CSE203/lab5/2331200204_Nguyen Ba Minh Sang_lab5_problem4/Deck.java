package CSE203.lab5.p4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    
    private List<Card> deck = new ArrayList<>();

    private String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
    private String[] faces = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    public Deck() {
        for (int i = 0; i < suits.length;i++) {
            for (int j = 0; j < faces.length;j++) {
                Card card = new Card(suits[i], faces[j]);
                deck.add(card);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public Card deal() {
        return deck.remove(0);
    }
}

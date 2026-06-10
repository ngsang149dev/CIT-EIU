package CSE203.lab5.p4;

public class Card {
    private String suit;
    private String face;   

    public Card(String suit, String face) {
        this.suit = suit;
        this.face = face;
    }

    public String toString() {
        return "%s of %s".formatted(this.face, this.suit);
    }
}

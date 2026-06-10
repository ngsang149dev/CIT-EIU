package CSE203.lab5.p4;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        Deck deck = new Deck();
        CardPlayer player = new CardPlayer();
        deck.shuffle();
        for (int i = 0;i < n;i++) {
            Card c = deck.deal();
            player.getCard(c);
        }
        player.showCards();
    }
}

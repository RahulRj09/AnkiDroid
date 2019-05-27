package ankidroid;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    public String deckName;
    private final List<Card> cards = new ArrayList<>();
    public static int numberOfCards = 0;

    public Deck(String deckName) {
        this.deckName = deckName;
    }

    public void addCard(String front, String back) {
        numberOfCards++;
        Card create = new Card(front, back);
        cards.add(create);
    }

    public List<Card> getCards() {
        return cards;
    }

    public static int getNumberOfCards() {
        return numberOfCards;
    }
}
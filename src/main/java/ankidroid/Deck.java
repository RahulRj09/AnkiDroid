package ankidroid;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    public String deckName;
    private final List<Card> cards = new ArrayList<>();

    public Deck(String deckName) {
        this.deckName = deckName;
    }

    public void createCard(String front, String back) {
        Card create = new Card(front, back);
        cards.add(create);
    }

    public List<Card> getCards() {
        return cards;
    }
}
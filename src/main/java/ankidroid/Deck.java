package ankidroid;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Deck {
    public String name;
    private List<Card> cards = new ArrayList<>();

    public Deck(String name) {
        this.name = name;
    }

    public void addCard(String front, String back) {
        Card create = new Card(front, back);
        cards.add(create);
        JsonReaderWriter.write(cards);
    }

    public List<Map<String, Object>> getCards() {
        return JsonReaderWriter.read();
    }


}


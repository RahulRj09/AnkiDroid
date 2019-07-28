package ankidroid;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

public class Deck {
    public String name;
    private List<Card> cards = new ArrayList<>();

    public Deck(String name) {
        this.name = name;
    }

    public void addCard(String front, String back) {
        Card create = new Card(front, back);
        cards.add(create);
        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.writeValue(new File("/Users/rahul.joshi/ankidroidd/src/main/java/ankidroid/cards.json"),
                    cards);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public List<Card> getCards() {
        return cards;
    }

}
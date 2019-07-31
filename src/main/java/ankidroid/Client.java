package ankidroid;


import java.util.List;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        Deck deck = new Deck("Technical");
        deck.addCard("rahul", "joshi");
        deck.addCard("rahul1", "joshi1");
        List<Map<String, Object>> cards = deck.getCards();
        for (Map<String, Object> cardsData : cards) {
            for (Map.Entry<String, Object> cardFrontBack : cardsData.entrySet()) {
                System.out.println(cardFrontBack.getKey() + " - " + cardFrontBack.getValue());
            }
        }
    }
}

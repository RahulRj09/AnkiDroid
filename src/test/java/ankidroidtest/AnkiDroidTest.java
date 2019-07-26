package ankidroidtest;

import ankidroid.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AnkiDroidTest {
    @Test
    public void shouldCreateDeck() {
        Deck deck = new Deck("Technical");
        assertEquals("Technical", deck.name);
    }

    @Test
    public void shouldAddCard() {
        Card card = new Card("front", "back");
        assertEquals("front , back", card.toString());
    }

    @Test
    public void shouldAddCardInDeck() {
        List<Card> expectedCards = new ArrayList<>();
        Deck deck = new Deck("Technical");
        Card card = new Card("front", "back");
        deck.addCard("front", "back");
        expectedCards.add(card);
        assertEquals(expectedCards, deck.getCards());
    }

}

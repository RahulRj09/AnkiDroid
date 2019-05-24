package ankidroidtest;

import ankidroid.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnkiDroidTest {
    @Test
    public void ShouldCreateDeck() {
        Deck deck = new Deck("Technical");
        assertEquals("Technical", deck.deckName);
    }
    @Test
    public void ShouldAddCard() {
        Card card = new Card("front", "back");
        assertEquals("front , back",card.toString());
    }

}

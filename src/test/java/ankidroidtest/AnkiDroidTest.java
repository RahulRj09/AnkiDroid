package ankidroidtest;

import ankidroid.Card;
import ankidroid.Deck;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnkiDroidTest {
    @Test
    public void itShouldBeCreateDeckOrNot() {
        Deck deck = new Deck("Technical");
        assertEquals("Technical", deck.deckName);
    }
}

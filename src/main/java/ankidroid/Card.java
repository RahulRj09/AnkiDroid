package ankidroid;

import java.util.Objects;

public class Card {
    public String front;
    public String back;

    public Card(String front, String back) {
        this.front = front;
        this.back = back;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(front, card.front) &&
                Objects.equals(back, card.back);
    }

    @Override
    public String toString() {
        return front + " , " + back;
    }
}

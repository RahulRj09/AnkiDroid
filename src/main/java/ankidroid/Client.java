package ankidroid;


import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Deck deck = new Deck("Technical");
        deck.addCard("rahul","joshi");
        deck.addCard("rahul1","joshi1");
        for (Card cards: deck.getCards()) {
            Scanner input = new Scanner(System.in);
            System.out.println(cards.front);
            System.out.println("Show Answer");
            String  showAnswer = input.nextLine();
            System.out.println(cards.back);
            String difficultlyLevel = input.nextLine();
        }

    }
}

import java.util.*;

public class Deck {
    List<Card> deckOfCards;
    public Deck() {
        deckOfCards = new ArrayList<Card>();

    int i = 0;
    while (i < 52) {
        for(Suits s : Suits.values()) {
            for(Ranks r : Ranks.values()) {
                deckOfCards.add(new Card(s, r));
                i++;
            }
        }
    }

    }

    public void displayDeck() {
        for(Card c : deckOfCards) {
            System.out.println(c);
        }
    }

    public void sortSuit() {
        Collections.sort(deckOfCards, Card.suitComparator);
        displayDeck();
    }

    public void sortRank() {
        Collections.sort(deckOfCards, Card.rankComperator);
        displayDeck();
    }

}

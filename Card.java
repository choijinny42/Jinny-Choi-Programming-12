import java.util.Comparator;

public class Card implements Comparable<Card> {
    Suits suit;
    Ranks rank;

    public Card(Suits suit, Ranks rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Ranks getRank () {
        return rank;
    }

    public Suits getSuit () {
        return suit;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", rank=" + rank +
                '}';
    }

    public static Comparator<Card> suitComparator =
        new Comparator<Card>() {
        public int compare(Card c, Card c1) {
            return c.suit.ordinal() - c1.suit.ordinal();
        }
        };

    @Override
    public int compareTo(Card c1) {
        return this.rank.ordinal() - c1.rank.ordinal();
    }

    public static Comparator<Card> rankComperator =
            new Comparator<Card>() {
                @Override
                public int compare(Card o1, Card o2) {
                    return o1.rank.ordinal() - o2.rank.ordinal();
                }
            };
}

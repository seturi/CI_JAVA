import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Card> cards;
    
    public Deck() {
        cards = new ArrayList<Card>();
    }
    
    public ArrayList<Card> getCards() {
        return cards;
    }
    
    public void addCard(Card card) {
        cards.add(card);
    }
    
    public void print() {
        for(Card card:cards) {
            System.out.println(card.toString());
        }
    }
    
    public void shuffle() {
        Random random = new Random();
        for (int i = 0; i < cards.size(); i++) {
            Card temp = cards.get(i);
            int index = random.nextInt(cards.size());
            cards.set(i, cards.get(index));
            cards.set(index, temp);
        }
    }
    
    public Deck deal(int count) {
        Deck hand = new Deck();
        if (count == 5) {
            for (int i = 1; i <= count; i++) {
                int lastIndex = cards.size() - 1;
                hand.addCard(cards.remove(lastIndex));
            }
        }
        return hand;
    }
}
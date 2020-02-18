public class Card {
    public final int suitNumber; // 카드 모양
    public final int rankNumber; // 카드 값

    public Card(int suitNumber, int rankNumber) {
        this.suitNumber = suitNumber;
        this.rankNumber = rankNumber;
    }

    public String getSuit() {
        switch (this.suitNumber) {
            case 1:
                return "Clubs";
            case 2:
                return "Hearts";
            case 3:
                return "Diamonds";
            case 4:
                return "Spades";
            default:
                return "";
        }
    }

    public String getRank() {
        switch (this.rankNumber) {
            case 1:
                return "Ace";
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            case 13:
                return "King";
            default:
                return String.valueOf(this.rankNumber);
        }
    }

    @Override
    public String toString() {
        return getRank() + " of " + getSuit();
    }
}
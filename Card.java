public class Card {
    private final Suit suit;
    private final FaceValue faceValue;
    public Card(FaceValue faceValue, Suit suit) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    public Suit suit() {
        return this.suit;
    }

    public FaceValue faceValue() {
        return this.faceValue;
    }

}

package idatx2001.oblig3.cardgame;
import java.util.ArrayList;
import java.util.Random;

public class DeckOfCards {
    private final char[] suit = { 'S', 'H', 'D', 'C' };
    private final PlayingCard[] deckOfCards = new PlayingCard[52];
    private Random random = new Random();

    public DeckOfCards(){
        int counter = 0;
        for (char c : suit) {
            for (int i = 1; i <= 13; i++) {
                deckOfCards[counter] = new PlayingCard(c,i);
                counter += 1;
            }
        }
    }

    public String getCard(int index){
        return deckOfCards[index].getAsString();
    }

    public ArrayList<PlayingCard> dealHand(int n) throws IllegalArgumentException {
        if (n < 1 || n > 52) {
            throw new IllegalArgumentException("Please select a number between 1 and 52.");
        }
        ArrayList<PlayingCard> addToHand = new ArrayList<>();
        PlayingCard newCard;
        for(int i = 0; i < n; i++) {
            newCard = deckOfCards[random.nextInt(52)];
            if(addToHand.contains(newCard)) {
                i -= 1;
            } else {
                addToHand.add(newCard);
            }
        }
        return addToHand;
    }
}

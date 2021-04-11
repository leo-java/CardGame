package idatx2001.oblig3.cardgame;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class DeckOfCards {
    private final char[] suit = { 'S', 'H', 'D', 'C' };
    private final ArrayList<PlayingCard> deckOfCards = new ArrayList<>();
    private Random random = new Random();

    public DeckOfCards(){
        for (char c : suit) {
            for (int i = 1; i <= 13; i++) {
                deckOfCards.add(new PlayingCard(c,i));
            }
        }
    }

    public String getCard(int index){
        return deckOfCards.get(index).getAsString();
    }

    public ArrayList<PlayingCard> dealHand(int n){
        ArrayList<PlayingCard> addToHand = new ArrayList<>();
        PlayingCard newCard;
        for(int i = 0; i < n; i++) {
            int number = random.nextInt(deckOfCards.size());
            addToHand.add(deckOfCards.get(number));
            deckOfCards.remove(number);
        }
        return addToHand;
    }
}

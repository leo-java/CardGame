package idatx2001.oblig3.cardgame;
import java.util.ArrayList;
import java.util.Arrays;
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
}

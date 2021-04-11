package idatx2001.oblig3.cardgame;

import java.util.ArrayList;

public class Hand {

    private final ArrayList<PlayingCard> hand;

    public Hand(ArrayList<PlayingCard> hand) {
        this.hand = hand;
    }

    public ArrayList<PlayingCard> getHand() {
        return hand;
    }

    public PlayingCard getCardAt(int index) {
        return hand.get(index);
    }
}


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

    public int sumCheck(){
        return hand.stream().map(PlayingCard::getFace).reduce(Integer::sum).get();
    }

    public String heartsCheck(){
        StringBuilder heartCheck = new StringBuilder();
        hand.stream().filter(p -> p.getSuit() == 'H').forEach(p -> heartCheck.append(p.getAsString() + ", "));
        if(heartCheck.equals("")){
            return "No Hearts";
        }
        return heartCheck.toString();
    }

    public String queenOfSpadesCheck(){
        if (hand.stream().anyMatch(playingCard -> playingCard.getAsString().equalsIgnoreCase("S12"))) {
            return "Yes";
        }else{
            return "No";
        }
    }
    public String flushCheck(){
        if (hand.stream().allMatch(a -> a.getSuit() == hand.get(0).getSuit())){
            return "Yes";
        }else{
            return "No";
        }
    }
}


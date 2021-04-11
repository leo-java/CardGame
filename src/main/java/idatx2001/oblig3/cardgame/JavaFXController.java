package idatx2001.oblig3.cardgame;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.FileNotFoundException;
import java.util.Objects;

public class JavaFXController {

    private final DeckOfCards deck = new DeckOfCards();
    private Hand hand;

    @FXML
    private ImageView card0;

    @FXML
    private ImageView card1;

    @FXML
    private ImageView card2;

    @FXML
    private ImageView card3;

    @FXML
    private ImageView card4;

    @FXML
    private TextField sumOfFaces;

    @FXML
    private TextField cardsOfHearts;

    @FXML
    private TextField flush;

    @FXML
    private TextField queenOfSpades;

    @FXML
    private Button dealHand;

    @FXML
    private Button checkHand;

    public void dealHandButtonOnClick(){
        dealHand();
        try {
            displayCards();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        sumOfFaces.setText(Integer.toString(hand.sumCheck()));
        cardsOfHearts.setText(hand.heartsCheck());
        flush.setText(hand.flushCheck());
        queenOfSpades.setText(hand.queenOfSpadesCheck());
    }

    public void dealHand(){
        this.hand = new Hand(deck.dealHand(5));
        System.out.println("Dealt hand " + hand.getCardAt(0).getAsString() +
                hand.getCardAt(1).getAsString() +
                hand.getCardAt(2).getAsString() +
                hand.getCardAt(3).getAsString() +
                hand.getCardAt(4).getAsString());
    }

    public void displayCards() throws FileNotFoundException{
        //DisplayCards fungerer ikke pga noe merkelig med path, alle paths som ble forsøkt ga feilmelding
        /*card1.setImage(new Image(Objects.requireNonNull(this.getClass().getResourceAsStream("/cards/PNG/" +
                hand.getCardAt(1).getAsString() + ".png"))));
        card2.setImage(new Image(Objects.requireNonNull(this.getClass().getResourceAsStream("/cards/PNG/" +
                hand.getCardAt(2).getAsString() + ".png"))));
        card3.setImage(new Image(Objects.requireNonNull(this.getClass().getResourceAsStream("/cards/PNG/" +
                hand.getCardAt(3).getAsString() + ".png"))));
        card4.setImage(new Image(Objects.requireNonNull(this.getClass().getResourceAsStream("/cards/PNG/" +
                hand.getCardAt(4).getAsString() + ".png"))));*/
    }
}

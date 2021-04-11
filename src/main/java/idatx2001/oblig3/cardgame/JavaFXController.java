package idatx2001.oblig3.cardgame;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import java.io.FileNotFoundException;

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
}

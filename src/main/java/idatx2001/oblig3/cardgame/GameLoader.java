package idatx2001.oblig3.cardgame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GameLoader extends Application{

        @Override
        public void start(Stage stage) throws Exception {
            FXMLLoader loader = new FXMLLoader();
            Parent root = loader.load(getClass().getClassLoader().getResource("JavaFXML.fxml"));
            stage.setScene(new Scene(root));
            stage.show();
        }

        public static void main(String[] args) {
            launch(args);
        }
}

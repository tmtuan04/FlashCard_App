package example.demo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

import java.net.URL;
import java.util.ResourceBundle;

public class AddCardController implements Initializable {

//  Chỉ là demo thêm Deck
    @FXML
    private ComboBox<String> selectDeck;



    private String[] deckListItem = {"Deck 1", "Deck 2", "Deck 3", "Deck 4"};

    public void initialize(URL arg0, ResourceBundle arg1) {
        selectDeck.getItems().addAll(deckListItem);
    }
}

package example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import model.TableViewMain;
import model.TableViewMain;

public class DeckInforController {

    @FXML
    private Button backButton;

    @FXML
    private Pane contextPane;

    @FXML
    private Label customLabel;

    @FXML
    private Label deckName;

    @FXML
    private Label deleteDeckLabel;

    @FXML
    private Label dueLabel;

    @FXML
    private Button learnButton;

    @FXML
    private Label learnedLabel;

    @FXML
    private Label newLabel;

    @FXML
    private Button testButton;

    @FXML
    private Label valueDue;

    @FXML
    private Label valueLearned;

    @FXML
    private Label valueNew;

    public void setDeckInfo(TableViewMain deckInfo) {
        deckName.setText(deckInfo.getNameColumn());
        valueNew.setText(String.valueOf(deckInfo.getNewColumn()));
        valueLearned.setText(String.valueOf(deckInfo.getLearnedColumn()));
        valueDue.setText(String.valueOf(deckInfo.getDueColumn()));
    }

}

package example.demo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.TableViewAddCard;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class AddCardController implements Initializable {

//  Chỉ là demo
//  Ở đây mình demo thêm cards vào table ở cửa sổ Add Card
    @FXML
    private ComboBox<String> selectDeck;

    @FXML
    private TableView<TableViewAddCard> tableView;

    @FXML
    private TableColumn<TableViewAddCard, Integer> sttCards;

    @FXML
    private TableColumn<TableViewAddCard, String> frontCards;

    @FXML
    private TableColumn<TableViewAddCard, String> backCards;

//   Ở đây tham khảo chatGPT, ta sẽ chọn Deck trong ComboBox thì nói mới hiển thị thông tin
    private Map<String, ObservableList<TableViewAddCard>> deckData;

    public AddCardController() {
        deckData = new HashMap<>();
        deckData.put("Deck 1", FXCollections.observableArrayList(
                new TableViewAddCard(1, "Hello", "Xin chào"),
                new TableViewAddCard(2, "Add", "Cộng, thêm"),
                new TableViewAddCard(3, "Setting", "Cài đặt")
        ));
        deckData.put("Deck 2", FXCollections.observableArrayList(
                new TableViewAddCard(1, "Goodbye", "Tạm biệt"),
                new TableViewAddCard(2, "Subtract", "Trừ"),
                new TableViewAddCard(3, "Options", "Tùy chọn")
        ));
        deckData.put("Deck 3", FXCollections.observableArrayList(
                new TableViewAddCard(1, "Please", "Vui lòng"),
                new TableViewAddCard(2, "Multiply", "Nhân"),
                new TableViewAddCard(3, "Settings", "Cài đặt")
        ));
        deckData.put("Deck 4", FXCollections.observableArrayList(
                new TableViewAddCard(1, "Thanks", "Cảm ơn"),
                new TableViewAddCard(2, "Divide", "Chia"),
                new TableViewAddCard(3, "Preferences", "Sở thích")
        ));
    }

//    Ở đây sẽ khác ở Hello Controller vì mình đã đặt tên biến khác

    private String[] deckListItem = {"Deck 1", "Deck 2", "Deck 3", "Deck 4"};


    public void initialize(URL arg0, ResourceBundle arg1) {
//      Nhưng mà như này chỉ là hiện thị mặc định, chứ không phải chọn rồi nó mới hiển thị
        sttCards.setCellValueFactory(new PropertyValueFactory<>("STT"));
        frontCards.setCellValueFactory(new PropertyValueFactory<>("front"));
        backCards.setCellValueFactory(new PropertyValueFactory<>("back"));

        selectDeck.getItems().addAll(deckListItem);

//      Mình cũng chưa hiểu cái này lắm
        selectDeck.setOnAction(event -> {
            String selectedDeck = selectDeck.getSelectionModel().getSelectedItem();
            if (selectedDeck != null && deckData.containsKey(selectedDeck)) {
                tableView.setItems(deckData.get(selectedDeck));
            }
        });
    }
}

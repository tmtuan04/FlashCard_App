package example.demo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.TableViewMain;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private TableView<TableViewMain> tableView;

    @FXML
    private TableColumn<TableViewMain, String> nameColumn;

    @FXML
    private TableColumn<TableViewMain, Integer> newColumn;

    @FXML
    private TableColumn<TableViewMain, Integer> leanedColumn;

    @FXML
    private TableColumn<TableViewMain, Integer> dueColumn;

    ObservableList<TableViewMain> list = FXCollections.observableArrayList(
            new TableViewMain("Deck 1", 1, 2, 3),
            new TableViewMain("Deck 2", 2, 3, 4),
            new TableViewMain("Deck 3", 3, 4, 5)
    );

    public void initialize(URL arg0, ResourceBundle arg1) {
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("nameColumn"));
        newColumn.setCellValueFactory(new PropertyValueFactory<>("newColumn"));
        leanedColumn.setCellValueFactory(new PropertyValueFactory<>("leanedColumn"));
        dueColumn.setCellValueFactory(new PropertyValueFactory<>("dueColumn"));
        tableView.setItems(list);
    }

    @FXML
    public void switchtoSettings(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Settings.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Settings");
        stage.show();
    }

    @FXML
    public void switchtoAddCard(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddCard.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Add Card");
        stage.show();
    }
}
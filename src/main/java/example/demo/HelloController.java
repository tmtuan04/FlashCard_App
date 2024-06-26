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
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.stage.Stage;
import model.TableViewMain;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

// Lớp này chịu trách nghiệm cho MainWindow

//  Interface Initializable nằm trong gói FXML

public class HelloController implements Initializable {

    @FXML
    private TableView<TableViewMain> tableView;

    @FXML
    private TableColumn<TableViewMain, String> nameColumn;

    @FXML
    private TableColumn<TableViewMain, Integer> newColumn;

    @FXML
    private TableColumn<TableViewMain, Integer> learnedColumn;

    @FXML
    private TableColumn<TableViewMain, Integer> dueColumn;

//  ObservableList là một interface thuộc javafx.collections
//  Đại diện cho một danh sách có thể quan sát được
//  Liên quan đến giao diện GUI => Giao diện người dùng cần được cập nhật động dựa trên dữ liệu
//  Khởi tạo ObservableList bằng cách sử dụng lớp tiện ích FXCollections

    ObservableList<TableViewMain> list = FXCollections.observableArrayList(
            new TableViewMain("Deck 1", 1, 2, 3),
            new TableViewMain("Deck 2", 2, 3, 4),
            new TableViewMain("Deck 3", 3, 4, 5),
            new TableViewMain("Deck 4", 4, 5, 6),
            new TableViewMain("Deck 5", 5, 6, 7)
    );
//  Phương thức này thiết lập ban đầu cho các thành phần của giao diện người dùng
//  URL: chỉ định vị trí của file FXML
//  ResourceBundle chứa các tài nguyên quốc tế hoá

    public void initialize(URL arg0, ResourceBundle arg1) {
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("nameColumn"));
        newColumn.setCellValueFactory(new PropertyValueFactory<>("newColumn"));
        learnedColumn.setCellValueFactory(new PropertyValueFactory<>("learnedColumn"));
        dueColumn.setCellValueFactory(new PropertyValueFactory<>("dueColumn"));
        tableView.setItems(list);

        // Thêm sự kiện bấm vào hàng
        tableView.setRowFactory(tv -> {
            TableRow<TableViewMain> row = new TableRow<>();
            row.setOnMouseClicked(event -> {
                if (!row.isEmpty() && event.getButton() == MouseButton.PRIMARY && event.getClickCount() == 2) {
                    TableViewMain clickedRow = row.getItem();
                    openDeckInforWindow(clickedRow);
                }
            });
            return row;
        });
    }

    private void openDeckInforWindow(TableViewMain selectedItem) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("DeckInfor.fxml"));
            Parent root = loader.load();

            // Lấy controller của DeckInfor.fxml
            DeckInforController controller = loader.getController();
            controller.setDeckInfo(selectedItem);

            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Deck Infor");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
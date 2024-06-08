package example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

// Giao diện này cung cấp phương thức initialize
// cho phép bạn khởi tạo các thành phần sau khi chúng đã được tải từ tệp FXML.

public class SettingsController implements Initializable {

//   Nút back ở góc trên

    @FXML
    private AnchorPane scenePane;

    @FXML
    public void backtoMainButton(ActionEvent event) throws IOException {
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();

//        Thêm cửa sổ cảnh báo, nếu có sự thay đổi ở cài đặt thì hỏi có lưu hay không
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Cài đặt");
        alert.setHeaderText("Bạn đã thay đổi phần cài đặt");
        alert.setContentText("Bạn có muốn lưu lại thay đổi không?");
        if (alert.showAndWait().get() == ButtonType.OK) {
            stage = (Stage)scenePane.getScene().getWindow();
            stage.close();
        }
    }

//    Nút xác nhận
    @FXML
    private void confirmChanges(ActionEvent event) throws IOException {
//        Lấy cửa sổ hiện tại
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.close();
    }

//    Demo chọn ngôn ngữ với ChoiceBox
    @FXML
    private ChoiceBox<String> languegeChoice;
    private String[] languageItem = {"Viet Nam", "English", "China"};

    public void initialize(URL arg0, ResourceBundle arg1) {
        languegeChoice.getItems().addAll(languageItem);
    }
}

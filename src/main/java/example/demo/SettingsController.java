package example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

// Giao diện này cung cấp phương thức initialize
// cho phép bạn khởi tạo các thành phần sau khi chúng đã được tải từ tệp FXML.

public class SettingsController implements Initializable {

    @FXML
    public void backtoMainButton(ActionEvent event) throws IOException {
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Image icon = new Image("/resources/assets/png/settings3.png");
        stage.getIcons().add(icon);
        stage.close();
    }

    @FXML
    private ChoiceBox<String> languegeChoice;
    private String[] languageItem = {"Viet Nam", "English", "China"};

    public void initialize(URL arg0, ResourceBundle arg1) {
        languegeChoice.getItems().addAll(languageItem);
    }
}

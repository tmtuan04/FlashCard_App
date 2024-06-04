package example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    // Cái này vẫn chỉ là chuyển scene, vẫn chưa phải là 2 window khác nhau


    public void switchtoSettings(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Settings.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
//        stage.setTitle("Settings");
        stage.setScene(scene);
        stage.show();
    }
}
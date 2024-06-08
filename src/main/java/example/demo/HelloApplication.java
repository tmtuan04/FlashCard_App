package example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MainView.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        String css = this.getClass().getResource("/css/main.css").toExternalForm();
        scene.getStylesheets().add(css);

        stage.setTitle("EngHUST");
        stage.getIcons().add(new Image("/src/main/resources/assets/png/logo.png"));

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

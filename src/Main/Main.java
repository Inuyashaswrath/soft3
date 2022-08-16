package Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../Views/Main.fxml"));
        stage.setTitle("practice table");
        stage.setScene(new Scene(root));
        stage.show();
    }

   // public static void Main(String[] args) { }
}
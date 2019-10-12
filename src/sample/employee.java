package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class employee extends Application {

    public Scene employeeScene;

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Employees");
        primaryStage.setScene(employeeScene);
        primaryStage.show();
    }

    private Scene employeeScene() throws IOException
    {
        AnchorPane ap = new AnchorPane();

        employeeScene = new Scene(ap, 1025, 325);
        return employeeScene;
    }

    public static void main(String[] args) {
        launch(args);
    }
}

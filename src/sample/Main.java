package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private Button empButton;
    private Stage newStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Home Screen");


        // TEMPORARY BUTTON TO ACCESS EMPLOYEE PAGE
        HBox h = new HBox();
        h.getChildren().addAll(empButton);
        empButton = empButtonScene();

        Scene scene = new Scene(h,1025,325);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Button empButtonScene() throws IOException
    {
        empButton = new Button("EMPLOYEES");
        empButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                newStage = new Stage();
                employee e = new employee();
                newStage.setScene(e.employeeScene);
                newStage.setTitle("Employees");
                newStage.show();
            }
        });
        return empButton;
    }

    public static void main(String[] args) {
        launch(args);
    }
}

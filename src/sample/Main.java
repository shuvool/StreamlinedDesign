package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{



        FXMLLoader controllerLoader = new FXMLLoader(getClass().getResource("sample.fxml"));
        Parent root = controllerLoader.load();
        Scene controllerScene = new Scene(root, 475, 325);

        FXMLLoader customerFormControllerLoader = new FXMLLoader(getClass().getResource("customerFormController.fxml"));
        Parent customerFormPane = customerFormControllerLoader.load();
        Scene customerFormScene = new Scene(customerFormPane, 450, 450);

        Controller homePaneController = (Controller) controllerLoader.getController();
        homePaneController.setCustomerFormScene(customerFormScene);

        CustomerFormController customerFormController = (CustomerFormController) customerFormControllerLoader.getController();
        customerFormController.setControllerScene(controllerScene);

        primaryStage.setTitle("Home Screen");
        primaryStage.setScene(controllerScene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

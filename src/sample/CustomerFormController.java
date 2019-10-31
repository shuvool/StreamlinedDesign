package sample;

import java.awt.GridLayout;
import javax.swing.*;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Objects;
import java.util.ResourceBundle;

public class CustomerFormController implements Initializable{

    private Scene controllerScene;

    public void setControllerScene(Scene scene)
    {
        controllerScene = scene;
    }

    public void openFirstScene(ActionEvent actionEvent) {
        Stage primaryStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        primaryStage.setScene(controllerScene);
    }
    @FXML
    TextField firstName = new TextField();

    @FXML
    TextField lastName = new TextField();

    @FXML
    TextField streetNumber = new TextField();

    @FXML
    TextField streetName = new TextField();

    @FXML
    TextField city = new TextField();

    @FXML
    TextField state = new TextField();

    @FXML
    TextField zipCode = new TextField();

    @FXML
    Button submit = new Button();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        TableColumn<CustomerFormController, TextField> firstName = new TableColumn<>("First Name");
        firstName.setMinWidth(200);
        firstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));

        TableColumn<CustomerFormController, TextField> lastName = new TableColumn<>("Last Name");
        lastName.setMinWidth(200);
        lastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));

        TableColumn<CustomerFormController, TextField> streetNumber = new TableColumn<>("Street Number");
        streetNumber.setMinWidth(200);
        streetNumber.setCellValueFactory(new PropertyValueFactory<>("streetNumber"));

        TableColumn<CustomerFormController, TextField> streetName = new TableColumn<>("Street Name");
        streetName.setMinWidth(200);
        streetName.setCellValueFactory(new PropertyValueFactory<>("streetName"));

        TableColumn<CustomerFormController, TextField> city = new TableColumn<>("City");
        city.setMinWidth(200);
        city.setCellValueFactory(new PropertyValueFactory<>("city"));

        TableColumn<CustomerFormController, TextField> state = new TableColumn<>("State");
        state.setMinWidth(200);
        state.setCellValueFactory(new PropertyValueFactory<>("state"));

        TableColumn<CustomerFormController, TextField> zipCode = new TableColumn<>("Zip Code");
        zipCode.setMinWidth(200);
        zipCode.setCellValueFactory(new PropertyValueFactory<>("city"));

        /*TableView<CustomerFormController> newCustomerTable;
        newCustomerTable = new TableView<>();
        newCustomerTable.setItems(getCustomerFormController);*/

        ArrayList<String> newCustomerInfo = new ArrayList<>();


        submit.setOnAction(actionEvent ->
        {
            newCustomerInfo.add(firstName.toString());
            newCustomerInfo.add(lastName.toString());
            newCustomerInfo.add(streetName.toString());
            newCustomerInfo.add(streetNumber.toString());
            newCustomerInfo.add(city.toString());
            newCustomerInfo.add(state.toString());
            newCustomerInfo.add(zipCode.toString());

            new
        });

    }

    /*public ObservableList<CustomerFormController> getCustomerFormController()
    {
        ObservableList<CustomerFormController> customerInfo = FXCollections.observableArrayList();
        customerInfo.add(new CustomerFormController(firstName))
    }*/

}

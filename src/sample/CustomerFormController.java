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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
    Label fNameLabel = new Label();

    @FXML
    TextField lastName = new TextField();

    @FXML
    Label lNameLabel = new Label();

    @FXML
    TextField streetNumber = new TextField();

    @FXML
    Label sNumberLabel = new Label();

    @FXML
    TextField streetName = new TextField();

    @FXML
    Label sNameLabel = new Label();

    @FXML
    TextField city = new TextField();

    @FXML
    Label cityLabel = new Label();

    @FXML
    TextField state = new TextField();

    @FXML
    TextField zipCode = new TextField();

    @FXML
    Label zipCodeLabel = new Label();

    @FXML
    Button submit = new Button();

    public Connection conn = null;
    public PreparedStatement statement = null;


    //public void clickAddCustomer

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {


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

            String sql  = "Insert into Customer(firstName, lastName, streetName, streetNumber, city, state, zipCode) Values(?,?,?,?,?,?,?)";
            try
            {
                statement = conn.prepareStatement(sql);
                statement.setString(1, firstName.toString());
                statement.setString(2, lastName.toString());
                statement.setString(3, streetName.toString());
                statement.setString(4, streetNumber.toString());
                statement.setString(5, city.toString());
                statement.setString(6, state.toString());
                statement.setString(7, zipCode.toString());
            }

            catch (SQLException e)
            {
                e.printStackTrace();
            }


        });

    }



}

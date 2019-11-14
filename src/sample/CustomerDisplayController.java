package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class CustomerDisplayController implements Initializable
{
    @FXML
    Button filter = new Button();

    @FXML
    TextField fNameFilter = new TextField();

    @FXML
    TextField lNameFilter = new TextField();

    @FXML
    TextField custIdFilter = new TextField();

    @FXML
    TextField streetFilter = new TextField();

    @FXML
    TextField cityFilter = new TextField();

    @FXML
    TextField stateFilter = new TextField();

    @FXML
    TextField zipCodeFilter = new TextField();

    @FXML
    TextField phoneFilter = new TextField();

    @FXML
    CheckBox addressCheckBox = new CheckBox();

    @FXML
    CheckBox phoneCheckBox = new CheckBox();

    @FXML
    CheckBox notesCheckBox = new CheckBox();

    @FXML
    RadioButton activeButton = new RadioButton();

    @FXML
    RadioButton inactiveButton = new RadioButton();

    @FXML
    RadioButton allButton = new RadioButton();

    @FXML
    TableView customerTableView = new TableView();

    Connection conn = null;
    PreparedStatement stm = null;

    ArrayList<String> results = new ArrayList<>();

    public ObservableList<CustomerTableView> populateTableView(Connection con) throws SQLException
    {
        ObservableList<CustomerTableView> customerDisplayList = FXCollections.observableArrayList();

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT " +
                "CUST_ID as ID, " +
                "CUST_FNAME as FirstName, " +
                "CUST_LNAME as LastName, " +
                "CUST_STNUM + \" \" + CUST_STNAME as Address, " +
                "CUST_CITY as City, " +
                "CUST_STATE as State, " +
                "CUST_ZIP as PostalCode," +
                "CUST_PHONE as Phone" +
                "FROM CUST_TABLE" );

        while(rs.next())
        {
            customerDisplayList.add(new CustomerTableView(rs.getInt("ID"), rs.getString("FirstName"),
                    rs.getString("LastName"), rs.getString("Address"), rs.getString("City"),
                    rs.getString("State"), rs.getInt("PostalCode"), rs.getString("Phone")));
        }

        return customerDisplayList;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        filter.setOnAction(actionEvent ->
        {
            String queryString = "SELECT " +
                    "CUST_ID as ID, " +
                    "CUST_FNAME as FirstName, " +
                    "CUST_LNAME as LastName, " +
                    "CUST_STNUM + \" \" + CUST_STNAME as Address, " +
                    "CUST_CITY as City, " +
                    "CUST_STATE as State, " +
                    "CUST_ZIP as PostalCode," +
                    "CUST_PHONE as Phone" +
                    "FROM CUST_TABLE" +
                    " WHERE";
            if (fNameFilter.getText() != null)
            {
                queryString += " FirstName like '%" +fNameFilter+ "%'";
            }
            if (lNameFilter.getText() != null)
            {
                if (!queryString.endsWith("WHERE"))
                {
                    queryString += " AND";
                }
                queryString += " LastName like '%"+ lNameFilter+"%'";
            }
            if (custIdFilter.getText() != null)
            {
                if (!queryString.endsWith("WHERE"))
                {
                    queryString += " AND";
                }
                queryString += " ID like '%"+ custIdFilter +"%'";
            }
            if (streetFilter.getText() != null)
            {
                if (!queryString.endsWith("WHERE"))
                {
                    queryString += " AND";
                }
                queryString += " Address like '%"+ streetFilter +"%'";
            }
            if (cityFilter.getText() != null)
            {
                if (!queryString.endsWith("WHERE"))
                {
                    queryString += " AND";
                }
                queryString += " City like '%"+ cityFilter +"%'";
            }
            if (stateFilter.getText() != null)
            {
                if (!queryString.endsWith("WHERE"))
                {
                    queryString += " AND";
                }
                queryString += " State like '%"+ stateFilter +"%'";
            }
            if (zipCodeFilter.getText() != null)
            {
                if (!queryString.endsWith("WHERE"))
                {
                    queryString += " AND";
                }
                queryString += " PostalCode like '%"+ zipCodeFilter +"%'";
            }
            if (phoneFilter.getText() != null)
            {
                if (!queryString.endsWith("WHERE"))
                {
                    queryString += " AND";
                }
                queryString += " Phone like '%"+ phoneFilter +"%'";
            }

            //Run the query to get the filtered list

            //Repopulate the table
        });
    }


}

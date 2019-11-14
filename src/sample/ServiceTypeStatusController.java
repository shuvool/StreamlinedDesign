package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.scene.control.TableView;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ServiceTypeStatusController implements Initializable
{
    private Scene serviceTypeStatusControllerScene;

    public void setServiceTypeStatusControllerScene (Scene scene)
    {
        serviceTypeStatusControllerScene = scene;
    }

    public void openServiceTypeControllerScene (ActionEvent actionEvent)
    {
        Stage primaryStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        primaryStage.setScene(serviceTypeStatusControllerScene);
    }

    @FXML
    TableView tableView = new TableView();

    @FXML
    Button serviceType = new Button();

    @FXML
    Button serviceStatus = new Button();

    public Connection conn = null;
    public PreparedStatement statement = null;

    ArrayList<String> results = new ArrayList<>();

    public ObservableList<ServiceStatusTableView> populateTableView(Connection con) throws SQLException
    {
        ObservableList<ServiceStatusTableView> serviceStatusList = FXCollections.observableArrayList();

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT CUST_ID, CUST_FNAME, CUST_LNAME, CUST_STNUM, CUST_STNAME, CUST_CITY, ServStat_Desc FROM" +
                "                    CUST_TABLE INNER JOIN Job ON CUST_TABLE.CUST_ID = Job.Cust_ID"+
                "                    INNER JOIN Job_Service ON Job.Job_ID = Job_Service.Job_ID"+
                "                    INNER JOIN Service ON Job_Service.Serv_ID = Service.Serv_ID" +
                "                    INNER JOIN Service_Status ON Service.ServStat_ID = Service_Status.ServStat_ID");

        while(rs.next())
        {
            serviceStatusList.add(new ServiceStatusTableView(rs.getInt("CUST_ID"), rs.getString("CUST_FNAME"),
                    rs.getString("CUST_LNAME"), rs.getInt("CUST_STNUM"), rs.getString("CUST_STNAME"),
                    rs.getString("CUST_CITY"), rs.getString("ServStat_Desc")));
        }

        return serviceStatusList;
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {

        conn = DBConnection.dbConnection();

        Statement statement1;
        ResultSet result1;


        ObservableList<ServiceStatusTableView> serviceStatusList = null;
        try
        {
            serviceStatusList = populateTableView(conn);
        } catch (SQLException e)
        {
            e.printStackTrace();
        }

        ObservableList<TableColumn> columns = tableView.getColumns();
        columns.get(0).setCellValueFactory(new PropertyValueFactory("CUST_ID"));
        columns.get(1).setCellValueFactory(new PropertyValueFactory("CUST_FNAME"));
        columns.get(2).setCellValueFactory(new PropertyValueFactory("CUST_LNAME"));
        columns.get(3).setCellValueFactory(new PropertyValueFactory("CUST_STNUM"));
        columns.get(4).setCellValueFactory(new PropertyValueFactory("CUST_STNAME"));
        columns.get(5).setCellValueFactory(new PropertyValueFactory("CUST_CITY"));
        columns.get(6).setCellValueFactory(new PropertyValueFactory("ServStat_Desc"));
        tableView.setItems(serviceStatusList);





    }
}

package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class Controller implements Initializable
{
    @FXML
    Tab tabCustomers = new Tab();

    @FXML
    Tab tabEmployees = new Tab();

    @FXML
    Tab tabVendorsUtilities = new Tab();

    @FXML
    Tab tabMaintenance = new Tab();

    @FXML
    Tab tabExpenseReport = new Tab();

    @FXML
    Button customerAdd = new Button();

    @FXML
    Button customerServices = new Button();

    @FXML
    Button customerPayments = new Button();

    @FXML
    Button customerInvoices = new Button();

    @FXML
    Button customerUpdate = new Button();

    @FXML
    Button customerDelete = new Button();

    @FXML
    Button employeeAdd = new Button();

    @FXML
    Button employeeUpdate = new Button();

    @FXML
    Button employeeSchedule = new Button();

    @FXML
    Button employeePayments = new Button();

    @FXML
    Button employeeDelete = new Button();

    @FXML
    Button utilityAdd = new Button();

    @FXML
    Button vendorAdd = new Button();

    @FXML
    Button utilityPayments = new Button();

    @FXML
    Button vendorPayments = new Button();

    @FXML
    Button utilityHistory = new Button();

    @FXML
    Button vendorHistory = new Button();

    @FXML
    Button utilityDelete = new Button();

    @FXML
    Button vendorDelete = new Button();

    @FXML
    Button equipmentAdd = new Button();

    @FXML
    Button equipmentStatus = new Button();

    @FXML
    Button equipmentMaintenance = new Button();

    @FXML
    Button equipmentUpcoming = new Button();

    @FXML
    Button equipmentDelete = new Button();

    @FXML
    Button expenseReport = new Button();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        customerAdd.setOnAction(new EventHandler<>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                Parent root;
                try
                {
                    root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("customerAdd.fxml")), resourceBundle);
                    Stage customerAddStage = new Stage();
                    customerAddStage.setTitle("Add Customer");
                    customerAddStage.setScene(new Scene(root, 450, 450));
                    customerAddStage.show();
                    ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        });

        customerServices.setOnAction(new EventHandler<>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                Parent root;
                try
                {
                    root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("customerServices.fxml")), resourceBundle);
                    Stage customerServicesStage = new Stage();
                    customerServicesStage.setTitle("Add Customer");
                    customerServicesStage.setScene(new Scene(root, 450, 450));
                    customerServicesStage.show();
                    ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        });

        customerPayments.setOnAction(new EventHandler<>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                Parent root;
                try
                {
                    root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("customerPayments.fxml")), resourceBundle);
                    Stage customerPaymentsStage = new Stage();
                    customerPaymentsStage.setTitle("Add Customer");
                    customerPaymentsStage.setScene(new Scene(root, 450, 450));
                    customerPaymentsStage.show();
                    ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        });

        customerInvoices.setOnAction(new EventHandler<>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                Parent root;
                try
                {
                    root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("customerInvoices.fxml")), resourceBundle);
                    Stage customerInvoicesStage = new Stage();
                    customerInvoicesStage.setTitle("Add Customer");
                    customerInvoicesStage.setScene(new Scene(root, 450, 450));
                    customerInvoicesStage.show();
                    ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        });

        customerUpdate.setOnAction(new EventHandler<>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                Parent root;
                try
                {
                    root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("customerUpdate.fxml")), resourceBundle);
                    Stage customerUpdateStage = new Stage();
                    customerUpdateStage.setTitle("Add Customer");
                    customerUpdateStage.setScene(new Scene(root, 450, 450));
                    customerUpdateStage.show();
                    ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        });

        customerDelete.setOnAction(new EventHandler<>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                Parent root;
                try
                {
                    root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("customerDelete.fxml")), resourceBundle);
                    Stage customerDeleteStage = new Stage();
                    customerDeleteStage.setTitle("Add Customer");
                    customerDeleteStage.setScene(new Scene(root, 450, 450));
                    customerDeleteStage.show();
                    ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        });

        employeeAdd.setOnAction(new EventHandler<>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                Parent root;
                try
                {
                    root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("employeeAdd.fxml")), resourceBundle);
                    Stage employeeAddStage = new Stage();
                    employeeAddStage.setTitle("Add Customer");
                    employeeAddStage.setScene(new Scene(root, 450, 450));
                    employeeAddStage.show();
                    ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        });

        employeeUpdate.setOnAction(new EventHandler<>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                Parent root;
                try
                {
                    root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("employeeUpdate.fxml")), resourceBundle);
                    Stage employeeUpdateStage = new Stage();
                    employeeUpdateStage.setTitle("Add Customer");
                    employeeUpdateStage.setScene(new Scene(root, 450, 450));
                    employeeUpdateStage.show();
                    ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        });

        employeeSchedule.setOnAction(new EventHandler<>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                Parent root;
                try
                {
                    root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("employeeSchedule.fxml")), resourceBundle);
                    Stage employeeScheduleStage = new Stage();
                    employeeScheduleStage.setTitle("Add Customer");
                    employeeScheduleStage.setScene(new Scene(root, 450, 450));
                    employeeScheduleStage.show();
                    ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        });

        employeePayments.setOnAction(new EventHandler<>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                Parent root;
                try
                {
                    root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("employeePayments.fxml")), resourceBundle);
                    Stage employeePaymentsStage = new Stage();
                    employeePaymentsStage.setTitle("Add Customer");
                    employeePaymentsStage.setScene(new Scene(root, 450, 450));
                    employeePaymentsStage.show();
                    ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        });

        employeeDelete.setOnAction(new EventHandler<>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                Parent root;
                try
                {
                    root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("employeeDelete.fxml")), resourceBundle);
                    Stage employeeDeleteStage = new Stage();
                    employeeDeleteStage.setTitle("Add Customer");
                    employeeDeleteStage.setScene(new Scene(root, 450, 450));
                    employeeDeleteStage.show();
                    ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        });

        utilityAdd.setOnAction(new EventHandler<>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                Parent root;
                try
                {
                    root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("utilityAdd.fxml")), resourceBundle);
                    Stage utilityAddStage = new Stage();
                    utilityAddStage.setTitle("Add Customer");
                    utilityAddStage.setScene(new Scene(root, 450, 450));
                    utilityAddStage.show();
                    ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        });

        vendorAdd.setOnAction(new EventHandler<>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                Parent root;
                try
                {
                    root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("vendorAdd.fxml")), resourceBundle);
                    Stage vendorAddStage = new Stage();
                    vendorAddStage.setTitle("Add Customer");
                    vendorAddStage.setScene(new Scene(root, 450, 450));
                    vendorAddStage.show();
                    ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        });

        utilityPayments.setOnAction(new EventHandler<>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                Parent root;
                try
                {
                    root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("utilityPayments.fxml")), resourceBundle);
                    Stage utilityPaymentsStage = new Stage();
                    utilityPaymentsStage.setTitle("Add Customer");
                    utilityPaymentsStage.setScene(new Scene(root, 450, 450));
                    utilityPaymentsStage.show();
                    ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        });

        vendorPayments.setOnAction(new EventHandler<>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                Parent root;
                try
                {
                    root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("vendorPayments.fxml")), resourceBundle);
                    Stage vendorPaymentsStage = new Stage();
                    vendorPaymentsStage.setTitle("Add Customer");
                    vendorPaymentsStage.setScene(new Scene(root, 450, 450));
                    vendorPaymentsStage.show();
                    ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        });

        utilityHistory.setOnAction(new EventHandler<>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                Parent root;
                try
                {
                    root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("utilityHistory.fxml")), resourceBundle);
                    Stage utilityHistoryStage = new Stage();
                    utilityHistoryStage.setTitle("Add Customer");
                    utilityHistoryStage.setScene(new Scene(root, 450, 450));
                    utilityHistoryStage.show();
                    ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        });

        vendorHistory.setOnAction(new EventHandler<>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                Parent root;
                try
                {
                    root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("vendorHistory.fxml")), resourceBundle);
                    Stage vendorHistoryStage = new Stage();
                    vendorHistoryStage.setTitle("Add Customer");
                    vendorHistoryStage.setScene(new Scene(root, 450, 450));
                    vendorHistoryStage.show();
                    ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        });

        utilityDelete.setOnAction(new EventHandler<>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                Parent root;
                try
                {
                    root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("utilityDelete.fxml")), resourceBundle);
                    Stage utilityDeleteStage = new Stage();
                    utilityDeleteStage.setTitle("Add Customer");
                    utilityDeleteStage.setScene(new Scene(root, 450, 450));
                    utilityDeleteStage.show();
                    ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        });

        vendorDelete.setOnAction(new EventHandler<>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                Parent root;
                try
                {
                    root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("vendorDelete.fxml")), resourceBundle);
                    Stage vendorDeleteStage = new Stage();
                    vendorDeleteStage.setTitle("Add Customer");
                    vendorDeleteStage.setScene(new Scene(root, 450, 450));
                    vendorDeleteStage.show();
                    ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        });

        equipmentAdd.setOnAction(new EventHandler<>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                Parent root;
                try
                {
                    root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("equipmentAdd.fxml")), resourceBundle);
                    Stage equipmentAddStage = new Stage();
                    equipmentAddStage.setTitle("Add Customer");
                    equipmentAddStage.setScene(new Scene(root, 450, 450));
                    equipmentAddStage.show();
                    ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        });

        equipmentStatus.setOnAction(new EventHandler<>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                Parent root;
                try
                {
                    root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("equipmentStatus.fxml")), resourceBundle);
                    Stage equipmentStatusStage = new Stage();
                    equipmentStatusStage.setTitle("Add Customer");
                    equipmentStatusStage.setScene(new Scene(root, 450, 450));
                    equipmentStatusStage.show();
                    ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        });

        equipmentMaintenance.setOnAction(new EventHandler<>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                Parent root;
                try
                {
                    root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("equipmentMaintenance.fxml")), resourceBundle);
                    Stage equipmentMaintenanceStage = new Stage();
                    equipmentMaintenanceStage.setTitle("Add Customer");
                    equipmentMaintenanceStage.setScene(new Scene(root, 450, 450));
                    equipmentMaintenanceStage.show();
                    ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        });

        equipmentUpcoming.setOnAction(new EventHandler<>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                Parent root;
                try
                {
                    root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("equipmentUpcoming.fxml")), resourceBundle);
                    Stage equipmentUpcomingStage = new Stage();
                    equipmentUpcomingStage.setTitle("Add Customer");
                    equipmentUpcomingStage.setScene(new Scene(root, 450, 450));
                    equipmentUpcomingStage.show();
                    ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        });

        equipmentDelete.setOnAction(new EventHandler<>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                Parent root;
                try
                {
                    root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("equipmentDelete.fxml")), resourceBundle);
                    Stage equipmentDeleteStage = new Stage();
                    equipmentDeleteStage.setTitle("Add Customer");
                    equipmentDeleteStage.setScene(new Scene(root, 450, 450));
                    equipmentDeleteStage.show();
                    ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        });

        expenseReport.setOnAction(new EventHandler<>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                Parent root;
                try
                {
                    root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("expenseReport.fxml")), resourceBundle);
                    Stage expenseReportStage = new Stage();
                    expenseReportStage.setTitle("Add Customer");
                    expenseReportStage.setScene(new Scene(root, 450, 450));
                    expenseReportStage.show();
                    ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        });
    }
}

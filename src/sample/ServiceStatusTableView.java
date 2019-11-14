package sample;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ServiceStatusTableView
{
    public ServiceStatusTableView(int id, String fName, String lName, int streetNum, String streetName, String city, String statusDesc)
    {
        this.id = new SimpleIntegerProperty(id);
        this.fName = new SimpleStringProperty(fName);
        this.lName = new SimpleStringProperty(lName);
        this.streetNum = new  SimpleIntegerProperty(streetNum);
        this.streetName = new SimpleStringProperty(streetName);
        this.city = new SimpleStringProperty(city);
        this.statusDesc = new SimpleStringProperty(statusDesc);
    }

    private IntegerProperty id;
    public void setId(int value) { idProperty().set(value); }
    public int getId() { return idProperty().get(); }
    public IntegerProperty idProperty()
    {
        return id;
    }

    private StringProperty fName;
    public void setFName(String value) { fNameProperty().set(value); }
    public String getFName() {return fNameProperty().get(); }
    public StringProperty fNameProperty()
    {
        return fName;
    }

    private StringProperty lName;
    public void setLName(String value) { lNameProperty().set(value); }
    public String getLName() {return lNameProperty().get(); }
    public StringProperty lNameProperty()
    {
        return lName;
    }

    private IntegerProperty streetNum;
    public void setStreetNum(int value) { streetNumProperty().set(value); }
    public int getStreetNum() { return streetNumProperty().get(); }
    public IntegerProperty streetNumProperty()
    {
        return streetNum;
    }

    private StringProperty streetName;
    public void setStreetName(String value) { streetNameProperty().set(value); }
    public String getStreetName() {return streetNameProperty().get(); }
    public StringProperty streetNameProperty()
    {
        return streetName;
    }

    private StringProperty city;
    public void setCity(String value) { cityProperty().set(value); }
    public String getCity() {return cityProperty().get(); }
    public StringProperty cityProperty()
    {
        return city;
    }

    private StringProperty statusDesc;
    public void setStatusDesc(String value) { statusDescProperty().set(value); }
    public String getStatusDesc() {return statusDescProperty().get(); }
    public StringProperty statusDescProperty()
    {
        return statusDesc;
    }
}

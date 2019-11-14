package sample;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class CustomerTableView
{
    public CustomerTableView(int id, String fName, String lName, String address, String city, String state, int zipCode, String phone)
    {
        this.id = new SimpleIntegerProperty(id);
        this.fName = new SimpleStringProperty(fName);
        this.lName = new SimpleStringProperty(lName);
        this.address = new  SimpleStringProperty(address);
        this.city = new SimpleStringProperty(city);
        this.state = new SimpleStringProperty(state);
        this.zipCode = new SimpleIntegerProperty(zipCode);
        this.phone = new SimpleStringProperty(phone);
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

    private StringProperty address;
    public void setAddress(String value) { addressProperty().set(value); }
    public String getAddress() { return addressProperty().get(); }
    public StringProperty addressProperty()
    {
        return address;
    }

    private StringProperty city;
    public void setCity(String value) { cityProperty().set(value); }
    public String getCity() {return cityProperty().get(); }
    public StringProperty cityProperty()
    {
        return city;
    }

    private StringProperty state;
    public void setState(String value) { stateProperty().set(value); }
    public String getState() {return stateProperty().get(); }
    public StringProperty stateProperty()
    {
        return state;
    }

    private IntegerProperty zipCode;
    public void setZipCode(int value) { zipCodeProperty().set(value); }
    public int getZipCode() { return zipCodeProperty().get(); }
    public IntegerProperty zipCodeProperty() { return zipCode; }

    private StringProperty phone;
    public void setPhone(String value) { phoneProperty().set(value); }
    public String getPhone() {return phoneProperty().get(); }
    public StringProperty phoneProperty()
    {
        return phone;
    }
}


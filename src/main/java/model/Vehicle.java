package model;

public class Vehicle {

    int vehicle_id;
    String login;
    int user_id;
    String brand;
    String model;

    public Vehicle(String login, int user_id, String brand, String model) {
        this.login = login;
        this.user_id = user_id;
        this.brand = brand;
        this.model = model;
    }

    public Vehicle() {

    }

    public int getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(int vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "ID pojazdu: " + vehicle_id +
                ", Login użytkownika: " + login +
                ", Marka: " + brand +
                ", Model: " + model ;
    }
}

package model;

public class InsuranceOffer {

    int offer_id;
    int vehicle_id;
    int user_id;
    String insurer;
    int price;

    public InsuranceOffer(int vehicle_id, int user_id, String insurer, int price) {
        this.vehicle_id = vehicle_id;
        this.user_id = user_id;
        this.insurer = insurer;
        this.price = price;
    }

    public InsuranceOffer() {

    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getOffer_id() {
        return offer_id;
    }

    public void setOffer_id(int offer_id) {
        this.offer_id = offer_id;
    }

    public int getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(int vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public String getInsurer() {
        return insurer;
    }

    public void setInsurer(String insurer) {
        this.insurer = insurer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID oferty: " + offer_id +
                ", ID pojazdu: " + vehicle_id +
                ", Ubezpieczyciel: " + insurer  +
                ", Kwota: " + price;
    }
}

package Service;

import model.InsuranceOffer;
import model.Vehicle;
import util.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PrintStatement {

    static Connection connection = DatabaseConnection.getConnection();

    private List<Vehicle> getVehicles(int loginId) throws SQLException {
        String query = "SELECT * FROM vehicles WHERE user_id =?";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setInt(1, loginId);
        ResultSet rs = ps.executeQuery();
        List<Vehicle> filteredVehicles = new ArrayList<>();

        while (rs.next()) {
            Vehicle vehicle = new Vehicle();
            vehicle.setLogin(rs.getString("login"));
            vehicle.setUser_id(rs.getInt("user_id"));
            vehicle.setBrand(rs.getString("brand"));
            vehicle.setModel(rs.getString("model"));
            filteredVehicles.add(vehicle);
        }
        return filteredVehicles;
    }

    private List<InsuranceOffer> getOffers(int loginId) throws SQLException {
        String query = "SELECT * FROM insurance_offers WHERE user_id =?";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setInt(1, loginId);
        ResultSet rs = ps.executeQuery();
        List<InsuranceOffer> filteredOffers = new ArrayList<>();

        while (rs.next()){
            InsuranceOffer insuranceOffer = new InsuranceOffer();
            insuranceOffer.setVehicle_id(rs.getInt("vehicle_id"));
            insuranceOffer.setUser_id(rs.getInt("user_id"));
            insuranceOffer.setInsurer(rs.getString("insurer"));
            insuranceOffer.setPrice(rs.getInt("price"));
            filteredOffers.add(insuranceOffer);
        }
        return filteredOffers;

    }

    public void printLinkedToUser(int loginId) throws SQLException {

        System.out.println("Do użytkownika przypisane są w systemie następujące samochody:");
        List<Vehicle> ls = getVehicles(loginId);
        for (Vehicle v : ls) {
            System.out.println(v);
        }

        System.out.println("Do użytkownika przypisane są w systemie następujące oferty ubezpieczenia:");
        List<InsuranceOffer> lss = getOffers(loginId);
        for (InsuranceOffer v : lss) {
            System.out.println(v);
        }


    }


}

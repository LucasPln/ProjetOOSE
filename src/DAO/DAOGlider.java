package DAO;

import Model.Glider;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

public interface DAOGlider {
    ArrayList<Glider> getAllGliders();
    ArrayList<Glider> getGlidersFromCompany(int idCompany);
    void createGlider(String registrationID, float span, float maxWeight, java.sql.Date acquisitionDate,  java.sql.Date reviewDate, int companyID) throws SQLException;
    void deleteGlider(String id);
    Glider getGlider(String registrationGlider);
    void updateGlider(String registrationID, float span, float maxWeight, java.sql.Date reviewDate) throws SQLException;
}

package DAO;

import Model.Glider;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public interface DAOGlider {
    ArrayList<Glider> getAllGliders();
    ArrayList<Glider> getGlidersFromCompany(int idCompany);
    void createGlider(String registrationID, float span, float maxWeight, java.sql.Date acquisitionDate,  java.sql.Date reviewDate, int companyID) throws SQLException;
}

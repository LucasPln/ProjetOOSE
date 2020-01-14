package DAO;

import Model.Diploma;
import Model.Glider;

import java.sql.*;
import java.util.ArrayList;

/**
 * @author Hugo Niort
 */
public class DAOSqlGlider implements DAOGlider {

    @Override
    public ArrayList<Glider> getAllGliders() {
        ArrayList<Glider> listGlider = new ArrayList<>();

        Connection con = FactoryDAOSQL.connection;
        Statement stmt= null;

        try {
            stmt = con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from glider;");

            while(rs.next()){

                Glider glider = new Glider(
                        rs.getString(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getDate(5),
                        rs.getDate(6)

                );


                System.out.println("Glider créé");
                listGlider.add(glider);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listGlider;
    }

    @Override
    public ArrayList<Glider> getGlidersFromCompany(int idCompany) {
        Glider glider;
        ArrayList<Glider> gliders = new ArrayList<Glider>();
        try {
            Connection con = FactoryDAOSQL.connection;
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from glider where idCompany = " + idCompany);


            while(rs.next()){
                glider = new Glider(
                        rs.getString(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getDate(5),
                        rs.getDate(6)
                );
                System.out.println("Glider créé");
                gliders.add(glider);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return gliders;
    }

    @Override
    public void createGlider(String registrationID, float span, float maxWeight, java.sql.Date acquisitionDate,  java.sql.Date reviewDate, int companyID) throws SQLException {
        Connection con = FactoryDAOSQL.connection;
        PreparedStatement stmt=con.prepareStatement("INSERT INTO glider (registrationGlider, span, maxWeight, idCompany, acquisitionDate, reviewDate) VALUES (?, ?, ?, ?, ?, ?)");
        stmt.setString(1, registrationID);
        stmt.setFloat(2, span);
        stmt.setFloat(3, maxWeight);
        stmt.setInt(4, companyID);
        stmt.setDate(5, acquisitionDate);
        stmt.setDate(6, reviewDate);
        stmt.executeUpdate();
    }

    @Override
    public void deleteGlider(String id) {
        Connection con = FactoryDAOSQL.connection;
        try {
            PreparedStatement stmt=con.prepareStatement("DELETE FROM glider WHERE registrationGlider='" + id + "'");
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Glider getGlider(String registrationGlider) {
        Glider glider = null;
        try {
            Connection con = FactoryDAOSQL.connection;
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * FROM glider WHERE registrationGlider='" + registrationGlider + "'");

            while(rs.next()){
                glider = new Glider(
                        rs.getString(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getDate(5),
                        rs.getDate(6)
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return glider;
    }

    @Override
    public void updateGlider(String id, float span, float maxWeight, java.sql.Date reviewDate) throws SQLException {
        Connection con = FactoryDAOSQL.connection;
        PreparedStatement stmt=con.prepareStatement("UPDATE glider SET span = ?, maxWeight = ?, reviewDate = ? WHERE registrationGlider = '" + id +"'");
        stmt.setFloat(1, span);
        stmt.setFloat(2, maxWeight);
        stmt.setDate(3, reviewDate);
        stmt.executeUpdate();
    }
}

package DAO;

import Model.*;

import java.sql.*;
import java.util.ArrayList;

/**
 * The type Dao sql equipement.
 */
public class DAOSqlEquipement implements DAOEquipement {
    @Override
    public ArrayList<Battery> getAllBattery() {
        ArrayList<Battery> listBattery = new ArrayList<>();

        Connection con = FactoryDAOSQL.connection;
        Statement stmt= null;

        try {
            stmt = con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from battery;");

            while(rs.next()){
                Battery battery = new Battery(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getDate(4),
                        rs.getInt(5)
                );
                System.out.println("Battery créé");
                listBattery.add(battery);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listBattery;
    }

    @Override
    public ArrayList<GPS> getAllGPS() {
        ArrayList<GPS> listGPS = new ArrayList<>();

        Connection con = FactoryDAOSQL.connection;
        Statement stmt= null;

        try {
            stmt = con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from gps;");

            while(rs.next()){
                GPS gps = new GPS(
                        rs.getInt(1),
                        rs.getString(3),
                        rs.getString(2),
                        rs.getInt(4)
                );
                System.out.println("GPS créé");
                listGPS.add(gps);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listGPS;
    }

    @Override
    public String getNbEquipments(String item, int idCompany) {
        String res = "0";
        try {
            Connection con = FactoryDAOSQL.connection;
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select count(*) from " + item + " where idCompany = " + idCompany);
            while(rs.next()) {
                res = Integer.toString(rs.getInt(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public ArrayList<Equipment> getAllParachutesByCompanyId(int idCompany) {
        Parachute parachute = null;
        ArrayList<Equipment> parachutes = new ArrayList<Equipment>();
        try {
            Connection con = FactoryDAOSQL.connection;
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * FROM parachute WHERE IDcompany= " + idCompany);

            while(rs.next()){
                parachute = new Parachute(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getDate(3),
                        rs.getDate(4),
                        rs.getInt(5)
                );
                parachutes.add(parachute);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return parachutes;
    }

    @Override
    public ArrayList<Equipment> getAllBatteriesByCompanyId(int idCompany) {
        Battery battery = null;
        ArrayList<Equipment> batteries = new ArrayList<Equipment>();
        try {
            Connection con = FactoryDAOSQL.connection;
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * FROM battery WHERE IDcompany= " + idCompany);

            while(rs.next()){
                battery = new Battery(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getDate(4),
                        rs.getInt(5)
                );
                batteries.add(battery);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return batteries;
    }

    @Override
    public void deleteEquipment(String item, int id) {
        Connection con = FactoryDAOSQL.connection;
        try {
            PreparedStatement stmt=con.prepareStatement("DELETE FROM "+ item +" WHERE id" + item +"=" + id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void createBattery(String wording, int power, Date lastRefillDate, int idCompany) {
        Connection con = FactoryDAOSQL.connection;
        try {
            PreparedStatement stmt=con.prepareStatement("INSERT INTO battery (wording, power, lastRefillDate, idCompany) VALUES (?, ?, ?, ?)");
            stmt.setString(1, wording);
            stmt.setInt(2, power);
            stmt.setDate(3, lastRefillDate);
            stmt.setInt(4, idCompany);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void createGPS(String wording, String installedVersion, int idCompany) {
        Connection con = FactoryDAOSQL.connection;
        try {
            PreparedStatement stmt=con.prepareStatement("INSERT INTO gps (wording, installedVersion, idCompany) VALUES (?, ?, ?)");
            stmt.setString(1, wording);
            stmt.setString(2, installedVersion);
            stmt.setInt(3, idCompany);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void createParachute(String wording, Date renewalDate, Date packageDate, int idCompany) {
        Connection con = FactoryDAOSQL.connection;
        try {
            PreparedStatement stmt=con.prepareStatement("INSERT INTO parachute (wording, renewalDate, packageDate, idCompany) VALUES (?, ?, ?, ?)");
            stmt.setString(1, wording);
            stmt.setDate(2, renewalDate);
            stmt.setDate(3, packageDate);
            stmt.setInt(4, idCompany);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateParachute(int id, String wording, Date renewalDate, Date packageDate) throws SQLException {
        Connection con = FactoryDAOSQL.connection;
        PreparedStatement stmt=con.prepareStatement("UPDATE parachute SET wording = ?, renewalDate = ?, packageDate = ? WHERE idParachute = '" + id +"'");
        stmt.setString(1, wording);
        stmt.setDate(2, renewalDate);
        stmt.setDate(3, packageDate);
        stmt.executeUpdate();
    }

    @Override
    public void updateBattery(int id, String wording, int power, Date lastRefillDate) throws SQLException {
        Connection con = FactoryDAOSQL.connection;
        PreparedStatement stmt=con.prepareStatement("UPDATE battery SET wording = ?, power = ?, lastRefillDate = ? WHERE idBattery = '" + id +"'");
        stmt.setString(1, wording);
        stmt.setInt(2, power);
        stmt.setDate(3, lastRefillDate);
        stmt.executeUpdate();
    }

    @Override
    public void updateGPS(int id, String wording, String installedVersion) throws SQLException {
        Connection con = FactoryDAOSQL.connection;
        PreparedStatement stmt=con.prepareStatement("UPDATE gps SET wording = ?, installedVersion = ? WHERE idGps = '" + id +"'");
        stmt.setString(1, wording);
        stmt.setString(2, installedVersion);
        stmt.executeUpdate();
    }

    @Override
    public Parachute getParachute(int idEquipment) {
        Parachute parachute = null;
        try {
            Connection con = FactoryDAOSQL.connection;
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * FROM parachute WHERE idParachute= " + idEquipment);

            while(rs.next()){
                parachute = new Parachute(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getDate(3),
                        rs.getDate(4),
                        rs.getInt(5)
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return parachute;
    }

    @Override
    public GPS getGPS(int idEquipment) {
        GPS gps = null;
        try {
            Connection con = FactoryDAOSQL.connection;
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * FROM gps WHERE idGps= " + idEquipment);

            while(rs.next()){
                gps = new GPS(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4)
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return gps;
    }

    @Override
    public ArrayList<Equipment> getAllGpsByCompanyId(int idCompany) {
        GPS gps = null;
        ArrayList<Equipment> gpss = new ArrayList<Equipment>();
        try {
            Connection con = FactoryDAOSQL.connection;
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * FROM gps WHERE IDcompany= " + idCompany);

            while(rs.next()){
                gps = new GPS(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4)
                );
                gpss.add(gps);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return gpss;
    }
}

package DAO;

import Model.*;

import java.sql.*;
import java.util.ArrayList;

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

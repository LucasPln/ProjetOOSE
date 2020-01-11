package DAO;

import Model.Battery;
import Model.GPS;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
}

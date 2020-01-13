package DAO;

import Model.*;

import java.sql.*;
import java.util.ArrayList;

public class DAOSqlLauncher implements DAOLauncher {
    @Override
    public ArrayList<Plane> getAllPlane() {
        ArrayList<Plane> listPlane = new ArrayList<>();

        Connection con = FactoryDAOSQL.connection;
        Statement stmt= null;

        try {
            stmt = con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from plane;");

            while(rs.next()){
                Plane plane = new Plane(
                        rs.getString(1),
                        rs.getDate(4),
                        rs.getDate(5),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getInt(6),
                        rs.getInt(7)
                );
                System.out.println("Plane créé");
                listPlane.add(plane);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listPlane;
    }

    @Override
    public ArrayList<Wincher> getAllWincher() {
        ArrayList<Wincher> listWincher = new ArrayList<>();

        Connection con = FactoryDAOSQL.connection;
        Statement stmt= null;

        try {
            stmt = con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from winch;");

            while(rs.next()){
                Wincher wincher = new Wincher(
                        rs.getString(1),
                        rs.getDate(3),
                        rs.getDate(4),
                        rs.getInt(5),
                        rs.getInt(2),
                        rs.getDate(6),
                        rs.getDate(7),
                        rs.getInt(8)
                );
                System.out.println("Wincher créé");
                listWincher.add(wincher);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listWincher;
    }

    @Override
    public String getNbLaunchers(String type, int idCompany) {
        String res = "0";
        try {
            Connection con = FactoryDAOSQL.connection;
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select count(*) from " + type + " where idCompany = " + idCompany);
            while(rs.next()) {
                res = Integer.toString(rs.getInt(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public ArrayList<Launcher> getAllWinchesByCompanyId(int idCompany) {
        Wincher winch = null;
        ArrayList<Launcher> winches = new ArrayList<Launcher>();
        try {
            Connection con = FactoryDAOSQL.connection;
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * FROM winch WHERE IDcompany= " + idCompany);

            while(rs.next()){
                winch = new Wincher(
                        rs.getString(1),
                        rs.getDate(3),
                        rs.getDate(4),
                        rs.getInt(5),
                        rs.getInt(2),
                        rs.getDate(6),
                        rs.getDate(7),
                        rs.getInt(8)
                );
                winches.add(winch);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return winches;
    }

    @Override
    public ArrayList<Launcher> getAllPlanesByCompanyId(int idCompany) {
        Plane plane = null;
        ArrayList<Launcher> planes = new ArrayList<Launcher>();
        try {
            Connection con = FactoryDAOSQL.connection;
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * FROM plane WHERE IDcompany= " + idCompany);

            while(rs.next()){
                plane = new Plane(
                        rs.getString(1),
                        rs.getDate(4),
                        rs.getDate(5),
                        rs.getInt(3),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7)
                );
                planes.add(plane);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return planes;
    }

    @Override
    public void createPlane(String registrationPlane, int maxLaunchWeight, int idCompany, Date acquisitionDate, Date renewalDate, int span, int maxWeight) {
        Connection con = FactoryDAOSQL.connection;
        try {
            PreparedStatement stmt=con.prepareStatement("INSERT INTO plane (registrationPlane, maxLaunchWeight, idCompany, acquisitionDate, renewalDate, span, maxWeight) VALUES (?, ?, ?, ?, ? , ?, ?)");
            stmt.setString(1, registrationPlane);
            stmt.setInt(2, maxLaunchWeight);
            stmt.setInt(3, idCompany);
            stmt.setDate(4, acquisitionDate);
            stmt.setDate(5, acquisitionDate);
            stmt.setInt(6, span);
            stmt.setInt(7, maxWeight);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

package DAO;

import Model.GPS;
import Model.Plane;
import Model.Wincher;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
        return null;
    }
}

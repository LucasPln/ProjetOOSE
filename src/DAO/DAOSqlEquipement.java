package DAO;

import Model.Battery;

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
}

package DAO;

import Model.AbstractRole;
import Model.Licensed;
import Model.Monitor;
import Model.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * The type Monitor daosql.
 * @author ANDREU Paola
 */
public class MonitorDAOSQL implements MonitorDAO {
    @Override
    public boolean update(int idUser, String flightHour) {
        try {
            Connection con = FactoryDAOSQL.connection;
            Statement stmt=con.createStatement();
            int r = stmt.executeUpdate("UPDATE `monitor` SET `monitorFlightHour`=`"+flightHour+"` WHERE `idUser`="+idUser);
            if (r == 1){
                System.out.println("monitor modifié");
                return true;
            }else{
                System.out.println("monitor PAS modifié");
                return false;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    @Override
    public ArrayList<User> getAllMonitor() {
        ArrayList<User> monitors = new ArrayList<>();
        try {
            Connection con = FactoryDAOSQL.connection;
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from monitor,user where monitor.idUser=user.idUser ;");
            while(rs.next()){
                AbstractRole r = new Monitor(rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3));

                User user = new User(
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getString(13),
                        rs.getString(14)

                );

                user.setAbstractRole(r);

                monitors.add(user);
            }

            return monitors;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
}

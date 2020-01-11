package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class LicensedDAOSQL implements LicensedDAO {
    @Override
    public boolean update(int idUser, String flightHour) {
        try {
            Connection con = FactoryDAOSQL.connection;
            Statement stmt=con.createStatement();
            int r = stmt.executeUpdate("UPDATE `licensed` SET `flightHour`=`"+flightHour+"` WHERE `idUser`="+idUser);
            if (r == 1){
                System.out.println("licensed modifié");
                return true;
            }else{
                System.out.println("licensed PAS modifié");
                return false;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }
}

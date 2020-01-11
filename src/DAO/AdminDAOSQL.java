package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AdminDAOSQL implements AdminDAO {
    @Override
    public boolean update(int idUser, String dateAdmin) {
        try {
            Connection con = FactoryDAOSQL.connection;
            Statement stmt=con.createStatement();
            int r = stmt.executeUpdate("UPDATE `admin` SET AdminDate='"+dateAdmin+"'WHERE `idUser`="+idUser);
            if (r == 1){
                System.out.println("admin modifié");
                return true;
            }else{
                System.out.println("admin PAS modifié");
                return false;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }
}

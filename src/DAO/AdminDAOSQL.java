package DAO;

import Model.AbstractRole;
import Model.Admin;
import Model.Glider;
import Model.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * The type Admin daosql.
 */
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

    @Override
    public ArrayList<User> getAllAdmin() {
        ArrayList<User> admins = new ArrayList<>();
        try {
            Connection con = FactoryDAOSQL.connection;
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from admin,user where admin.idUser=user.idUser ;");
            while(rs.next()){
                AbstractRole r = new Admin(rs.getInt(1),
                        rs.getString(2));
                User user = new User(
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getString(13)

                );

                user.setAbstractRole(r);

                admins.add(user);
            }

            return admins;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }


}

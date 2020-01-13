package DAO;

import Model.AbstractRole;
import Model.CompanyMember;
import Model.Licensed;
import Model.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * The type Licensed daosql.
 * @author ANDREU Paola
 */
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

    @Override
    public ArrayList<User> getAllLicensed() {
        ArrayList<User> listLicensed = new ArrayList<>();
        try {
            Connection con = FactoryDAOSQL.connection;
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from licensed,user where licensed.idUser=user.idUser ;");
            while(rs.next()){
                AbstractRole r = new Licensed(rs.getInt(1),
                       rs.getInt(2));

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

                listLicensed.add(user);
            }

            return listLicensed;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
}

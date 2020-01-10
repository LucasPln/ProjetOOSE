package DAO;

import Model.*;
import java.sql.*;

public class UserDAOSQL implements UserDAO {


    @Override
    public User login(String login, String password,String role) {
        User user = null;
        try {
            Connection con = FactoryDAOSQL.connection;
            Statement stmt=con.createStatement();


            ResultSet rs=stmt.executeQuery("select * from user where login='"+login+"' and password='"+password+"';");


            while(rs.next()){
                user = new User(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10)
                );
                System.out.println("User créé");
            }
            AbstractRole abstractRole=null;
            Connection con2 = FactoryDAOSQL.connection;
            Statement stmt2=con2.createStatement();
            ResultSet rs2;
            if (role.equals("Monitor")){
                rs2=stmt2.executeQuery("select * from monitor where idUser='"+user.getId()+"' ;");
                while (rs2.next()){
                    abstractRole = new Monitor(rs2.getInt(1),rs2.getInt(2),rs2.getInt(3));
                }
            }else if (role.equals("Licensed")){
                rs2=stmt2.executeQuery("select * from licensed where idUser='"+user.getId()+"' ;");
                while (rs2.next()){
                    abstractRole = new Licensed(rs2.getInt(1),rs2.getInt(2));
                }

            }else{ //role.equals("Admin")
                rs2=stmt2.executeQuery("select * from admin where idUser='"+user.getId()+"' ;");
                while (rs2.next()){
                    abstractRole = new Admin(rs2.getInt(1),rs2.getString(2));
                }
            }
            user.setAbstractRole(abstractRole);
        } catch (SQLException e) {
        }

        return user;
    }

    @Override
    public boolean addUser() {
        return false;
    }


}

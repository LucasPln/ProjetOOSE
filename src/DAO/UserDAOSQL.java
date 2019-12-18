package DAO;

import Model.User;

import java.sql.*;

public class UserDAOSQL implements UserDAO {


    @Override
    public User login(String login, String password) {
        User user = null;
        try {
            Connection con = FactoryDAOSQL.connection;
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from user where login='"+login+"' and password='"+password+"';");


            while(rs.next()){
                user = new User(rs.getInt(1),rs.getString(2), rs.getString(3));
                System.out.println("User créé");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }
}
